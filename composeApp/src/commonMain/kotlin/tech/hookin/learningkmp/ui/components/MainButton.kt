package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    backgroundColorHex: String? = null,
    textColorHex: String? = null,
    borderColorHex: String? = null,
    enabled: Boolean = true,
) {
    val backgroundColor = backgroundColorHex?.let { HexToColor(it) } ?: Color(0xFF435A4D)
    val textColor = textColorHex?.let { HexToColor(it) } ?: Color(0xFFEDF5EE)
    val borderColor = borderColorHex?.let { HexToColor(it) } ?: Color(0xFF202226)

    Box(
        modifier = modifier
            .padding(12.dp),
    ) {
        Button(
            onClick = onClick,
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                containerColor = backgroundColor,
                contentColor = textColor,
                disabledContainerColor = backgroundColor.copy(alpha = 0.3f),
                disabledContentColor = textColor.copy(alpha = 0.5f)
            ),
            border = BorderStroke(1.dp, borderColor),
        ) {
            Text(
                text = text,
                color = textColor,
                maxLines = 1
            )
        }
    }
}




