package com.example.jetpack18.windowsizeclassviews

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp


@Composable
fun HomeSizeClass(windowSizeClass:WindowSizeClass){
    //Text(text = "Home")
    when(windowSizeClass.widthSizeClass){
        WindowWidthSizeClass.Expanded->{
            /*
            Text(
                text = "Tablet o telefono horizontal",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
                , textAlign = TextAlign.Center
            )

             */
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                ViewTablet()
                TopicsButton()
                MainButton(600.dp)
            }
        }

        
        //se ejectura este si el telefono es menor el tamano de pantalla a 6.46"
        WindowWidthSizeClass.Medium ->{
            //Text(text = "Tablet/Fold vertical", fontSize = 50.sp,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                ViewFold()
                TopicsButton()
                MainButton(300.dp)
            }
        }

        WindowWidthSizeClass.Compact ->{
            //Text(text = "Smartphone \nVertical", fontSize = 50.sp,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                ViewSmartphone()
                TopicsButton()
                MainButton()
            }

        }



    }

}
