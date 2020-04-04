package com.example.romaswoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var liga = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        liga = intent.getStringExtra(EXTRA_LIGA)
        println(liga)
    }

}
