package com.example.finalprojectkotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        val imageView = findViewById<ImageView>(R.id.profile_image)
        val nameTextView = findViewById<TextView>(R.id.name)
        val emailTextView = findViewById<TextView>(R.id.email)

        imageView.setImageResource(R.drawable.ikhsan)
        nameTextView.text = "ikhsan Moekhtar"
        emailTextView.text = "ikhsanikhsanmoekhtarr@gmail.com"
    }
}
