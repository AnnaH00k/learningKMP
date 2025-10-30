package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(
    searchQuery: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    backgroundColorHex: String? = null,
    textColorHex: String? = null,
    borderColorHex: String? = null,
    modifier: Modifier = Modifier
) {
    val backgroundColor = backgroundColorHex?.let { HexToColor(it) } ?: Color(0xFF435A4D)
    val textColor = textColorHex?.let { HexToColor(it) } ?: Color(0xFF779F7F)
    val borderColor = borderColorHex?.let { HexToColor(it) } ?: Color(0xFF779F7F)
    val shape = RoundedCornerShape(50.dp)

    Box(modifier = Modifier.padding(vertical = 3.dp)) {

        TextField(
            value = searchQuery,
            onValueChange = onValueChange,
            placeholder = { Text("Search", color = textColor) },
            singleLine = true,
            modifier = modifier
                .widthIn(min = 150.dp, max = 300.dp)
                .border(1.dp, borderColor, shape)
                .background(backgroundColor, shape),
            colors = TextFieldDefaults.colors(
                focusedTextColor = textColor,
                unfocusedTextColor = textColor,
                disabledTextColor = textColor.copy(alpha = 0.5f),
                focusedContainerColor = backgroundColor,
                unfocusedContainerColor = backgroundColor,
                disabledContainerColor = backgroundColor.copy(alpha = 0.5f),
                cursorColor = textColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),
            shape = shape
        )
    }
}
