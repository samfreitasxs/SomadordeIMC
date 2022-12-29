package com.example.somador2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {

            val peso = edtPeso.text.toString().toDouble()
            val altura = edtAltura.text.toString().toDouble()

            val resultado = peso / (altura * altura)

            tvresultado.text = "Seu IMC e $resultado"


        }

    }
}