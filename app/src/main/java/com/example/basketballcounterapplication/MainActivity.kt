package com.example.basketballcounterapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun MainScreen(viewModel: MainViewModel = MainViewModel()) {
   val teamA: Int = 0
    val teamB: Int = 0
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
                    text = teamA.toString(),
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(20.dp)
                )
                Button(onClick = {viewModel.triggerA(1, 1)}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+1 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {viewModel.triggerA(2, 1)}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+2 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {viewModel.triggerA(3, 1)}, modifier = Modifier.padding(20.dp)) {
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
                    text = teamB.toString(),
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(20.dp)
                )
                Button(onClick = { viewModel.triggerA(1, 2) }, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+1 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {viewModel.triggerA(2, 2)}, modifier = Modifier.padding(20.dp)) {
                    Text(text = "+2 Point", style = MaterialTheme.typography.h5)
                }
                Button(onClick = {viewModel.triggerA(3, 2)}, modifier = Modifier.padding(20.dp)) {
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