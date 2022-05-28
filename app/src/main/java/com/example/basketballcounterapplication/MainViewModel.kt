package com.example.basketballcounterapplication

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class MainViewModel (): ViewModel(){
    val stateTeamA: MutableState<Int> = mutableStateOf(0)`
    val stateTeamB: MutableState<Int> = mutableStateOf(0)
     fun triggerA(points : Int, team: Int){
        if(points == 1 && team == 1)
            stateTeamA.value++
        else if(points == 2 && team == 1)
            stateTeamA.value+=2
        else if(points  == 3 && team == 1)
            stateTeamA.value+=3
        else if(points == 1 && team == 2)
            stateTeamB.value++
        else if(points == 2 && team == 2)
            stateTeamB.value+=2
        else if(points  == 3 && team == 2)
            stateTeamB.value+=3

    }
}