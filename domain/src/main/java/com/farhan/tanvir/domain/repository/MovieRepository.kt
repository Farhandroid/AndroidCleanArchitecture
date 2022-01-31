package com.farhan.tanvir.domain.repository
import com.farhan.tanvir.domain.model.MovieList
import com.farhan.tanvir.domain.util.Result
import kotlinx.coroutines.flow.Flow


interface MovieRepository {
     suspend fun getPopularMovies(): Result<MovieList>
}