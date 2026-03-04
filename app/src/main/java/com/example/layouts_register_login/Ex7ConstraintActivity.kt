package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ex7ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex7_constraint)

        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            Toast.makeText(this, "registre complet", Toast.LENGTH_SHORT).show()
        }
    }
}

