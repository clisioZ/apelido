package com.example.apelido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class PasarApellido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasar_apellido)

        val btn_pasar_apellido: Button = findViewById(R.id.btn_apellido)
        val dato_pasar: EditText = findViewById(R.id.txt_apellido)
        val dato = intent.getStringExtra("dato")

        btn_pasar_apellido.setOnClickListener {
            val dato_pasar = dato_pasar.text.toString()
            val intent = Intent(this, VerApellido::class.java).apply {
                putExtra("dato_pasar", dato_pasar)
                putExtra("dato", dato)
            }
            startActivity(intent)
        }
    }
}