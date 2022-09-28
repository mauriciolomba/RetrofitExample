package com.mauriciolomba.retrofitexample.remote.api

import com.mauriciolomba.retrofitexample.remote.model.JokeResponse
import retrofit2.http.GET

internal interface JokeApi {

    @GET("/random_joke")
    suspend fun getRandomJoke(): JokeResponse

}