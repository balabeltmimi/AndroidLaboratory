package com.example.androidlaboratory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlaboratory.databinding.ActivityMainScreenBinding

class MainScreenActivity : AppCompatActivity() {

    val binding: ActivityMainScreenBinding by lazy {
        ActivityMainScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}