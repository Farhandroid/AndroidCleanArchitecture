package com.farhan.tanvir.domain.repository

import androidx.paging.PagingData
import com.farhan.tanvir.domain.model.Movie
import kotlinx.coroutines.flow.Flow


interface MovieRepository {
    fun getPopularMovies(): Flow<PagingData<Movie>>
    fun getMoviesFromDB(movieId: Int): Flow<Movie>
}