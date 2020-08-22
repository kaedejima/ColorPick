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
        var theme = intent.getIntExtra("Theme", 0)
//        var notFirst : Boolean = true
        println(theme)
        resultTextView.text = score.toString()
        tryAgain.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            intent.putExtra("Theme", theme)
//            intent.putExtra("not_First", notFirst)
            startActivity(intent1)
        }
        backToTheme.setOnClickListener {
            val intent2 = Intent(this, StartActivity::class.java)
            startActivity(intent2)
        }
        //scoreによって、メッセージを変える！！！
    }


}
