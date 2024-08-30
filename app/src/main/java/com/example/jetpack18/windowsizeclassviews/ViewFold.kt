package com.example.jetpack18.windowsizeclassviews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ViewFold(){
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Icon(imageVector = Icons.Default.Person, contentDescription = "",modifier = Modifier.size(200.dp), tint = Color.Red)
        Text(text = "Username :", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Button(onClick = {}) {
            Text(text = "Entrar.")
        }
    }
}