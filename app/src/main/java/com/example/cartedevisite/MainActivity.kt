package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color(0xFFD2E8D4))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042))
        )
        Text(
            text = "Laurelle Simo",
            fontSize = 28.sp,
            modifier = Modifier.padding(top = 10.dp),
            color = Color(0xFF073042)
        )
        Text(
            text = "I'm a New Android Developer",
            modifier = Modifier.padding(top = 10.dp),
            color = Color(0xFF04945B),
            fontWeight = Bold
        )
    }
    Row(
        modifier = Modifier.padding(top = 150.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Column(Modifier.padding(bottom = 20.dp)) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = null,
                modifier = Modifier.padding(10.dp),
                tint = Color(0xFF073042)
            )
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = null,
                modifier = Modifier.padding(10.dp),
                tint = Color(0xFF073042)
            )
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = null,
                modifier = Modifier.padding(10.dp),
                tint = Color(0xFF073042)
            )
        }
        Column(Modifier.padding(bottom = 20.dp)) {
            Text(
                text = "+237 696 51 24 14",
                fontSize = 15.sp,
                modifier = Modifier.padding(10.dp),
                color = Color(0xFF073042)
            )
            Text(
                text = "@AndroidDev",
                fontSize = 15.sp,
                modifier = Modifier.padding(10.dp),
                color = Color(0xFF073042)
            )
            Text(
                text = "laridasimo@gmail.com",
                fontSize = 15.sp,
                modifier = Modifier.padding(10.dp),
                color = Color(0xFF073042)
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CarteDeVisiteTheme {
        Greeting("Android")
    }
}