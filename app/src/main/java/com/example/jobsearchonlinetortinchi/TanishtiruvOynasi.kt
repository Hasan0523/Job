package com.example.jobsearchonlinetortinchi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class TanishtiruvOynasi : AppCompatActivity() {
    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanishtiruv_oynasi)
        button1 = findViewById(R.id.button)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, TanishtiruvOynasiIkkinchi::class.java))
        }
    }
}