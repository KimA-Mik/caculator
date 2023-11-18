package ru.kima.caculator.prsentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ru.kima.caculator.domain.OperationType
import ru.kima.caculator.ui.theme.CaculatorTheme

@Composable
fun CalculatorDisplay(
    modifier: Modifier = Modifier,
    state: CalculatorState
) {
    val text = if (state.firstNumber.isEmpty()) {
        "0"
    } else {
        "${state.firstNumber} ${state.operation?.symbol ?: String()} ${state.secondNumber}"
    }
    Box(
        modifier = modifier,
        contentAlignment = Alignment.CenterEnd) {
        Text(text = text, fontSize = 72.sp)
    }
}

@Preview
@Composable
fun PreviewCalculatorDisplay() {
    CaculatorTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CalculatorDisplay(
                modifier = Modifier.fillMaxWidth(),
                state = CalculatorState("2", OperationType.ADD, "256")
            )
        }
    }
}