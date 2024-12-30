package com.example.viewbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityWidgetsBinding

class WidgetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
      //  setContentView(R.layout.activity_widgets)



        val widgets = listOf(R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5,R.drawable.w6,R.drawable.w7,R.drawable.w8,R.drawable.w9,R.drawable.w10)

        val binding = ActivityWidgetsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val adapter = WidgetAdapter(widgets,this)
         binding.widgetGrid.adapter = adapter

    }
}