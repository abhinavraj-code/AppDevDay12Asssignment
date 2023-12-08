package com.example.assignment1day12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AppDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_dev)

        supportActionBar?.hide()
    }
}