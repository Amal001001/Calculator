package com.example.calculater

import androidx.lifecycle.ViewModel

class viewModel: ViewModel(){
    var output = 0f
    var num1 = ""
    var num2 = ""
    var operator = ' '
    var displaytext = "0"

    fun Num(num: Char){
        if(operator==' '){
            num1 += num
            displaytext = num1
        }else{
            num2 += num
            val text = num1 + operator + num2
            displaytext = text
        }
    }

    fun checkOperator(operat: Char){
        operator = operat
        val text = num1 + operator
        displaytext = text
    }

    fun calculate(){
        var divByZero = false
        if (num2.isNotEmpty()){
        when (operator) {
            '+' -> output = num1.toFloat() + num2.toFloat()
            '-' -> output = num1.toFloat() - num2.toFloat()
            '*' -> output = num1.toFloat() * num2.toFloat()
            '/' -> if( num2.toFloat() != 0f ){
                output = num1.toFloat() / num2.toFloat()
            }else{
                divByZero = true
            }
        }
    }
        num1 = output.toString()
        num2 = ""
        displaytext = output.toString()

        if(divByZero) { clear() }
    }

    fun Decimal(){
        if(operator == ' ' && !num1.contains(".")){Num('.')}
        if(operator != ' ' && !num2.contains(".")){Num('.')}
    }

    fun Minus(){
        if(operator==' '){
            num1 = if(num1.startsWith("-")){
                num1.substring(1, num1.length)
            } else{
                "-$num1"
            }
            displaytext = num1
        }else{
            num2 = if(num2.startsWith("-")){
                num2.substring(1, num2.length)
            } else{
                "-$num2"
            }
            val text = num1 + operator + num2
            displaytext = text
        }
    }

    fun del(){
        if(operator==' '){
            if(num1.isNotEmpty()){
                num1 = num1.substring(0, num1.length - 1)
                if(num1.isEmpty()){displaytext = "0"}
                else{displaytext = num1}
            }
        }else{
            if(num2.isNotEmpty()){
                num2 = num2.substring(0, num2.length - 1)
                val text = num1 + operator + num2
                displaytext = text
            }else{
                operator=' '
                displaytext = num1
            }
        }
    }

    fun clear(){
         output = 0f
         num1 = ""
         num2 = ""
         operator = ' '
         displaytext = "0"
    }
}