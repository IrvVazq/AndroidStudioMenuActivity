package com.example.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setOnClickListener {} para asignar funciones a los botones
        A_platillosbutton.setOnClickListener{
            //el intent se hace para acceder a otra actividad
            val intent = Intent(this , ActivityPlatillos::class.java)
            //startActivity(intent) para comenzar la actividad
            startActivity(intent)
        }
        A_bebidasbutton.setOnClickListener{
            val intent = Intent(this , ActivityBebidas::class.java)
            startActivity(intent)
        }
        A_postresbutton.setOnClickListener{
            val intent = Intent(this , ActivityPostres::class.java)
            startActivity(intent)
        }
    }
}