package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var display: TextView
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var bDiv: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var bMulti: Button
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var bSub: Button
    lateinit var bNegative: Button
    lateinit var b0: Button
    lateinit var bDot: Button
    lateinit var bSum: Button
    lateinit var bDel: Button
    lateinit var bClear: Button
    lateinit var bEqual: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ViewModel = ViewModelProvider(this).get(viewModel::class.java)

        display = findViewById(R.id.operationTV)
        display.text = viewModel().displaytext

        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        bDiv = findViewById(R.id.bDiv)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        bMulti = findViewById(R.id.bMulti)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        bSub = findViewById(R.id.bSub)
        bNegative = findViewById(R.id.bNegative)
        b0 = findViewById(R.id.b0)
        bDot = findViewById(R.id.bDot)
        bSum = findViewById(R.id.bSum)
        bDel = findViewById(R.id.bDel)
        bClear = findViewById(R.id.bClear)
        bEqual = findViewById(R.id.bEqual)

        b7.setOnClickListener { ViewModel.Num('7')
            display.text = ViewModel.displaytext}
        b8.setOnClickListener { ViewModel.Num('8')
            display.text = ViewModel.displaytext}
        b9.setOnClickListener { ViewModel.Num('9')
            display.text = ViewModel.displaytext }
        b4.setOnClickListener { ViewModel.Num('4')
            display.text = ViewModel.displaytext }
        b5.setOnClickListener { ViewModel.Num('5')
            display.text = ViewModel.displaytext }
        b6.setOnClickListener { ViewModel.Num('6')
            display.text = ViewModel.displaytext }
        b1.setOnClickListener { ViewModel.Num('1')
            display.text = ViewModel.displaytext }
        b2.setOnClickListener { ViewModel.Num('2')
            display.text = ViewModel.displaytext }
        b3.setOnClickListener { ViewModel.Num('3')
            display.text = ViewModel.displaytext }
        b0.setOnClickListener { ViewModel.Num('0')
            display.text = ViewModel.displaytext }

        bDot.setOnClickListener { ViewModel.Decimal()
            display.text = ViewModel.displaytext }
        bNegative.setOnClickListener { ViewModel.Minus()
            display.text = ViewModel.displaytext }

        bSum.setOnClickListener { ViewModel.checkOperator('+')
            display.text = ViewModel.displaytext }
        bSub.setOnClickListener { ViewModel.checkOperator('-')
            display.text = ViewModel.displaytext }
        bMulti.setOnClickListener { ViewModel.checkOperator('*')
            display.text = ViewModel.displaytext }
        bDiv.setOnClickListener { ViewModel.checkOperator('/')
            display.text = ViewModel.displaytext }

        bEqual.setOnClickListener{ ViewModel.calculate()
            display.text = ViewModel.displaytext }

        bDel.setOnClickListener { ViewModel.del()
            display.text = ViewModel.displaytext}

        bClear.setOnClickListener{ ViewModel.clear()
            display.text = ViewModel.displaytext }

    }

}