package com.vasilevkin.intentsandfilters

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CustomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_view)

        val label = findViewById<TextView>(R.id.show_data)
        val url = intent.data
        label.text = url.toString()
    }
}
