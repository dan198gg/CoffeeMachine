package com.example.coffeemachine.coffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffeemachine.Coffee
import com.example.coffeemachine.R
import com.example.coffeemachine.ui.theme.firaSansFamily


var text by mutableStateOf("Выберите напиток")

var ingr by mutableStateOf("")


var pric by mutableStateOf("")

var coffee: Coffee? = null

fun onClickCoffee(coffe: Coffee) {
    coffee = coffe
    ingr = ""
    text = coffee!!.name()
    coffee!!.ingridients().forEach { ingr += "$it \n" }
    pric = coffee!!.price().toString()
}


@Composable
fun HomeScreen(navController: NavHostController) {


    Row() {
        Column(Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text,
                fontFamily = firaSansFamily,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                modifier = Modifier.weight(1f).padding(vertical = 40.dp)
            )
            Text(
                "Ингредиенты \n $ingr",
                fontFamily = firaSansFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 24.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                "Цена: $pric",
                fontFamily = firaSansFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 24.sp,
                modifier = Modifier.weight(1f)
            )



            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(15.dp)
            ) {
                Card(
                    modifier = Modifier.weight(1f),
                    colors = CardDefaults.cardColors(Color.DarkGray)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(0.7f)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Image(painterResource(R.drawable.raff), "", Modifier.fillMaxSize(1f))
                    }
                    Button(
                        onClick = {
                            onClickCoffee(Raff())
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                    ) {
                        Text("Рафф", fontSize = 28.sp)
                    }
                }

                Card(
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 10.dp), colors = CardDefaults.cardColors(Color.DarkGray)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(0.7f)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Image(painterResource(R.drawable.latte), "", Modifier.fillMaxSize(1f))
                    }
                    Button(
                        onClick = {
                            onClickCoffee(Latte())
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                    ) {
                        Text("Латте", fontSize = 28.sp)
                    }
                }

                Card(
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 10.dp), colors = CardDefaults.cardColors(Color.DarkGray)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(0.7f)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Image(painterResource(R.drawable.capuchino), "", Modifier.fillMaxSize(1f))
                    }
                    Button(
                        onClick = {
                            onClickCoffee(Capuchino())
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                    ) {
                        Text("Капучино", fontSize = 28.sp)
                    }
                }
            }
        }
    }
}

    
