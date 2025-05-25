package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id = 1,
        title = "SHOW DO PALHAÇO CAÇAROLA",
        description = "MELHOR PALHAÇO DO BRASIL",
        date = "2024-12-15",
        location = "CASTELÃO",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        title = "Clube da Luta",
        description = "VENHA VER EU LUTANDO COMIGO MESMA",
        date = "2024-12-15",
        location = "MINHA GARAGEM",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 3,
        title = "Corrida NARUTO 2025",
        description = "dattebayo",
        date = "2025-12-15",
        location = "Beira-mar",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
)