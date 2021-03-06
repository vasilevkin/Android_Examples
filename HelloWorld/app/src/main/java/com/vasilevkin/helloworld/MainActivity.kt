package com.vasilevkin.helloworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val msg = "Android : "

    /** Called when the activity is first created. */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(msg, "The onCreate() event")
    }

    /** Called when the activity is about to become visible. */
    override fun onStart() {
        super.onStart()

        Log.d(msg, "The onStart() event")
    }

    override fun onResume() {
        super.onResume()

        Log.d(msg, "The onResume() event")
    }

    override fun onPause() {
        super.onPause()

        Log.d(msg, "The onPause() event")
    }

    /** Called when the activity is no longer visible. */
    override fun onStop() {
        super.onStop()

        Log.d(msg, "The onStop() event")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(msg, "The onDestroy() event")
    }

    // Service
    fun startService(view: View) {
        startService(Intent(baseContext, MyService::class.java))
    }

    // Method to stop the service
    fun stopService(view: View) {
        stopService(Intent(baseContext, MyService::class.java))
    }
}
