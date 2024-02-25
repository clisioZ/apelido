package com.example.apelido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciar : Button = findViewById(R.id.btn_iniciar)
        val dato : EditText = findViewById(R.id.txt_dato)

        iniciar.setOnClickListener {
            val dato = dato.text.toString()
            val intent = Intent(this, PasarApellido::class.java).apply {
                putExtra("dato", dato)
            }
            startActivity(intent)
        }
    }
}
























