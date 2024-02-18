package com.example.newsify.domain.usecases.news

import com.example.newsify.data.local.NewsDao
import com.example.newsify.domain.model.Article
import com.example.newsify.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SelectArticles (
    private val newsRepository: NewsRepository
) {
    operator fun invoke():Flow<List<Article>>{
        return newsRepository.selectArticles()

    }
}