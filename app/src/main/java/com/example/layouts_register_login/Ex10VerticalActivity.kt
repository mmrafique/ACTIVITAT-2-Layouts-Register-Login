package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ex10VerticalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex10_vertical)

        findViewById<Button>(R.id.btnNavToHorizontal).setOnClickListener {
            startActivity(Intent(this, Ex10HorizontalActivity::class.java))
            finish()
        }
    }
}

