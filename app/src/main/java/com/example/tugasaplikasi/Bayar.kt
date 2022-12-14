package com.example.tugasaplikasi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Bayar(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(fontSize = 24.sp, text = "Pembayaran\n")
        Text(fontSize = 10.sp, 
            text = "Silahkan Pilih Metode Pembayaran",
            modifier = Modifier.padding(20.dp)
        )
        Image(painter = painterResource(id = R.drawable.qrcode1), contentDescription = "QrCode")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            OutlinedButton(
                colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
                border = BorderStroke(0.dp, Color.Blue),
                onClick = { navController.navigate("Pilih") }) {
                Text(text = "BRI")
            }
            Spacer(modifier = Modifier.width(50.dp))
            OutlinedButton(
                colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
                border = BorderStroke(0.dp, Color.Blue),
                onClick = { navController.navigate("Pilih") }) {
                Text(text = "BCA")
            }
        }
        Box(modifier = Modifier
            .width(600.dp)
            .border(BorderStroke(width = 2.dp, color = Color.Blue))
            .background(color = Color.Transparent)
            .padding(5.dp)
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "No. Rekening Virtual (Diambil dari Database)",
                textAlign = TextAlign.Center
            )
        }
        Text(
            modifier = Modifier.fillMaxWidth().padding(20.dp),
            text = "Total bayar (Diambil dari Database)",
            textAlign = TextAlign.Center,
        )
        OutlinedButton(
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
            border = BorderStroke(0.dp, Color.Blue),
            onClick = { navController.navigate("Akhir") }) {
            Text(text = "Pay Now!")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BayarPre(){
    Bayar(rememberNavController())
}