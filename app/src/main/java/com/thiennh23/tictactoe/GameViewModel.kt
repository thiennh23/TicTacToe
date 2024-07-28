package com.thiennh23.tictactoe

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    var state = mutableStateOf(GameState())


}