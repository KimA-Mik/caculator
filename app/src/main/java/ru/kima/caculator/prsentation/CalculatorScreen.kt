package ru.kima.caculator.prsentation

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kima.caculator.domain.CalculatorAction
import ru.kima.caculator.ui.theme.CaculatorTheme

@Composable
fun CalculatorScreen(
    modifier: Modifier = Modifier,
    state: CalculatorState,
    onAction: (CalculatorAction) -> Unit
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CalculatorDisplay(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp, end = 8.dp),
            state = state
        )
        CalculatorButtonsGrid(
            modifier = Modifier.padding(8.dp),
            onAction = onAction
        )
    }
}


@Preview(name = "Day calculator screen preview")
@Preview(
    name = "Night calculator screen preview",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun CalculatorScreenPreview() {
    CaculatorTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CalculatorScreen(
                modifier = Modifier.fillMaxSize(),
                CalculatorState()
            ) {

            }
        }
    }
}