package com.example.androidlaboratory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlaboratory.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : CoroutineScope, AppCompatActivity() {

    val binding: ActivitySplashScreenBinding by lazy {
        ActivitySplashScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        launch {
            delay(3000)
        }
}