package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start = findViewById<Button>(R.id.btn_start)
        val et_name = findViewById<EditText>(R.id.et_name)

        btn_start.setOnClickListener {

            if (et_name.text.isEmpty()) {
                Toast.makeText(this, "Please Enter your name", Toast.LENGTH_LONG).show()

            }else{
                val intent = Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}