package com.farhan.tanvir.data.repository.dataSourceImpl

import com.farhan.tanvir.data.BuildConfig
import com.farhan.tanvir.data.api.MovieApi
import com.farhan.tanvir.data.repository.dataSource.MovieRemoteDataSource

class MovieRemoteDataSourceImpl(private val movieApi: MovieApi):MovieRemoteDataSource {
    override suspend fun getPopularMovies()= movieApi.getPopularMovies(BuildConfig.API_KEY)

}