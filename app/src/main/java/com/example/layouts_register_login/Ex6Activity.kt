package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ex6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex6)

        val editText = findViewById<EditText>(R.id.etInputText)
        val button = findViewById<Button>(R.id.btnShowToast)

        button.setOnClickListener {
            val text = editText.text.toString()
            if (text.isNotEmpty()) {
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Introdueix algun text!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

