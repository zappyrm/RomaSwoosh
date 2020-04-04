package Controller

import android.os.Bundle
import Utilities.EXTRA_LIGA
import Utilities.EXTRA_SKILL
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.example.romaswoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var liga = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        liga = intent.getStringExtra(EXTRA_LIGA)
    }
    fun onExperienteClicked(view: View){

        inicianteSkillBtn.isChecked = false
        skill = "experiente"

    }
    fun onInicianteClicked(view: View){

        experienteSkillBtn.isChecked = false
        skill = "iniciante"

    }

    fun onSkillFimClicked(view: View){
      if (skill != ""){

          val finishActivity = Intent(this, FinishActivity::class.java)
          finishActivity.putExtra(EXTRA_LIGA, liga)
          finishActivity.putExtra(EXTRA_SKILL, skill)
          startActivity(finishActivity)

      }else{

          Toast.makeText(this, "Por favor, selecione o seu nível", Toast.LENGTH_SHORT).show()

      }

    }

}
