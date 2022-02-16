package com.farhan.tanvir.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieList(
    @SerializedName("page")
    val page: Int = 1,
    @SerializedName("results")
    val movies: List<Movie>,
) : Serializable