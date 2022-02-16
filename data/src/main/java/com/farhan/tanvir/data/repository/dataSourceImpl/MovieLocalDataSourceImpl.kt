package com.farhan.tanvir.data.repository.dataSourceImpl

import com.farhan.tanvir.data.db.MovieDao
import com.farhan.tanvir.data.repository.dataSource.MovieLocalDataSource
import com.farhan.tanvir.domain.model.Movie
import kotlinx.coroutines.flow.Flow


class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    override fun getMoviesFromDB(movieId: Int): Flow<Movie> = movieDao.getMovie(movieId)
}