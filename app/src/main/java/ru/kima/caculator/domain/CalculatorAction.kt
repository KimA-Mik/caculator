package ru.kima.caculator.domain

sealed interface CalculatorAction {
    data class Operation(val type: OperationType) : CalculatorAction
    data class Number(val value: Int) : CalculatorAction
    data object Backspace : CalculatorAction
    data object Clear: CalculatorAction
    data object Dot: CalculatorAction
    data object Calculate: CalculatorAction
}