package com.vishnevskiypro.rabbitsrest.data

import retrofit2.http.GET

interface RabbitsApi {

    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object{
        const val BASE_URL = "http://192.168.0.111:8100"
    }

}