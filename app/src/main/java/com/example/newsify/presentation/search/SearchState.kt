package com.example.newsify.presentation.search

import androidx.paging.PagingData
import com.example.newsify.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery:String="",
    val articles: Flow<PagingData<Article>>?=null
) {
}