package com.example.newsify.domain.usecases.news

import com.example.newsify.data.local.NewsDao
import com.example.newsify.domain.model.Article
import com.example.newsify.domain.repository.NewsRepository

class DeleteArticle (
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(article: Article){
        newsRepository.deleteArticle(article)

    }
}