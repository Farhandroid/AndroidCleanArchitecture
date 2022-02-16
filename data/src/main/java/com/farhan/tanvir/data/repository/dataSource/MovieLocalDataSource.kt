package com.farhan.tanvir.data.repository.dataSource
import androidx.paging.PagingSource
import com.farhan.tanvir.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieLocalDataSource {
    fun getMoviesFromDB(movieId : Int): Flow<Movie>
}