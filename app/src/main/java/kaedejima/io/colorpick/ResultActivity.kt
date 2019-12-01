package kaedejima.io.colorpick

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var score = intent.getIntExtra("Score_Number", 0)
//        var theme = intent.getIntExtra("Theme_toResult", 0)
//        var notFirst : Boolean = true
        resultTextView.text = Integer.toString(score)
        tryAgain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("Theme_Again", theme)
//            intent.putExtra("not_First", notFirst)
            startActivity(intent)
        }
        backToTheme.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
        //scoreによって、メッセージを変える！！！
    }


}
