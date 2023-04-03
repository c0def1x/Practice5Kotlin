package com.bignerdranch.android.practice5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    private lateinit var firstButton: Button
    private lateinit var secondButton: Button

    private fun SendMessage(buttonClickCount: Int, number: Int, message: Int)
    {
        if(buttonClickCount % number == 0)
        {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton = findViewById(R.id.firstButton)
        secondButton = findViewById(R.id.secondButton)

        var firstButtonClickCount = 0
        var secondButtonClickCount = 0

        firstButton.setOnClickListener{
            firstButtonClickCount++
            SendMessage(firstButtonClickCount, 2, R.string.developerSurname)
            SendMessage(firstButtonClickCount, 5, R.string.developerSurname)
        }

        secondButton.setOnClickListener{
            secondButtonClickCount++
            SendMessage(secondButtonClickCount, 3, R.string.educationalInstitutionTitle)
            SendMessage(secondButtonClickCount, 7, R.string.educationalInstitutionTitle)
        }
    }
}