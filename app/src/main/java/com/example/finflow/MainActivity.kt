package com.example.finflow

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
            setContentView(R.layout.home)
        val textView = findViewById<TextView>(R.id.nama)

        // Nama yang ingin ditampilkan, misalnya diambil dari sumber data
        val name = "Alex"  // Ini bisa diganti sesuai data dinamis Anda
        textView.text = "Hi, $name"
        }
    }
