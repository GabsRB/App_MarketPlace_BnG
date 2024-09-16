package com.example.appmarketplacebng

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboarding_screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_screen2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_proximo_onb2 = findViewById<Button>(R.id.btn_proximo_onb2)

        btn_proximo_onb2.setOnClickListener {
            val intent = Intent(this, onboarding_screen3::class.java)
            startActivity(intent)
        }
        val btn_voltar_onb2 = findViewById<Button>(R.id.btn_voltar_onb2)

        btn_voltar_onb2.setOnClickListener {
            val intent = Intent(this, Onboarding_Screen1::class.java)
            startActivity(intent)
        }
    }
}