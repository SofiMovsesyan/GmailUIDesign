package com.example.gmailuidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class SignInSecond : AppCompatActivity() {
    private lateinit var passET: EditText
    private lateinit var next2: AppCompatButton

    private lateinit var userEmail: TextView
    private lateinit var showPass: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_second)
        userEmail = findViewById(R.id.userEmailValue)
        passET = findViewById(R.id.pass)
        showPass = findViewById(R.id.checkBox)
        val userEmailValue: String? = intent.getStringExtra("userEmailValue")
        userEmail.text = userEmailValue
        next2 = findViewById(R.id.next2);

        showPass.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Show password
                passET.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                // Hide password
                passET.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }

        next2.setOnClickListener {
            val userEmailValue: String = userEmail.text.toString()


            val intent = Intent(this, InboxActivity::class.java)
            startActivity(intent)

        }
    }
}