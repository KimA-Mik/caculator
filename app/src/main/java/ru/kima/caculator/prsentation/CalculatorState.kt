package ru.kima.caculator.prsentation

import ru.kima.caculator.domain.OperationType

data class CalculatorState(
    val firstNumber: String = String(),
    val operation: OperationType? = null,
    val secondNumber: String = String()
)
