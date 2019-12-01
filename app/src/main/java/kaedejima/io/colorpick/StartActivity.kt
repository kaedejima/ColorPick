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
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Theme", 0)
            startActivity(intent)
        }
        minima.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Theme", 1)
            startActivity(intent)
        }
        pioneer.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Theme", 2)
            startActivity(intent)
        }
        modern.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Theme", 3)
            startActivity(intent)
        }
    }
}
