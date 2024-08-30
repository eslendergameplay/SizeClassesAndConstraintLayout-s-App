package com.example.jetpack18.windowsizeclassviews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun ViewTablet(){
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
        Icon(imageVector = Icons.Default.Person, contentDescription = "",tint = Color.Green,modifier = Modifier.size(200.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Username :", fontSize = 50.sp, fontWeight = FontWeight.Bold)
            Button(onClick = {}) {
                Text(text = "Entrar.")
            }
        }
    }
}