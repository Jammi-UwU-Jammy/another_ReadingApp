package com.vivich.starlitreadingapp.ui.screens.lobby.bookContent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.vivich.starlitreadingapp.R

@Composable
fun BookContentScreen(
    paddingValues: PaddingValues = PaddingValues()
){
    val scrollState = rememberScrollState()

    Column(
        androidx.compose.ui.Modifier
            .padding(paddingValues=paddingValues)
            .verticalScroll(scrollState)
    ){
        Text(
            modifier = Modifier.padding(20.dp, 10.dp),
            fontSize = 20.sp,
            text = stringResource(id = R.string.Book_text_placeholder)
        )
    }
}