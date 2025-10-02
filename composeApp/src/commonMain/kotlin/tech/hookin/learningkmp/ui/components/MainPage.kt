package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import tech.hookin.learningkmp.ui.utils.Vh
import tech.hookin.learningkmp.ui.utils.getScreenHeightDp
import tech.hookin.learningkmp.ui.utils.toColorOrNull

@Composable
fun MainPage(
    background: String = "#FFFFFF",
    text: String = "#000000",  // Neu: Hex-Code für Textfarbe
    content: @Composable () -> Unit
) {
    val backgroundColor = background.toColorOrNull() ?: Color.White
    val textColor = text.toColorOrNull() ?: Color.Black  // Parse Textfarbe

    val screenHeightDp = getScreenHeightDp()

    // Responsive top padding: 10vh nur auf kleinen Geräten (Höhe < 600 dp)
    val topPadding = if (screenHeightDp < 600.dp) {
        Vh(10f)
    } else {
        Vh(5f)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = screenHeightDp)
            .background(backgroundColor)
            .padding(top = topPadding, start = 4.dp, end = 4.dp, bottom = 4.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CompositionLocalProvider(
                LocalTextStyle provides MaterialTheme.typography.bodyMedium.copy(color = textColor)
            ) {
                content()
            }
        }
    }
}
