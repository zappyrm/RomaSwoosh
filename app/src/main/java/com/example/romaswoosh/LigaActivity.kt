package com.example.romaswoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_liga.*

class LigaActivity : BaseActivity() {

    var selectedLiga = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liga)
    }

    fun onMensClicked(view: View){

        womensLigaBtn.isChecked = false
        unissexLigaBtn.isChecked = false

        selectedLiga = "mens"
    }
    fun onWomensClicked(view: View){

        mensLigaBtn.isChecked = false
        unissexLigaBtn.isChecked = false

        selectedLiga = "womens"
    }
    fun onUnissexClicked(view: View){

        mensLigaBtn.isChecked = false
        womensLigaBtn.isChecked = false

        selectedLiga = "unissex"
    }

    fun ligaNextClicked(view: View){
        if (selectedLiga != ""){

            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LIGA, selectedLiga)
            startActivity(skillActivity)

        }else{

            Toast.makeText(this, "Por favor selecione uma liga.", Toast.LENGTH_SHORT).show()

        }

    }

}
