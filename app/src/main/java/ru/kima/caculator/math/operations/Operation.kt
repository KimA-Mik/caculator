package ru.kima.caculator.math.operations

interface Operation {
    fun perform(lhs: Double, rhs: Double): Double
}