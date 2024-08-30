package com.example.jetpack18.windowsizeclassviews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TopicsButton(){
    FlowRow (horizontalArrangement = Arrangement.spacedBy(5.dp)){
        val  topics = listOf("PHP","Kotlin","Swift","Python","Java","C#","Ruby","Scala")
        topics.forEach { topic->
            OutlinedButton(onClick = {}) {
                Text(text = topic)
            }
        }
    }
}

@Composable
fun MainButton(size: Dp = 200.dp){
    OutlinedButton(onClick = {},modifier = Modifier.width(size)) {
        Text(text = "Guardar")
    }
}