package com.example.ai_read_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doAsync {
            setTextView()
        }.execute()
    }

    fun setTextView() {
        val apiResponse = URL("https://localhost:8080/").readText()
        val textview: TextView = findViewById(R.id.text_view_id)
        textview.setText(apiResponse).toString()
    }
}
