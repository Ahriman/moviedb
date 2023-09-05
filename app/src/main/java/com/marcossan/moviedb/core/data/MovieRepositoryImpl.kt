package com.marcossan.moviedb.core.data

import com.marcossan.moviedb.core.data.mapper.toDomain
import com.marcossan.moviedb.core.data.remote.MovieApi
import com.marcossan.moviedb.core.domain.model.Movie
import com.marcossan.moviedb.core.domain.repository.MovieRepository

class MovieRepositoryImpl(
    val api: MovieApi
) : MovieRepository {
    override suspend fun getUpcomingMovies(): List<Movie> {
        return this.api.getUpcomingMovies().results.map { it.toDomain() }
    }
}