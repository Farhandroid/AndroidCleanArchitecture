package com.farhan.tanvir.data.repository.dataSource

import androidx.paging.PagingData
import com.farhan.tanvir.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRemoteDataSource {
     fun getPopularMovies(): Flow<PagingData<Movie>>
}