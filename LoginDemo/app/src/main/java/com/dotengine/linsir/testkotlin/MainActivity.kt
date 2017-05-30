package com.dotengine.linsir.testkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var userName: EditText? = null
    var userPwd: EditText? = null
    var register: Button? = null
    var login: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.user_name) as EditText
        userPwd = findViewById(R.id.user_pwd) as EditText

        register = findViewById(R.id.register) as Button
        login = findViewById(R.id.login) as Button

        login!!.setOnClickListener {
            if (userName!!.text.toString() == "123456" && userPwd!!.text.toString() == "abc") {
                Toast.makeText(this, "login succeed1", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
        }

        register!!.setOnClickListener {
            Toast.makeText(this, "the function has not open ...", Toast.LENGTH_SHORT).show()
        }

    }

}
