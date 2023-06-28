package com.example.gmailuidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class SignIn : AppCompatActivity() {
    private lateinit var next: AppCompatButton
    private lateinit var userEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        next = findViewById(R.id.next);


        next.setOnClickListener {
            // Create an Intent to start the new activity
            val intent = Intent(this, SignInSecond::class.java)

            // Start the new activity
            startActivity(intent)
        }
    }
}

