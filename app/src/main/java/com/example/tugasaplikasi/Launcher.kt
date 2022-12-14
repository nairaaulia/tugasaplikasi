package com.example.tugasaplikasi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Launcher(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.hotel_baru), contentDescription = "appName")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
            border = BorderStroke(0.dp, Color.Blue),
            onClick = { navController.navigate("Pilih") }) {
            Text(text = "Check In!")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LauncherPre(){
    Launcher(rememberNavController())
}