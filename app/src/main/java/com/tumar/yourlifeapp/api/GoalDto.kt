package com.tumar.yourlifeapp.api

data class GoalDto(
    val title: String,
    val description: String,
    val startDate: String,
    val endDate: String,
    val status: String
)