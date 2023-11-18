package ru.kima.caculator.prsentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kima.caculator.domain.CalculatorAction
import ru.kima.caculator.domain.OperationType
import ru.kima.caculator.ui.theme.CaculatorTheme

@Composable
fun CalculatorButtonsGrid(
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    val horizontalArrangement = Arrangement.spacedBy(8.dp)
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(horizontalArrangement = horizontalArrangement) {
            CalculatorButton(
                symbol = "AC",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.tertiary)
                    .weight(2f)
                    .aspectRatio(2f)
            ) {
                onAction(CalculatorAction.Clear)
            }

            CalculatorButton(
                symbol = "Del",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.tertiary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Backspace)
            }

            CalculatorButton(
                symbol = "/",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Operation(OperationType.DIV))
            }
        }

        Row(horizontalArrangement = horizontalArrangement) {
            CalculatorButton(
                symbol = "7",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(7))
            }

            CalculatorButton(
                symbol = "8",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(8))
            }

            CalculatorButton(
                symbol = "9",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(9))
            }

            CalculatorButton(
                symbol = "*",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Operation(OperationType.MUL))
            }
        }

        Row(horizontalArrangement = horizontalArrangement) {
            CalculatorButton(
                symbol = "4",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(4))
            }

            CalculatorButton(
                symbol = "5",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(5))
            }

            CalculatorButton(
                symbol = "6",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(6))
            }

            CalculatorButton(
                symbol = "-",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Operation(OperationType.SUB))
            }
        }

        Row(horizontalArrangement = horizontalArrangement) {
            CalculatorButton(
                symbol = "1",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(1))
            }

            CalculatorButton(
                symbol = "2",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(2))
            }

            CalculatorButton(
                symbol = "3",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Number(3))
            }

            CalculatorButton(
                symbol = "+",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Operation(OperationType.ADD))
            }
        }

        Row(horizontalArrangement = horizontalArrangement) {
            CalculatorButton(
                symbol = "0",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(2f)
                    .aspectRatio(2f)
            ) {
                onAction(CalculatorAction.Number(0))
            }

            CalculatorButton(
                symbol = ".",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Dot)
            }

            CalculatorButton(
                symbol = "=",
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary)
                    .weight(1f)
                    .aspectRatio(1f)
            ) {
                onAction(CalculatorAction.Calculate)
            }
        }
    }
}


@Preview(name = "Day Grid Preview")
@Preview(
    name = "Night Grid Preview",
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun GridPreview() {
    CaculatorTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CalculatorButtonsGrid(modifier = Modifier.fillMaxSize()) {

            }
        }
    }
}