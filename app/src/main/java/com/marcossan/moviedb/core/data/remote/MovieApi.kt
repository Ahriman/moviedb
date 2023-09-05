package com.marcossan.moviedb.core.data.remote

import com.marcossan.moviedb.core.data.dto.MovieDtoResponse
import retrofit2.http.GET

interface MovieApi {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
    }

    @GET("movie/upcoming") // TODO: Pagination ?page=1
    suspend fun getUpcomingMovies(): MovieDtoResponse
}