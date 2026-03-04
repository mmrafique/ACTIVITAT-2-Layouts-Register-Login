package com.example.layouts_register_login

import com.example.layouts_register_login.R
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ex9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex9)

        val cbMaths = findViewById<CheckBox>(R.id.cbMaths)
        val cbPhysics = findViewById<CheckBox>(R.id.cbPhysics)
        val cbChemistry = findViewById<CheckBox>(R.id.cbChemistry)
        val rgShift = findViewById<RadioGroup>(R.id.rgShift)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitEnrollment)

        btnSubmit.setOnClickListener {
            val subjects = mutableListOf<String>()
            if (cbMaths.isChecked) subjects.add("Mates")
            if (cbPhysics.isChecked) subjects.add("Física")
            if (cbChemistry.isChecked) subjects.add("Química")

            val shiftId = rgShift.checkedRadioButtonId
            val shift = if (shiftId != -1) {
                findViewById<RadioButton>(shiftId).text.toString()
            } else {
                "Cap torn seleccionat"
            }

            val summary = "Matèries: ${subjects.joinToString(", ")}\nTorn: $shift"
            Toast.makeText(this, summary, Toast.LENGTH_LONG).show()
        }
    }
}

