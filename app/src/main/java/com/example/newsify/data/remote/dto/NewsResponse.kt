package com.example.newsify.data.remote.dto

import com.example.newsify.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)