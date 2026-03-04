package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEx6).setOnClickListener {
            startActivity(Intent(this, Ex6Activity::class.java))
        }
        findViewById<Button>(R.id.btnEx7).setOnClickListener {
            startActivity(Intent(this, Ex7Activity::class.java))
        }
        findViewById<Button>(R.id.btnEx8).setOnClickListener {
            startActivity(Intent(this, Ex8Activity::class.java))
        }
        findViewById<Button>(R.id.btnEx9).setOnClickListener {
            startActivity(Intent(this, Ex9Activity::class.java))
        }
        findViewById<Button>(R.id.btnEx10).setOnClickListener {
            startActivity(Intent(this, Ex10Activity::class.java))
        }
    }
}

