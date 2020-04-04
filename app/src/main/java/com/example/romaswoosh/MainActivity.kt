package com.example.romaswoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getStartedBtn.setOnClickListener {

            val ligaIntent = Intent(this, LigaActivity::class.java)
            startActivity(ligaIntent)

        }
    }
}
