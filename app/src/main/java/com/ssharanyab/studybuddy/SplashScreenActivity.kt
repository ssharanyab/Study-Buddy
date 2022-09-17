package com.ssharanyab.studybuddy

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler: Handler = Handler()
        handler.postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
                            },3000)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.max =1000
        val currentProgress  =1000
        ObjectAnimator.ofInt(progressBar,"progress",currentProgress).setDuration(3000).start()



    }
}