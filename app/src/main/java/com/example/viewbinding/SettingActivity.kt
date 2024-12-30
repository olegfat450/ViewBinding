package com.example.viewbinding

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivitySettingBinding.inflate(layoutInflater)

        setContentView(binding.root)


              binding.switch1.setOnClickListener { if (binding.switch1.isChecked) binding.main.setBackgroundColor(Color.GRAY) else binding.main.setBackgroundColor(Color.WHITE) }


    }
}