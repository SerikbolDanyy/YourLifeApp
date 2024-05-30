package com.tumar.yourlifeapp.api

import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {
    @POST("/api/users/register")
    fun registerUser(@Body user: UserDto): Call<Void>

    @POST("/api/users/login")
    fun loginUser(@Body user: UserDto): Call<Void>

    @GET("/api/goals")
    fun getGoals(): Call<List<GoalDto>>
}