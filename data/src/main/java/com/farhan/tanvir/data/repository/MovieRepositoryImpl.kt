package com.farhan.tanvir.data.repository

import com.farhan.tanvir.data.repository.dataSource.MovieLocalDataSource
import com.farhan.tanvir.data.repository.dataSource.MovieRemoteDataSource
import com.farhan.tanvir.domain.model.Movie
import com.farhan.tanvir.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
) :
    MovieRepository {
    override fun getPopularMovies() =
        movieRemoteDataSource.getPopularMovies()

    override fun getMoviesFromDB(movieId: Int): Flow<Movie> =
        movieLocalDataSource.getMoviesFromDB(movieId)
}