package com.example.eventsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.eventsapp.model.Event
import com.example.eventsapp.ui.theme.EventsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EventsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EventsScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun EventsScreen(modifier: Modifier) {

}

@Composable
fun EventItem(event: Event) {

}