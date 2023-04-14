package com.example.jobsearchonlinetortinchi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TanishtiruvOynasiIkkinchi : AppCompatActivity() {
    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanishtiruv_oynasi_ikkinchi)
        button1 = findViewById(R.id.button)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, TanishtiruvOynasiIkkinchi::class.java))
        }
    }
}