package com.example.whatsappclone_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import com.example.whatsappclone_kotlin.databinding.ActivitySplashBinding


private lateinit var binding: ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        val intent = Intent(this, LoginActivity::class.java)
        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, 2500)
    }
}