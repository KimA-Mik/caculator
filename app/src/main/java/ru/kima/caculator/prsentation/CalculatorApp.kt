package ru.kima.caculator.prsentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.kima.caculator.ui.theme.CaculatorTheme

@Preview
@Composable
fun CalculatorApp(
    viewModel: CalculatorViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    CaculatorTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            val state by viewModel.state.collectAsState()
            CalculatorScreen(
                modifier = Modifier.fillMaxSize(),
                state = state
            ) { action ->
                viewModel.onAction(action)
            }
        }
    }
}