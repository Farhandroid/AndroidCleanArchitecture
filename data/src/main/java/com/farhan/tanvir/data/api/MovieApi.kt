package com.farhan.tanvir.data.api

import com.farhan.tanvir.domain.model.MovieList
import com.farhan.tanvir.domain.util.Result
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<MovieList>
}