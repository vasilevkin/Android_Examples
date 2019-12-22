package com.vasilevkin.broadcastreceivers

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // broadcast a custom intent.
    fun broadcastIntent(view: View) {
        val intent = Intent()
        intent.action = "com.vasilevkin.CUSTOM_INTENT"
        sendBroadcast(intent)
    }

}
