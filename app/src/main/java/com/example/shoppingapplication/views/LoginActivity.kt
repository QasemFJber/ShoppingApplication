package com.example.shoppingapplication.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}