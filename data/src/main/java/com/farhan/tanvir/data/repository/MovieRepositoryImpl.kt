package com.farhan.tanvir.data.repository

import com.farhan.tanvir.data.repository.dataSource.MovieRemoteDataSource
import com.farhan.tanvir.domain.model.MovieList
import com.farhan.tanvir.domain.repository.MovieRepository
import com.farhan.tanvir.domain.util.Result
import retrofit2.Response

class MovieRepositoryImpl(private val movieRemoteDataSource: MovieRemoteDataSource) :
    MovieRepository {
    override suspend fun getPopularMovies() = responseToRequest(movieRemoteDataSource.getPopularMovies())

    private fun responseToRequest(response: Response<MovieList>):Result<MovieList>{
        if(response.isSuccessful){
            response.body()?.let {result->
                return Result.Success(result)
            }
        }
        return Result.Error(response.message())
    }
}