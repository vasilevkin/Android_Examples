package com.vasilevkin.customcomponents

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleText = findViewById<TextView>(R.id.simple)
        simpleText.text = "That is a simple TextView"
    }
}
