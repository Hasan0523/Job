package com.example.jobsearchonlinetortinchi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountOchish : AppCompatActivity() {
    private lateinit var button1 : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_ochish)
        button1 = findViewById(R.id.button)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, LoginToYourAccount::class.java))
        }
    }
}