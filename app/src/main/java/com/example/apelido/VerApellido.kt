package com.example.apelido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class VerApellido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_apellido)

        val dato_recibido = intent.getStringExtra("dato_pasar")
        val dato_recibido_mostrar = intent.getStringExtra("dato")

        val ver_ap : TextView = findViewById(R.id.txt_mostrar)
        ver_ap.text = "Nombre es: $dato_recibido_mostrar , Apellido es: $dato_recibido"
    }
}