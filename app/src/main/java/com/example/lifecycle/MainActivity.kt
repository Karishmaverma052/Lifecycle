package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycle.ui.theme.LifecycleTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LifecycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
        Log.d("LifeCycle","onCreate() methode")
    }

    override fun onStart() {
        Log.d("LifeCycle","onCreate() methode")
        super.onStart()
    }
    override fun onRestart() {
        Log.d("LifeCycle","onCreate() methode")
        super.onRestart()
    }
    override fun onResume() {
        Log.d("LifeCycle","onCreate() methode")
        super.onResume()
    }
    override fun onPause() {
        Log.d("LifeCycle","onCreate() methode")
        super.onPause()
    }
    override fun onStop() {
        Log.d("LifeCycle","onCreate() methode")
        super.onStop()
    }
    override fun onDestroy() {
        Log.d("LifeCycle","onCreate() methode")
        super.onDestroy()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting( modifier: Modifier = Modifier) {
    val textState = remember { mutableStateOf("") }

    Box(modifier= Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = textState.value,
            onValueChange = { newValue ->
                textState.value = newValue
            },
            label = { Text("Enter value") } // You can add a label for the TextField
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleTheme {

    }
}