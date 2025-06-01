package com.giraffe.tomjerryapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.giraffe.tomjerryapp.screens.JerryStoreScreen
import com.giraffe.tomjerryapp.screens.SecretEpisodes
import com.giraffe.tomjerryapp.screens.TomAccount
import com.giraffe.tomjerryapp.screens.TomKitchenScreen
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomJerryAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JerryStoreScreen(modifier = Modifier.padding(innerPadding))
                    //TomKitchenScreen(modifier = Modifier.padding(innerPadding))
                    //TomAccount(modifier = Modifier.padding(innerPadding))
                    //SecretEpisodes(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TomJerryAppTheme {
        Greeting("Android")
    }
}