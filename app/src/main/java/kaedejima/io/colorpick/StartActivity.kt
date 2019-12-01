package kaedejima.io.colorpick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        classic.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            intent1.putExtra("Theme", 0)
            startActivity(intent1)
        }
        minima.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            intent2.putExtra("Theme", 1)
            startActivity(intent2)
        }
        pioneer.setOnClickListener {
            val intent3 = Intent(this, MainActivity::class.java)
            intent3.putExtra("Theme", 2)
            startActivity(intent3)
        }
        modern.setOnClickListener {
            val intent4 = Intent(this, MainActivity::class.java)
            intent4.putExtra("Theme", 3)
            startActivity(intent4)
        }
        howto.setOnClickListener{
            val intent5 = Intent(this, HowtoActivity::class.java)
            startActivity(intent5)
        }
    }
}
