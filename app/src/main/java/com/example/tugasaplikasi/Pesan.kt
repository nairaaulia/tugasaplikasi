package com.example.tugasaplikasi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Pesan(navController: NavController){
    var input1 by rememberSaveable { mutableStateOf("") }
    var input2 by rememberSaveable { mutableStateOf("") }
    var input3 by rememberSaveable { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(fontSize = 24.sp, text = "Form Pemesanan\n")
        OutlinedTextField(
            value = input1,
            onValueChange = { newText ->
                input1 = newText.trimStart { it == '0' }
            },
            label = { Text("Nama Pemesan")},
            modifier = Modifier.padding(20.dp),
            singleLine = true
        )
        OutlinedTextField(
            value = input2,
            onValueChange = { newText ->
                input2 = newText.trimStart { it == '0' }
            },
            label = { Text("Nomer Telepon")},
            modifier = Modifier.paddingFromBaseline(top = 0.dp, bottom = 20.dp),
            singleLine = true
        )
        Text(textAlign = TextAlign.Left,
            text = "Tipe Kamar =" + "   "+ "Mengambil dari Database",
            modifier = Modifier.padding(20.dp)
        )
        Text(textAlign = TextAlign.Left,
            text = "Harga =" + "   "+ "Mengambil dari Database",
            modifier = Modifier.paddingFromBaseline(top = 0.dp, bottom = 20.dp)
        )
        TextField(
            value = input3,
            onValueChange = { newText ->
                input3 = newText.trimStart { it == '0' }
            },
            label = { Text("Jumlah Malam")},
            modifier = Modifier.width(200.dp),
            textStyle = TextStyle(textAlign = TextAlign.Center),
            singleLine = true
        )
        OutlinedButton(
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
            border = BorderStroke(0.dp, Color.Blue),
            onClick = { navController.navigate("Bayar") },
            modifier = Modifier
                .width(250.dp)
                .padding(20.dp)
                .height(50.dp)
        ) {
            Text(text = "Book Now!")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PesanPre(){
    Pesan(rememberNavController())
}