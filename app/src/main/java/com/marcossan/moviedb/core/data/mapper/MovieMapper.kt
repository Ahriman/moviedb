package com.marcossan.moviedb.core.data.mapper

import com.marcossan.moviedb.core.data.dto.MovieResult
import com.marcossan.moviedb.core.data.remote.MovieApi
import com.marcossan.moviedb.core.domain.model.Movie

fun MovieResult.toDomain(): Movie {
    return Movie(
        description = this.overview,
        title = this.title,
        releaseYear = this.releaseDate.substring(0, 4).toInt(),
        language = this.originalLanguage,
        rating = this.voteAverage,
        poster = MovieApi.BASE_URL + this.posterPath,
        genres = this.genreIds
    )
}