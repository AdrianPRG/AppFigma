package com.alopgal962.appfigma.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alopgal962.appfigma.menuabajo.Menuabajo
import com.alopgal962.appfigma.menuarriba.Menuarriba
import com.alopgal962.appfigma.ofertas.Ofertas


/*
fun Screenprincipal(){
    //Columna que contiene toda la pantalla
    Column(Modifier.fillMaxSize().background(color = Color.White)) {
        //Row que contiene el menu de arriba
        Row(modifier = Modifier.size(415.dp,100.dp)) {
            //Llamada a la funcion
            Menuarriba(textoABuscar = "")
        }
        //Columna que contiene el centro de la app
        Column(Modifier.padding(top = 30.dp)) {
            //LLamada a la seccion ofertas
            Ofertas(Modifier.size(100.dp,40.dp).padding(start = 10.dp))
        }
        //Row que contiene el menu de abajo
        Row(modifier = Modifier.padding(top = 580.dp).size(500.dp, 100.dp)) {
            //LLamada a la funcion
            Menuabajo()
        }
    }
}
 */
@Composable
fun hola(){}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screenprinci(){
    Scaffold(topBar = { Menuarriba(textoABuscar = "",modifier = Modifier.size(415.dp,100.dp))}, bottomBar = { Menuabajo(modifier = Modifier.size(415.dp,100.dp))}){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp, bottom = 100.dp)) {
        }
    }
}