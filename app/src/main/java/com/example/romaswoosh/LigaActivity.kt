package com.example.romaswoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class LigaActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liga)
    }

    fun ligaNextClicked(view: View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }

}
