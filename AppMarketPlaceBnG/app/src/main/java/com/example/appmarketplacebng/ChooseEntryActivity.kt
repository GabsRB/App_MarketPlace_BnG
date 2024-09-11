package com.example.appmarketplacebng

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class ChooseEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_choose_entry)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEnter = findViewById<Button>(R.id.btn_choose)
        val btnRegister = findViewById<Button>(R.id.btn_cadastrar)

        btnEnter.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java) // Substitua pela Activity de login
            startActivity(intent)
        }


       // btnRegister.setOnClickListener {
        //    val intent = Intent(this, RegisterActivity::class.java) // Substitua pela Activity de cadastro
      //      startActivity(intent)
       // }
    }
}