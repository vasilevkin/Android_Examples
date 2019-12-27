package com.vasilevkin.eventhandling

import android.app.ProgressDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var b1: Button
    lateinit var b2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progress = ProgressDialog(this)

        b1 = findViewById(R.id.button)
        b2 = findViewById(R.id.button2)
        b1.setOnClickListener {
            val txtView = findViewById<TextView>(R.id.textView)
            txtView.textSize = 25f
        }

        b2.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View) {
                val txtView = findViewById(R.id.textView) as TextView
                txtView.textSize = 55f
            }
        })
    }
}
