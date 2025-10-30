package com.example.firstcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textViev: TextView
    private lateinit var textViewExpression: TextView
    private lateinit var textViewAnswer: TextView
    private lateinit var buttonEquals: Button
    private lateinit var buttonPlus: Button
    private lateinit var buttonMultiply: Button
    private lateinit var buttonDevide: Button
    private lateinit var buttonMinus: Button
    private lateinit var buttonZero: Button
    private lateinit var buttonPoint: Button
    private lateinit var buttonChangeSign: Button
    private lateinit var buttonOne: Button
    private lateinit var buttonTwo: Button
    private lateinit var buttonThree: Button
    private lateinit var buttonFour: Button
    private lateinit var buttonFive: Button
    private lateinit var buttonSix: Button
    private lateinit var buttonSeven: Button
    private lateinit var buttonEight: Button
    private lateinit var buttonNine: Button
    private lateinit var buttonOpenBracket: Button
    private lateinit var buttonCloseBracket: Button
    private lateinit var buttonPi: Button
    private lateinit var buttonSin: Button
    private lateinit var buttonCos: Button
    private lateinit var buttonTan: Button
    private lateinit var buttonSec: Button
    private lateinit var buttonCsc: Button
    private lateinit var buttonCot: Button
    private lateinit var buttonPow: Button
    private lateinit var buttonChangeDeg2Rad: Button
    private lateinit var buttonAC: Button
    private lateinit var buttonBackSpace: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initializeViews()

        buttonEquals.setOnClickListener {
            textViev.text = "РАБОТАЕТ"
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun initializeViews() {
        textViev = findViewById(R.id.textView)
        textViewExpression = findViewById(R.id.textViewExpression)
        textViewAnswer = findViewById(R.id.textViewAnswer)

        buttonEquals = findViewById(R.id.buttonEquals)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMultiply = findViewById(R.id.buttonMultiply)
        buttonDevide = findViewById(R.id.buttonDevide)
        buttonMinus = findViewById(R.id.buttonMinus)
        buttonZero = findViewById(R.id.buttonZero)
        buttonPoint = findViewById(R.id.buttonPoint)
        buttonChangeSign = findViewById(R.id.buttonChangeSign)
        buttonOne = findViewById(R.id.buttonOne)
        buttonTwo = findViewById(R.id.buttonTwo)
        buttonThree = findViewById(R.id.buttonThree)
        buttonFour = findViewById(R.id.buttonFour)
        buttonFive = findViewById(R.id.buttonFive)
        buttonSix = findViewById(R.id.buttonSix)
        buttonSeven = findViewById(R.id.buttonSeven)
        buttonEight = findViewById(R.id.buttonEight)
        buttonNine = findViewById(R.id.buttonNine)
        buttonOpenBracket = findViewById(R.id.buttonOpenBracket)
        buttonCloseBracket = findViewById(R.id.buttonCloseBracket)
        buttonPi = findViewById(R.id.buttonPi)
        buttonSin = findViewById(R.id.buttonSin)
        buttonCos = findViewById(R.id.buttonCos)
        buttonTan = findViewById(R.id.buttonTan)
        buttonSec = findViewById(R.id.buttonSec)
        buttonCsc = findViewById(R.id.buttonCsc)
        buttonCot = findViewById(R.id.buttonCot)
        buttonPow = findViewById(R.id.buttonPow)
        buttonChangeDeg2Rad = findViewById(R.id.buttonChangeDeg2Rad)
        buttonAC = findViewById(R.id.buttonAC)
        buttonBackSpace = findViewById(R.id.buttonBackSpace)
    }
}