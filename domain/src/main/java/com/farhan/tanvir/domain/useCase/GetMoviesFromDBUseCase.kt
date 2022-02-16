package com.farhan.tanvir.domain.useCase

import com.farhan.tanvir.domain.repository.MovieRepository


class GetMoviesFromDBUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke(movieID: Int) = movieRepository.getMoviesFromDB(movieID)
}