package kaedejima.io.colorpick

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {
    var colors = listOf("YELLOW", "GREEN", "RED", "BLUE")
    var colorNum = listOf("000000","000000","000000","000000")
    var scoreCount = 0
    var turnCount = 0
    var turnNum = 10
    var randomNumText = Random.nextInt(0..3)
    var randomNumColor = Random.nextInt(0..3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTheme = intent.getIntExtra("Theme", 3)
        println(selectedTheme)
        when(selectedTheme){
            0 -> { //classic
                colors = listOf("GREEN", "YELLOW", "RED", "BLUE")
                colorNum = listOf("#00e600","#e6e600","#e60000","#0088e6")
                buttonOne.setBackgroundColor(Color.parseColor(colorNum[0]))
                buttonTwo.setBackgroundColor(Color.parseColor(colorNum[1]))
                buttonThree.setBackgroundColor(Color.parseColor(colorNum[2]))
                buttonFour.setBackgroundColor(Color.parseColor(colorNum[3]))
            }
            1 -> { //minimalist
                colors = listOf("GRAY", "DARK", "WHITE", "BROWN")
                colorNum = listOf("#a7a5a7","#5e5d5d","#eae6e4","#a4918e")
                buttonOne.setBackgroundColor(Color.parseColor(colorNum[0]))
                buttonTwo.setBackgroundColor(Color.parseColor(colorNum[1]))
                buttonThree.setBackgroundColor(Color.parseColor(colorNum[2]))
                buttonFour.setBackgroundColor(Color.parseColor(colorNum[3]))
            }
            2 -> { //pionneer
                colors = listOf("PINK", "PURPLE", "YELLOW", "BLACK")
                colorNum = listOf("#f0326e","#802c6e","#f7aa35","#3a3134")
                buttonOne.setBackgroundColor(Color.parseColor(colorNum[0]))
                buttonTwo.setBackgroundColor(Color.parseColor(colorNum[1]))
                buttonThree.setBackgroundColor(Color.parseColor(colorNum[2]))
                buttonFour.setBackgroundColor(Color.parseColor(colorNum[3]))
            }
            3 -> { //modern
                colors = listOf("BLUE", "NAVY", "WHITE", "ORANGE")
                colorNum = listOf("#2d5d7c","#2e364f","#f3f0e2","#ef5939")
                buttonOne.setBackgroundColor(Color.parseColor(colorNum[0]))
                buttonTwo.setBackgroundColor(Color.parseColor(colorNum[1]))
                buttonThree.setBackgroundColor(Color.parseColor(colorNum[2]))
                buttonFour.setBackgroundColor(Color.parseColor(colorNum[3]))
            }
        }

        textView.text = colors[randomNumText]
        textView.setTextColor(Color.parseColor(colorNum[randomNumColor]))
        progressBar.max = turnNum

        buttonOne.setOnClickListener {
            if(randomNumText == 0){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone(selectedTheme)
        }
        buttonTwo.setOnClickListener {
            if(randomNumText == 1){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone(selectedTheme)
        }
        buttonThree.setOnClickListener {
            if(randomNumText == 2){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone(selectedTheme)
        }
        buttonFour.setOnClickListener {
            if(randomNumText == 3){
                Toast.makeText(this, "nice!!", Toast.LENGTH_SHORT).show()
                scoreCount++
            }else{
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show()
            }
            turnDone(selectedTheme)
        }
    }
    fun turnDone(selectedTheme: Int?){
        turnCount ++
        progressBar.progress = turnCount
        if(turnCount == turnNum){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Score_Number", scoreCount)
            intent.putExtra("Theme", selectedTheme)
            startActivity(intent)
        } else {
            randomNumText = Random.nextInt(0..3)
            randomNumColor = Random.nextInt(0..3)
            textView.text = colors[randomNumText]
            textView.setTextColor(Color.parseColor(colorNum[randomNumColor]))
        }

    }


}
