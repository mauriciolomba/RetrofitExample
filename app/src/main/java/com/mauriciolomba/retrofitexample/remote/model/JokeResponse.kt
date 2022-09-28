package com.mauriciolomba.retrofitexample.remote.model

internal data class JokeResponse(
    val id: Int,
    val type: String,
    val setup: String,
    val punchline: String
)