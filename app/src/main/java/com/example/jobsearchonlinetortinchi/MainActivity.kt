package com.example.jobsearchonlinetortinchi
//Bu Splash Oynasi
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val handler= Handler(Looper.getMainLooper())
        handler .postDelayed({
            val intent = Intent(this, TanishtiruvOynasi :: class.java)
            startActivity(intent)
            finish()
        },1800)
    }
}