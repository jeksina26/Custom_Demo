package com.example.custom_demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_customedittext.*

class CustomEditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customedittext)

        btnnext1.setOnClickListener {
            var intent = Intent(this,CustomButtonActivity::class.java)
            startActivity(intent)
        }
    }
}