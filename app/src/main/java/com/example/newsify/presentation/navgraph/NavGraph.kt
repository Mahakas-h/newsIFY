package com.example.newsify.presentation.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.newsify.presentation.bookmark.BookmarkScreen
import com.example.newsify.presentation.bookmark.BookmarkViewModel
import com.example.newsify.presentation.news_navigator.NewsNavigator
import com.example.newsify.presentation.onboarding.OnBoardingScreen
import com.example.newsify.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination:String
){
    val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination){
        navigation(
            route=Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route=Route.OnBoardingScreen.route
            ){
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }
        navigation(
            route=Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ){
            composable(
                route = Route.NewsNavigatorScreen.route
            ){
//                val viewModel:HomeViewModel= hiltViewModel()
//                val articles=viewModel.news.collectAsLazyPagingItems()
//
//
//                HomeScreen(articles =articles , navigate = {})
//                val searchViewModel:SearchViewModel= hiltViewModel()
//                SearchScreen(state =searchViewModel.state.value , event = searchViewModel::onEvent , navigate ={} )
//                val bookmarkViewModel:BookmarkViewModel= hiltViewModel()
//                BookmarkScreen(state = bookmarkViewModel.state.value, navigateToDetails = {})
                NewsNavigator()


            }
        }
    }
}