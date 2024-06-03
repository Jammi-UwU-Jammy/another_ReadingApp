package com.vivich.starlitreadingapp.chapterText

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vivich.starlitreadingapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CTMain() {

    val scrollState = rememberScrollState()

    Scaffold(
        topBar = { TopBar()},
        bottomBar = {  },
        content = {
            Column(
                    Modifier
                        .padding(it)
                        .verticalScroll(scrollState)
            ){
                MainBodyText()
            }
        }
    )
}


@Composable
fun MainBodyText() {
    Text(
        modifier = Modifier.padding(20.dp, 10.dp),
        fontSize = 20.sp,
        text = stringResource(id = R.string.Book_text_placeholder)
    )
}


@Composable
@Preview
fun MainPreview() {
    CTMain()
}