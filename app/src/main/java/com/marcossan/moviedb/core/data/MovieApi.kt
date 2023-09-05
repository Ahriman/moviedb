package com.marcossan.moviedb.core.data

interface MovieApi {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/account/{account_id}/lists"
    }
}