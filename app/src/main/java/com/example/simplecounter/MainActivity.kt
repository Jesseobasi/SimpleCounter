package com.example.simplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            if (counter > 10) {
                button2.visibility = Button.VISIBLE
                button.text = "Add 2"
                button2.setOnClickListener {
                    counter += 2
                    textView.text = counter.toString()
                }
                button2.visibility = Button.INVISIBLE
            }
            counter++
            textView.text = counter.toString()
        }
    }
}
