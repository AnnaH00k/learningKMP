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
    text: String = "#000000",
    content: @Composable () -> Unit
) {
    val backgroundColor = background.toColorOrNull() ?: Color.White
    val textColor = text.toColorOrNull() ?: Color.Black

    val screenHeightDp = getScreenHeightDp()

    val topPadding = if (screenHeightDp < 600.dp) {
        Vh(10f)
    } else {
        Vh(5f)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()  // Full window space
            .background(backgroundColor)  // Covers behind insets
            .navigationBarsPadding()  // Android: Consumes bottom nav bar space with background
            .imePadding(),  // Handles keyboard overlap if needed
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = topPadding, start = 4.dp, end = 4.dp, bottom = 4.dp),  // Content padding inside
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CompositionLocalProvider(
                LocalTextStyle provides MaterialTheme.typography.bodyMedium.copy(color = textColor)
            ) {
                content()
            }
            Spacer(modifier = Modifier.weight(1f))  // Fills to bottom
        }
    }
}
