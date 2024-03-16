package com.example.finalprojectkotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val image = intent.getIntExtra("image", 0)
        val description = intent.getStringExtra("description")

        findViewById<TextView>(R.id.title).text = title
        findViewById<ImageView>(R.id.image).setImageResource(image)
        findViewById<TextView>(R.id.detail).text = description  // Tampilkan deskripsi kedua
    }
}
