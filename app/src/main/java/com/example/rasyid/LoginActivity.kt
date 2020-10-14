package com.example.rasyid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginhome.setOnClickListener {
            val pindahlogin = Intent (this, MainActivity::class.java)
                .apply {
                    putExtra("Email", email.text.toString())
                    putExtra("Password", password.text.toString())
                }
            startActivity(pindahlogin)
        }
    }
}