package com.example.bookinguru.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bookinguru.MainActivity
import com.example.bookinguru.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Splash()
            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(3500)
                startActivity(Intent( this@SplashScreen,MainActivity::class.java))
                finish()

            }

        }
    }
}
@Preview
@Composable
private fun Splash() {


    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .paint(
                painterResource(id = R.drawable.back7),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {


        //centering an image
        //IMAGE


        Image(
            painter = painterResource(id = R.drawable.p4),
            contentDescription = "footy",
            modifier = Modifier
                .size(500.dp)
                .clip(shape = RectangleShape),
            contentScale = ContentScale.Crop

        )


        //END OF IMAGE

        Spacer(modifier = Modifier.height(10.dp))


        Row {
            Column {
                //text
                Text(
                    modifier = Modifier.padding(start = 50.dp),
                    text = "Welcome to Bookinguru",
                    fontSize = 42.sp,


                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(10.dp))


            }
            Spacer(modifier = Modifier.width(40.dp))

        }

        Row {
            Text(
                modifier = Modifier.padding(start = 20.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Normal,
                text = "“\uD83C\uDF1FStep inside and unlock a world of convenience with our booking app... \uD83C\uDF1F” ",
                textAlign = TextAlign.Left,
            )
        }

    }
}