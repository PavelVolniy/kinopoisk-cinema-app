package com.example.kinopoiskcinemaapp.entity.staff

data class StaffItem(
    val description: String,
    val nameEn: String,
    val nameRu: String,
    val posterUrl: String,
    val professionKey: String,
    val professionText: String,
    val staffId: Int
)