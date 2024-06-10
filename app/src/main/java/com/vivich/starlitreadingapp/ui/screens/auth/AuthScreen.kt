package com.vivich.starlitreadingapp.ui.screens.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AuthenticationScreen(
    onLogInClick: () -> Unit,
    onSignUpClick: () -> Unit
){
    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ){
            Button(onClick = onLogInClick) {
                Text(text = "Log in")
            }
            Button(onClick = onSignUpClick) {
                Text(text = "SignUp")
            }
        }
    }
}

@Composable
fun SignUpScreen() {
    Scaffold{
        Text(text = "Sign-up Screen")
    }
}
