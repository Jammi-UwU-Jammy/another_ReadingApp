package com.vivich.starlitreadingapp.bookInfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vivich.starlitreadingapp.MainActivity
import com.vivich.starlitreadingapp.R

@Composable
fun Main() {
    Scaffold(
        topBar = { TopBar()},
        bottomBar = { BottomBar() },
        content = {
            Column(
                Modifier.padding(it)
            ){
                Mainbody()
            }
        }
    )
}


@Composable
fun Mainbody() {
    Text(fontSize = 20.sp, text = stringResource(id = R.string.Book_text_placeholder))
}


@Composable
@Preview
fun MainPreview() {
    Main()
}