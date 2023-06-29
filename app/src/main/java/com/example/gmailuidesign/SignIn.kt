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
        userEmail = findViewById(R.id.userEmail)

        next.setOnClickListener {
            val userEmailValue: String = userEmail.text.toString()


            val intent = Intent(this, SignInSecond::class.java)
                intent.putExtra("userEmailValue", userEmailValue)
                // Start the new activity
                startActivity(intent)

        }
    }

}

