package com.example.viewbinding

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

         val binding = ActivityMainBinding.inflate(layoutInflater)
                  setContentView(binding.root)



        val menu = MainMenu.mainmenu

        val adapter = GridAdapter(menu,this)

        binding.gridTv.adapter = adapter

        binding.gridTv.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

            when ( position ) {

                0 -> { startActivity(Intent(this,HomeActivity::class.java)) }
                5 -> finishAffinity()
                2 -> startActivity(Intent(this,WidgetsActivity::class.java))
                4 -> startActivity(Intent(this,SettingActivity::class.java))
                3 -> startActivity(Intent(this,BrauserActivity::class.java))
                1 -> startActivity(Intent(this,ChatActivity::class.java))
            }

        }


    }

}