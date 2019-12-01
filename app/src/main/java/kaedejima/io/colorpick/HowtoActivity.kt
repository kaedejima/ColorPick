package kaedejima.io.colorpick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_howto.*
import kotlinx.android.synthetic.main.activity_start.*

class HowtoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_howto)

        tomenu.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
    }
}
