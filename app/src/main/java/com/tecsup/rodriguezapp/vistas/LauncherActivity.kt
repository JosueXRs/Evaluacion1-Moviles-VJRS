package com.tecsup.rodriguezapp.vistas

import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.rodriguezapp.R

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val actionBar = supportActionBar
        actionBar?.hide()

        Handler(Looper.getMainLooper()).
        postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 3000)
    }
}