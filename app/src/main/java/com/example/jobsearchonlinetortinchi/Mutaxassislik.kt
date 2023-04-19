package com.example.jobsearchonlinetortinchi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mutaxassislik : AppCompatActivity() {
    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mutaxassislik)
        button1 = findViewById(R.id.button2)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, ShaxsiyMalumotingizniKiriting::class.java))
        }
    }
}