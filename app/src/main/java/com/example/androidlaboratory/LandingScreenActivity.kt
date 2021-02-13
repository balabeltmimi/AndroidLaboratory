package com.example.androidlaboratory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlaboratory.databinding.ActivityLandingScreenBinding

class LandingScreenActivity : AppCompatActivity() {

    private val binding: ActivityLandingScreenBinding by lazy {
        ActivityLandingScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}