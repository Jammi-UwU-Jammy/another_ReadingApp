package com.vivich.starlitreadingapp.bookInfo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BIBottomBar() {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = Color.Transparent
    ){
        NavigationBarItem(selected = false,
            modifier = Modifier
                .padding(20.dp, 20.dp)
                .background(Color.Black),
            onClick = { /*TODO*/ },
            icon = { Text(text = "Start Reading", color = Color.White) }
        )
    }
}


@Composable
@Preview
fun BIBottomBarPreview() {
    BIBottomBar()
}