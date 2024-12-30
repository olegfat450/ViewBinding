package com.example.viewbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val binding = ActivityChatBinding.inflate(layoutInflater)

           setContentView(binding.root)


        binding.floatButton.setOnClickListener { if (binding.messageText.text.isEmpty()) return@setOnClickListener

                   binding.textTv.append("   ${binding.messageText.text}\n"); binding.messageText.text.clear()

               binding.sctoll.scrollTo(0,100000)
        }

    }
}