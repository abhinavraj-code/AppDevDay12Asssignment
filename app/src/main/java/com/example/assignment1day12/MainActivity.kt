package com.example.assignment1day12

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val btnlet=findViewById<Button>(R.id.let)

       btnlet.setOnClickListener {
           intent= Intent(applicationContext, knowledge::class.java)
           startActivity(intent)
       }
    }
}