package com.example.maytinhnhom11_2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCong: Button = findViewById(R.id.btnAdd)
        btnCong.setOnClickListener {
            val so1: TextView = findViewById(R.id.etNumber1)
            val so2: TextView = findViewById(R.id.etNumber2)
            var a = so1.toString().toDouble()
            var b = so2.toString().toDouble()
            var c = a+b
            val resultText :TextView = findViewById(R.id.tvThongBao)
            resultText.text = c.toString()
        }
    }
}