package com.example.coroutine.model

import com.example.coroutine.model.Article

data class Headlines(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)