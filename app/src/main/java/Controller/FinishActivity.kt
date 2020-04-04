package Controller

import Utilities.EXTRA_LIGA
import Utilities.EXTRA_SKILL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.romaswoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val liga = intent.getStringExtra(EXTRA_LIGA)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLigaText.text = "Procurando uma liga $liga $skill para você..."

    }
}
