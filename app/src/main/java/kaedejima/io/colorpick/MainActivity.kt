package kaedejima.io.colorpick

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var colors = listOf("YELLOW", "GREEN", "RED", "BLUE")
    var colorNum = listOf("000000","000000","000000","000000")
    var scoreCount = 0
    var turnCount = 0
    var turnNum = 10
    var randomeNumText = (0..3).shuffled().first()
//    var randomeNumColor = (0..3).shuffled().first()
//    var selectedTheme = intent.getIntExtra("Theme", 0)
//    var notfirst = intent.getBooleanExtra("not_First", false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if(notfirst == true) {
//            selectedTheme = intent.getIntExtra("Theme_Again", 0)
//        }
        var selectedTheme = intent.getIntExtra("Theme", 0)
        when(selectedTheme){
            0 -> { //classic
                colors = listOf("YELLOW", "GREEN", "RED", "BLUE")
                colorNum = listOf("#827e00","#005900","#8c0e0e","#0a0a77")
                buttonOne.setBackgroundColor(Color.parseColor(colorNum[0]))
                buttonTwo.setBackgroundColor(Color.parseColor(colorNum[1]))
                buttonThree.setBackgroundColor(Color.parseColor(colorNum[2]))
                buttonFour.setBackgroundColor(Color.parseColor(colorNum[3]))
            }
            1 -> { //minimalist
                colors = listOf("DARK", "GRAY", "WHITE", "BROWN")
                colorNum = listOf("#5e5d5d","#a7a5a7","#eae6e4","#a4918e")
                buttonOne.setBackgroundColor(Color.parseColor("#5e5d5d"))
                buttonTwo.setBackgroundColor(Color.parseColor("#a7a5a7"))
                buttonThree.setBackgroundColor(Color.parseColor("#eae6e4"))
                buttonFour.setBackgroundColor(Color.parseColor("#a4918e"))
            }
            2 -> { //pionneer
                colors = listOf("PURPLE", "PINK", "YELLOW", "BLACK")
                colorNum = listOf("#802c6e","#f0326e","#f7aa3","#3a3134")
                buttonOne.setBackgroundColor(Color.parseColor("#802c6e"))
                buttonTwo.setBackgroundColor(Color.parseColor("#f0326e"))
                buttonThree.setBackgroundColor(Color.parseColor("#f7aa35"))
                buttonFour.setBackgroundColor(Color.parseColor("#3a3134"))
            }
            3 -> { //modern
                colors = listOf("NAVY", "BLUE", "WHITE", "ORANGE")
                colorNum = listOf("#2e364f","2d5d7c0","#f3f0e2","#ef5939")
                buttonOne.setBackgroundColor(Color.parseColor("#2e364f"))
                buttonTwo.setBackgroundColor(Color.parseColor("#2d5d7c"))
                buttonThree.setBackgroundColor(Color.parseColor("#f3f0e2"))
                buttonFour.setBackgroundColor(Color.parseColor("#ef5939"))
            }
        }

        textView.text = colors[randomeNumText]
//        textView.setTextColor(Color.parseColor(colorNum[randomeNumColor]))
        progressBar.max = turnNum

        buttonOne.setOnClickListener {
            if(randomeNumText == 1-1){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone()
        }
        buttonTwo.setOnClickListener {
            if(randomeNumText == 2-1){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone()
        }
        buttonThree.setOnClickListener {
            if(randomeNumText == 3-1){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone()
        }
        buttonFour.setOnClickListener {
            if(randomeNumText == 4-1){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone()
        }
    }
    fun turnDone(){
        turnCount ++
        progressBar.progress = turnCount
        if(turnCount == turnNum){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Score_Number", scoreCount)
//            intent.putExtra("Theme_toResult", selectedTheme)
            startActivity(intent)
        }else{
            randomeNumText = (0..3).shuffled().first()
            textView.text = colors[randomeNumText]
//            randomeNumColor = (0..3).shuffled().first()
//            textView.setTextColor(Color.parseColor(colorNum[randomeNumColor]))
        }

    }


}
