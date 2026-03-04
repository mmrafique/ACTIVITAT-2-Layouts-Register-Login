package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ex7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex7)

        findViewById<Button>(R.id.btnLinear).setOnClickListener {
            startActivity(Intent(this, Ex7LinearActivity::class.java))
        }
        findViewById<Button>(R.id.btnRelative).setOnClickListener {
            startActivity(Intent(this, Ex7RelativeActivity::class.java))
        }
        findViewById<Button>(R.id.btnConstraint).setOnClickListener {
            startActivity(Intent(this, Ex7ConstraintActivity::class.java))
        }
    }
}

