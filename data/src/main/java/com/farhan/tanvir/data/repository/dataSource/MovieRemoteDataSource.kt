package com.farhan.tanvir.data.repository.dataSource

import com.farhan.tanvir.domain.model.MovieList
import com.farhan.tanvir.domain.util.Result
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getPopularMovies(): Response<MovieList>
}