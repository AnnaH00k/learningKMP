package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ColumnScope.SpacerBox(heightWeight: Float = 1f) {  // Hinzugefügt: ColumnScope als Empfänger
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .weight(heightWeight)
    )
}
