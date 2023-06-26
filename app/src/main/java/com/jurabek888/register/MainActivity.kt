package com.jurabek888.register

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val  image= findViewById<ImageView>(R.id.image1)
        val button=findViewById<MaterialButton>(R.id.materialButton)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity2::class.java)
            val pairs: Array<Pair<*, *>?> = arrayOfNulls(1)
            pairs[0] = Pair<View, String>(image, "image")
            val activityOptions = ActivityOptions.makeSceneTransitionAnimation(this@MainActivity)
            startActivity(intent, activityOptions.toBundle())

        }
    }
    }
