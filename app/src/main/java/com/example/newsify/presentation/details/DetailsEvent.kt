package com.example.newsify.presentation.details

import com.example.newsify.domain.model.Article

sealed class DetailsEvent {

    data class UpsertDeleteArticle(val article: Article):DetailsEvent()
    object RemoveSideEffect:DetailsEvent()




}