package com.example.jobsearchonlinetortinchi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//rasm remove.bg orqali orqa fondi olib tashlandi
class TanishtiruvOynasiUchinchi : AppCompatActivity() {
    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanishtiruv_oynasi_uchinchi)
        button1 = findViewById(R.id.button1)
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, AccountOchish::class.java))
        }
    }
}