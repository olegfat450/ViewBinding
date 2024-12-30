package com.example.viewbinding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityHomeBinding
import com.example.viewbinding.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val person = Person.person
        val binding = ActivityHomeBinding.inflate(layoutInflater)
            setContentView(binding.root)

          binding.imageTv.setImageResource(person.image)
          binding.nameTv.setText(person.name)
          binding.surnameTv.setText(person.surname)
          binding.addressTv.setText(person.address)
          binding.tphoneTv.setText(person.phone)
          binding.mailTv.setText(person.mail)



    }
}