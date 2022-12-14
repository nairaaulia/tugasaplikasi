package com.example.tugasaplikasi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Pilih(navController: NavController) {
    Box() {

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text( fontSize = 24.sp, text = "Pilihan Kamar\n")
        Image(painter = painterResource(id = R.drawable.singlebed1), contentDescription = null,
            modifier = Modifier.clickable { navController.navigate("Pesan") })
        Text( text = "Tipe Single (1 pax)"+"Rp."+"XXXXXXX",textAlign = TextAlign.Left, modifier = Modifier)
        Text(textAlign = TextAlign.Left, fontSize = 10.sp, text = "*1 Kasur Single")
        Image(painter = painterResource(id = R.drawable.doublebed1), contentDescription = null,
            modifier = Modifier.clickable { navController.navigate("Pesan") })
        Text( text = "Tipe Double (2 pax)"+"Rp."+"XXXXXXX",textAlign = TextAlign.Left, modifier = Modifier)
        Text(textAlign = TextAlign.Left, fontSize = 10.sp, text = "*1 Kasur Double & Dining Room")
        Image(painter = painterResource(id = R.drawable.familyroom), contentDescription = null,
            modifier = Modifier.clickable { navController.navigate("Pesan") })
        Text( text = "Tipe Family (4 pax)"+"Rp."+"XXXXXXX",textAlign = TextAlign.Left, modifier = Modifier)
        Text(textAlign = TextAlign.Left, fontSize = 10.sp, text = "*1 Kasur Double & 1 Kasur Single\n Kitchen + Dining Room")
    }
}


@Preview(showSystemUi = true)
@Composable
fun PilihPreview() {
    Pilih(rememberNavController())
}