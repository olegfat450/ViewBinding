package com.example.viewbinding

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityBrauserBinding

class BrauserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityBrauserBinding.inflate(layoutInflater)
            setContentView(binding.root)
          val url = "https://urban-university.ru"
           binding.webview.webViewClient = WebViewClient()

           binding.webview.loadUrl(url)
    }
}