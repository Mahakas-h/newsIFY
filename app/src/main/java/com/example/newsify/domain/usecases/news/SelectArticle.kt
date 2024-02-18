package com.example.newsify.domain.usecases.news

import com.example.newsify.data.local.NewsDao
import com.example.newsify.domain.model.Article
import com.example.newsify.domain.repository.NewsRepository

class SelectArticle (
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(url:String):Article?{
        return newsRepository.selectArticle(url)

    }
}