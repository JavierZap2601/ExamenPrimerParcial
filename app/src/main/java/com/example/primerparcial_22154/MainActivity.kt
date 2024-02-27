package com.example.primerparcial_22154

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerparcial_22154.ui.theme.PrimerParcial_22154Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerParcial_22154Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Ajedrez()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ajedrez(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(50.dp)){
        Row(modifier = Modifier
            .height(400.dp)
            .width(400.dp)
        ){
            Column(modifier = Modifier){
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){
                    Image(
                        painter = painterResource(id = R.drawable.black_rook),
                        contentDescription = "Imagen de Prueba",
                        modifier = Modifier
                            .size(180.dp),
                        contentScale = ContentScale.Crop)
                }
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
            }
        }
        Row(modifier = Modifier
            .height(400.dp)
            .width(400.dp)
            .padding(50.dp)
        ){
            Column(modifier = Modifier){
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
            }
        }
        Row(modifier = Modifier
            .height(400.dp)
            .width(400.dp)
            .padding(100.dp)
        ){
            Column(modifier = Modifier){
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color(0xFF69B00B)
                    )
                ){}
                Box(modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
                    .background(
                        Color( 0xFFFFE4C4)
                    )
                ){}
            }
        }
    }

    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Spacer(modifier = Modifier.height(15.dp))
        Text(text="Anatholy Kasparov vs Kary Kasparov", modifier=Modifier.align(CenterHorizontally))
        Text(text="Rusia 1993", modifier=Modifier.align(CenterHorizontally))
    }
    Spacer(modifier = Modifier.height(50.dp)
        .padding(start=10.dp))
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp),
            verticalAlignment = Alignment.CenterVertically){
        Button(onClick={

    }){
        Text(text = "Jugar Blancas")
    }
        Button(onClick={

        }){
            Text(text = "Jugar Negras")
        }
    }
    Row(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .padding(30.dp),
        verticalAlignment = Alignment.CenterVertically){
        Button(onClick={
        }){
            Text(text = "Reiniciar")
        }
    }
}

@Composable
fun GreetingPreview() {
    PrimerParcial_22154Theme {
        Ajedrez()
    }
}