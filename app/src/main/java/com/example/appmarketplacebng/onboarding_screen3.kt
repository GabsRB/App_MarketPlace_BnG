package com.example.appmarketplacebng

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboarding_screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_screen3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_proximo3 = findViewById<Button>(R.id.btn_proximo3)

        btn_proximo3.setOnClickListener {
            val intent = Intent(this, onboarding_screen4::class.java)
            startActivity(intent)
        }
        val btn_voltar3 = findViewById<Button>(R.id.btn_voltar3)

        btn_voltar3.setOnClickListener {
            val intent = Intent(this, onboarding_screen2::class.java)
            startActivity(intent)
        }
    }
}