package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ex10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex10)

        findViewById<Button>(R.id.btnHorizontal).setOnClickListener {
            startActivity(Intent(this, Ex10HorizontalActivity::class.java))
        }

        findViewById<Button>(R.id.btnVertical).setOnClickListener {
            startActivity(Intent(this, Ex10VerticalActivity::class.java))
        }
    }
}

