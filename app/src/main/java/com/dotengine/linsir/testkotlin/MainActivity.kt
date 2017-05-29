package com.dotengine.linsir.testkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    var tv: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a()
        tv = findViewById(R.id.text_view) as TextView?

        tv!!.text = "aaaabbba";

    }

    fun a() {
        val b: Int = 1
        val d: Int = 2
        val e: Int = b + d
        Toast.makeText(this, "result " + e, Toast.LENGTH_SHORT).show()
    }

}
