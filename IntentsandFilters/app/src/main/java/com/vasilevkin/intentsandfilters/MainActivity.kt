package com.vasilevkin.intentsandfilters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.R.attr.button
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var b1: Button
    lateinit var b2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.button) as Button
        b1.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View) {
                val i = Intent(
                    android.content.Intent.ACTION_VIEW,
                    Uri.parse("http://www.example.com")
                )
                startActivity(i)
            }
        })

        b2 = findViewById<View>(R.id.button2) as Button
        b2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val i = Intent(
                    android.content.Intent.ACTION_VIEW,
                    Uri.parse("tel:9510300000")
                )
                startActivity(i)
            }
        })
    }
}
