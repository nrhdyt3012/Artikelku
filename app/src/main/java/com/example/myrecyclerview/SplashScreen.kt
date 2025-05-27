package com.example.myrecyclerview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myrecyclerview.MainActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash_screen)
       Handler(Looper.getMainLooper()).postDelayed({
           goToActivityMain()
       },2000L
       )
    }
    private fun goToActivityMain() {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}