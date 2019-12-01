package kaedejima.io.colorpick

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        val handler = Handler()
        var postDelayed: Any = handler.postDelayed({
            val intent = Intent(this@LogoActivity, StartActivity::class.java)
            startActivity(intent)
        }, 2000)

    }
}
