package com.example.basketballcounterapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basketballcounterapplication.ui.theme.BasketballCounterApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    MainScreen()
        }
    }
}
@Composable
fun MainScreen() {
    val teamA: MutableState<Int> = remember { mutableStateOf(0)}
    val teamB: MutableState<Int> = remember { mutableStateOf(0)}
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "TEAM A",
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(top = 50.dp)
                )
                Text(
                    text = teamA.value.toString(),
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(20.dp)
                )
                Button(onClick = {teamA.value++}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+1 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {teamA.value+=2}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+2 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {teamA.value+=3}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+3 Point", style = MaterialTheme.typography.h5)
                }
            }
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "TEAM B",
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(top = 50.dp)
                )
                Text(
                    text = teamB.value.toString(),
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(20.dp)
                )
                Button(onClick = { teamB.value++ }, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+1 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {teamB.value+=2 }, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+2 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {teamB.value+=3}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+3 Point", style = MaterialTheme.typography.h5)
                }
            }

        }
        OutlinedButton(onClick = { teamA.value = 0
        teamB.value = 0
        }) {
            Text(text = "RESET",style = MaterialTheme.typography.h5)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasketballCounterApplicationTheme {
        MainScreen()
    }
}