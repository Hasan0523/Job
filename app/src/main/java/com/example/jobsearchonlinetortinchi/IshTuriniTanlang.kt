package com.example.jobsearchonlinetortinchi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IshTuriniTanlang : AppCompatActivity() {
    private lateinit var button1 : Button
    private lateinit var button2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ish_turini_tanlang)
        button1 = findViewById(R.id.button)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, Mutaxassislik::class.java))
            button2 = findViewById(R.id.button1)
            button2.setOnClickListener {
                startActivity(Intent(applicationContext, IshchiMutaxassisligi::class.java))
            }
        }
    }
}