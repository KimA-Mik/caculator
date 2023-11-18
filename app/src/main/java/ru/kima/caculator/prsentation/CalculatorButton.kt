package ru.kima.caculator.prsentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ru.kima.caculator.ui.theme.CaculatorTheme

@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    symbol: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = symbol,
            color = MaterialTheme.colorScheme.onPrimary,
            textAlign = TextAlign.Center,
            fontSize = 36.sp
        )
    }
}

@Preview(widthDp = 64)
@Composable
fun ButtonPreview() {
    CaculatorTheme {
        CalculatorButton(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .aspectRatio(1f),
            symbol = "+",
            onClick = {})
    }
}