package com.vivich.starlitreadingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.vivich.starlitreadingapp.bookInfo.BIMain
import com.vivich.starlitreadingapp.chapterText.CTMain
import com.vivich.starlitreadingapp.lobby.LBMainBody
import com.vivich.starlitreadingapp.ui.theme.StarlitReadingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarlitReadingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    LBMainBody()
//    BIMain()
    CTMain()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StarlitReadingAppTheme {
        Greeting("Android")
    }
}