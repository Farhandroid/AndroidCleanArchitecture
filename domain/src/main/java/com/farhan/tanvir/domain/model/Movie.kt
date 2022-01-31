package com.farhan.tanvir.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Movie(
    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("vote_average")
    val rating: String?
) : Serializable