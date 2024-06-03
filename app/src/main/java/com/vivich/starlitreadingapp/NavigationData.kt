package com.vivich.starlitreadingapp

sealed class Screens(val route: String){
    data object Login: Screens("login")
    data object Lobby: Screens("lobby")
}

