package com.example.androidlaboratory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlaboratory.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private val binding: ActivitySplashScreenBinding by lazy {
        ActivitySplashScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}