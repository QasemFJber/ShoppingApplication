package com.example.shoppingapplication.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}