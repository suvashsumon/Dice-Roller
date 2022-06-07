package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.rollbutton)
        rollBtn.setOnClickListener {
//            Toast.makeText(this, "Hi, Aminul", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dicetext : TextView = findViewById(R.id.textview)
        val randInt = Random().nextInt(6) + 1
        dicetext.text = randInt.toString()
    }
}