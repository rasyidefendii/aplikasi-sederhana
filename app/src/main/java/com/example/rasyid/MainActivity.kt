package com.example.rasyid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var variablestring : String = "Rasyid"
    val variableint = 29101999
    val variablearray = intArrayOf(10,20,30,40,50)
    val variablechar = '0'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email.text = intent.getStringExtra("Email")
        password.text = intent.getStringExtra("Password")

        variablestring = "Rasyid Efendi Lubis"
        stringlogin.text = variablestring
        intlogin.text = variableint.toString()
        intarray1.text = variablearray[4].toString()
        intarray2.text = variablearray[0].toString()
        charlogin.text = variablechar.toString()
        back.setOnClickListener {
            val back = Intent (this, LoginActivity::class.java)
            startActivity(back)
        }
    }
}