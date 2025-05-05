package com.sample.samplelintcheck

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var EMAIL : EditText
    private lateinit var NAME : EditText
    private lateinit var SUBMIT : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EMAIL = findViewById(R.id.etEmail)
        NAME = findViewById(R.id.etName)
        SUBMIT = findViewById(R.id.btnSubmit)

        SUBMIT.setOnClickListener {
            var email : String = EMAIL.text.toString()
            var name : String = NAME.text.toString()
            EMAIL.text.clear()
            NAME.text.clear()
        }

    }
}