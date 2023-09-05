package com.marcossan.moviedb.core.domain.repository

import com.marcossan.moviedb.core.domain.model.Movie

interface MovieRepository {
    suspend fun getUpcomingMovies(): List<Movie>
}