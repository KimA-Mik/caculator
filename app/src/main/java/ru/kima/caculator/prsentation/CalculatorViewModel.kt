package ru.kima.caculator.prsentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.kima.caculator.domain.CalculatorAction
import ru.kima.caculator.domain.OperationType

class CalculatorViewModel : ViewModel() {
    private val _state = MutableStateFlow(CalculatorState())
    val state = _state.asStateFlow()

    fun onAction(action: CalculatorAction) {
        when (action) {
            CalculatorAction.Backspace -> onBackspace()
            CalculatorAction.Calculate -> onCalculate()
            CalculatorAction.Clear -> onClear()
            CalculatorAction.Dot -> onDot()
            is CalculatorAction.Number -> onInputNumber(action.value)
            is CalculatorAction.Operation -> onOperation(action.type)
        }
    }

    private fun onInputNumber(number: Int) {

    }

    private fun onOperation(operation: OperationType) {

    }

    private fun onBackspace() {

    }

    private fun onCalculate() {

    }

    private fun onClear() {

    }

    private fun onDot() {

    }
}