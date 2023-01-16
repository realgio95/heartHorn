package com.dappatech.hearthorn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.concurrent.Executors

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val intent = Intent(this, MainActivity::class.java)
        val delay: Long = 3000 // 3 seconds
        val executor = Executors.newSingleThreadExecutor()
        executor.execute {
            Thread.sleep(delay)
            runOnUiThread {
                startActivity(intent)
                finish()
            }
        }
    }
}