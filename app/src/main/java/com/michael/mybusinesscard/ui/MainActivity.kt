package com.michael.mybusinesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.michael.mybusinesscard.R
import com.michael.mybusinesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}