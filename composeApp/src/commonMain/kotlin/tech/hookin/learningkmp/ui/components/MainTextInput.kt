package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainTextInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    outlineColorHex: String? = "#435A4D",
) {
    val outlineColor = outlineColorHex?.let { HexToColor(it) } ?: Color(0x435A4D)

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        modifier = modifier.padding(12.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = outlineColor,
            unfocusedBorderColor = outlineColor
        )
    )
}
