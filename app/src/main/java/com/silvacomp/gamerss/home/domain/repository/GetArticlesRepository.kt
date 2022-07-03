package com.silvacomp.gamerss.home.domain.repository

interface GetArticlesRepository {
    suspend fun getArticles(url:String)
}