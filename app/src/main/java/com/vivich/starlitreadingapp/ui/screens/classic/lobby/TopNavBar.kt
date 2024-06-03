package com.vivich.starlitreadingapp.ui.screens.classic.lobby
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
//    modifier: Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TopAppBar(
            modifier = Modifier.padding(PaddingValues(top=30.dp)),
            title = {
                Column{
                    Text(text = "Hi Miri!")
                    Text(text = "Find your best book", fontSize = 12.sp)
                }
            },
            actions = {
                IconButton(onClick = {  }) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = "")
                }
            }
        )
        Categories()
        SearchAction(Modifier)
    }
}

@Composable
fun Categories() {
    Row(
        modifier = Modifier.padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Starlit")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Community")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Classic")
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchAction(
    modifier: Modifier
){
    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(false) }

    SearchBar(
        modifier = modifier.fillMaxWidth(.8f),
        placeholder = {
            Row {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Searchbar",
                    Modifier.alpha(0.3f)
                )
                Text(text = "Search", Modifier.alpha(0.3f))
            }
        },
        query = text,
        onQueryChange = { text = it },
        onSearch = { active = false },
        active = active,
        onActiveChange = {
            active = it
        }
    ) {
        // Search result shown when active
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(4) { idx ->
                // Search result

            }
        }

    }
}

@Composable
@Preview
fun TopBarPreview(){
    val mod = Modifier.padding(10.dp, 10.dp, 10.dp, 0.dp)
    TopBar()
}