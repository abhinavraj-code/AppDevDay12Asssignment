package com.example.assignment1day12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class knowledge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)

        supportActionBar?.hide()

        val btncall= findViewById<Button>(R.id.callus)
        //implicit intent use for making phone call

        btncall.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:123456789")
            startActivity(intent)
        }
        val btncard= findViewById<CardView>(R.id.card1)

        btncard.setOnClickListener {
            intent=Intent(applicationContext, AppDev::class.java)
            startActivity(intent)
        }
    }
}