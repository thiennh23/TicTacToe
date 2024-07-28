package com.thiennh23.tictactoe

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.draw
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiennh23.tictactoe.ui.theme.Aqua
import com.thiennh23.tictactoe.ui.theme.GreenishYellow

@Composable
fun CaroBoard() {

    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(10.dp),
        contentDescription = "This is the game board"
    ) {
        //First vertical line
        drawLine(
            color = Color.Gray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*1/3, y = 0f),
            end = Offset(x = size.width*1/3, y = size.height)
        )

        //Second vertical line
        drawLine(
            color = Color.Gray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*2/3, y = 0f),
            end = Offset(x = size.width*2/3, y = size.height)
        )

        //First horizontal line
        drawLine(
            color = Color.Gray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*1/3),
            end = Offset(x = size.width, y = size.height*1/3)
        )

        //Second horizontal line
        drawLine(
            color = Color.Gray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*2/3),
            end = Offset(x = size.width, y = size.height*2/3)
        )
    }
}

//Cross X
@Composable
fun Cross() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp),
        contentDescription = "Cross X"
    ) {
        drawLine(
            color = GreenishYellow,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height)
        )

        drawLine(
            color = GreenishYellow,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}

//Circle O
@Composable
fun Circle() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp),
        contentDescription = "Circle O"
    ) {
        drawCircle(
            color = Aqua,
            style = Stroke(width = 20f)
        )
    }
}

//Win cross (8 cases)

//Vertical
@Composable
fun WinVerticalLine1() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 1 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*1/3*1/2, y = 0f),
            end = Offset(x = size.width*1/3*1/2, y = size.height)
        )
    }
}

@Composable
fun WinVerticalLine2() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 2 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*2/3*3/4, y = 0f),
            end = Offset(x = size.width*2/3*3/4, y = size.height)
        )
    }
}

@Composable
fun WinVerticalLine3() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 3 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*5/6, y = 0f),
            end = Offset(x = size.width*5/6, y = size.height)
        )
    }
}

//WinHorizontalLine
@Composable
fun WinHorizontalLine1() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 4 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*1/3*1/2),
            end = Offset(x = size.width, y = size.height*1/3*1/2)
        )
    }
}

@Composable
fun WinHorizontalLine2() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 5 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*2/3*3/4),
            end = Offset(x = size.width, y = size.height*2/3*3/4)
        )
    }
}

@Composable
fun WinHorizontalLine3() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 6 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*5/6),
            end = Offset(x = size.width, y = size.height*5/6)
        )
    }
}

//DIAGONAL
@Composable
fun Diagonal1() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 7 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height)
        )
    }
}

@Composable
fun Diagonal2() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp),
        contentDescription = "Case 8 win"
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width, y = 0f),
            end = Offset(x = 0f, y = size.height)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun CaroBoardPrev() {
    CaroBoard()
    //Cross()
    //Circle()
    //WinVerticalLine1()
    //WinVerticalLine2()
    //WinVerticalLine3()

    //WinHorizontalLine1()
    //WinHorizontalLine2()
    //WinHorizontalLine3()

    //Diagonal1()
    //Diagonal2()
}