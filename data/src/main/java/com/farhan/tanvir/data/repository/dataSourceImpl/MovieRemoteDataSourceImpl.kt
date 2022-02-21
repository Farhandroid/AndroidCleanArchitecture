package com.farhan.tanvir.data.repository.dataSourceImpl

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.farhan.tanvir.data.api.MovieApi
import com.farhan.tanvir.data.db.MovieDB
import com.farhan.tanvir.data.paging.MovieRemoteMediator
import com.farhan.tanvir.data.repository.dataSource.MovieRemoteDataSource
import com.farhan.tanvir.domain.model.Movie
import kotlinx.coroutines.flow.Flow


class MovieRemoteDataSourceImpl(private val movieApi: MovieApi, private val movieDB: MovieDB) :
    MovieRemoteDataSource {
    private val movieDao = movieDB.movieDao()

    @OptIn(ExperimentalPagingApi::class)
    override  fun getPopularMovies() : Flow<PagingData<Movie>> {
        val pagingSourceFactory = { movieDao.getAllMovies() }
        return Pager(
            config = PagingConfig(pageSize = 20),
            remoteMediator = MovieRemoteMediator(
                movieApi,
                movieDB
            ),
            pagingSourceFactory = pagingSourceFactory,
        ).flow
    }
}