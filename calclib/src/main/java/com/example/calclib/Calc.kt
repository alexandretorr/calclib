package com.example.calclib

class Calc {
    fun sum(x: Int, y: Int): Int = x + y
}

fun main(){
    val calc = Calc();
    calc.sum(3, 4)
}