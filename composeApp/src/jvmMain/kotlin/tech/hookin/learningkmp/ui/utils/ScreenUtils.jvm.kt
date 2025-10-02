package tech.hookin.learningkmp.ui.utils

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import java.awt.Toolkit

@Composable
actual fun getScreenHeightDp(): Dp {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    val heightPx = screenSize.height.toFloat()
    return with(LocalDensity.current) { heightPx.toDp() }
}

@Composable
actual fun getScreenWidthDp(): Dp {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    val widthPx = screenSize.width.toFloat()
    return with(LocalDensity.current) { widthPx.toDp() }
}
