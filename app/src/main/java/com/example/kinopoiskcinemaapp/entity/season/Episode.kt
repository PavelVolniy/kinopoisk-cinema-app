package com.example.kinopoiskcinemaapp.entity.season

data class Episode(
    val seasonNumber: Int,
    val episodeNumber: Int,
    val nameRu: String,
    val nameEn: String,
    val synopsis: String,
    val releaseDate: String
)