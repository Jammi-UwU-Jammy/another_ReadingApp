package com.vivich.starlitreadingapp.ui.screens.lobby.bookContent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BookContentBottomBar(
) {
    val showBottomSheet by remember { mutableStateOf(true) }

//    val sheetState = rememberModalBottomSheetState()
//    if (showBottomSheet) {
//        ModalBottomSheet(
//            onDismissRequest = {},
//            sheetState = sheetState
//        ) {
//            Column(
//                modifier = Modifier.padding(20.dp, 20.dp)
//            ){
//                Row(
//                    horizontalArrangement = Arrangement.Center,
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(imageVector = Icons.Default.KeyboardArrowUp, contentDescription = "")
//                    }
//                    Text(text = "Aa")
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = "")
//                    }
//                }
//                Row(
//                    horizontalArrangement = Arrangement.Center,
//                ){
//                    Button(
//                        onClick = { /*TODO*/ },
//                        modifier = Modifier.fillMaxWidth()
//                    ) {
//                        Icon(imageVector = Icons.Rounded.Edit, contentDescription = "")
//                        Text(text = "Font Family")
//                    }
//                }
//            }
//
//        }
//    }
}

@Preview
@Composable
fun BottomBarPreview() {
    BookContentBottomBar()
}