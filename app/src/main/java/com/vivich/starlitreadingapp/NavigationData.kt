package com.vivich.starlitreadingapp

sealed class Routes(val route: String){
    data object Login: Routes("login")
    data object Lobby: Routes("lobby")
}

object Graph{
    const val ROOT = "root_graph"
    const val AUTH = "auth_graph"
    const val LOBBY = "lobby_graph"
    const val BOOK_DETAILS = "book_details_graph"
}

sealed class AuthScreen(val route: String){
    data object  Login : AuthScreen(route = "LOGIN")
    data object  SignUp : AuthScreen(route = "SIGN_UP")
    data object  Forgot : AuthScreen(route = "FORGOT")

}

sealed class BookDetailsScreen(val route: String){
    data object  Information : AuthScreen(route = "INFORMATION")
    data object  Overview : AuthScreen(route = "OVERVIEW")
    data object  Relevant : AuthScreen(route = "RELEVANT")

}