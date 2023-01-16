package com.dappatech.hearthorn

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dappatech.hearthorn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        val hornSound = MediaPlayer.create(this, R.raw.horn)

        binding.hornImage.setOnClickListener {
            it.isPressed = true
            hornSound?.start()
            Toast.makeText(this, "I love you", Toast.LENGTH_SHORT).show()
            it.postDelayed({
                it.isPressed = false
            }, 100)
        }
        this.setContentView(view);
    }
}


