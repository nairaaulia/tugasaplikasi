package com.example.tugasaplikasi

import androidx.compose.foundation.clickable
import kotlin.system.exitProcess
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Akhir(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.hotel_baru),
            contentDescription = "appName"
        )
        Image(painter = painterResource(id = R.drawable.thanks), contentDescription = "Thanks",
            modifier = Modifier.clickable { exitProcess(0) }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun AkhirPre(){
    Akhir(rememberNavController())
}