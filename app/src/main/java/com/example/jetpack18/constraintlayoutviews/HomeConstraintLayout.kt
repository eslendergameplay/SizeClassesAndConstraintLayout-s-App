package com.example.jetpack18.constraintlayoutviews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun HomeConstraintLayout(windowSizeClass: WindowSizeClass){
    ConstraintLayout (modifier = Modifier.fillMaxSize()){
        val (cardRed,cardBlue,cardGreen,cardCyan,cardYellow) = createRefs()
        //0.1es 10% en compact vertical para landscape el 270.dp
        val startGuideCompact = createGuidelineFromStart(0.2f)
        val startGuideExpand = createGuidelineFromStart(240.dp)
        Box (modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
            .constrainAs(cardRed) {
                top.linkTo(cardBlue.top)
                start.linkTo(cardBlue.end, margin = 50.dp)
            })
        Box(modifier = Modifier.size(100.dp).background(Color.Blue).constrainAs(cardBlue){

            top.linkTo(cardCyan.bottom, margin = 20.dp)
            when(windowSizeClass.widthSizeClass){
                WindowWidthSizeClass.Compact->{
                    start.linkTo(startGuideCompact)
                }
                WindowWidthSizeClass.Expanded->{
                    start.linkTo(startGuideExpand)
                }
                else->{
                    start.linkTo(startGuideExpand)

                }
            }
            /*
            when(windowSizeClass.widthSizeClass){
                WindowWidthSizeClass.Compact->{
                    start.linkTo(startGuide)
                }
                WindowWidthSizeClass.Expanded->{
                    start.linkTo(startGuideExpand)
                }
            }
            si no esta el when
            top.linkTo(cardYellow.bottom, margin = 20.dp)
            start.linkTo(cardYellow.start,margin = (-70).dp)


             */
        })
        Box(modifier = Modifier.size(100.dp).background(Color.Green).constrainAs(cardGreen){
            top.linkTo(cardYellow.top)
            start.linkTo(parent.start)
            /*
            si no estan el when
            start.linkTo(parent.start,margin = 15.dp)
            si esta este
            start.linkTo(parent.start)
             */

        })
        Box(modifier = Modifier.size(100.dp).background(Color.Cyan).constrainAs(cardCyan){
            top.linkTo(cardYellow.top)
            end.linkTo(parent.end)
            //si esta el horizontal chain no si no end.linkTo(parent.end,margin = 15.dp)
        })
        Box(modifier = Modifier.size(100.dp).background(Color.Yellow).constrainAs(cardYellow){
            bottom.linkTo(parent.bottom)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
        })
        createHorizontalChain(cardCyan,cardYellow,cardGreen, chainStyle = ChainStyle.Spread)
        /*
        ChainStyle.Packed Todo Junto
        ChainStyle.Spread mismo espacio
        ChainStyle.SpreadInside Todo alejado
        createVerticalChain() la variante vertical dela cadena
         */

    }
}