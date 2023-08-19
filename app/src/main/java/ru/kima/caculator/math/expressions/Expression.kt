package ru.kima.caculator.math.expressions

class Expression {
    var value: Double = 0.0

    fun addDigit(digit: Int) {
        val singleDigit = digit % 10
        value = value * 10 + digit
    }

    fun removeDigit() {
        value = (value - (value % 10)) / 10
    }
}