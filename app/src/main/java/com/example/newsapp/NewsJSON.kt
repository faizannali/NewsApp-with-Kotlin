package com.example.newsapp

data class NewsJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)
