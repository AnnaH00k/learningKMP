package tech.hookin.learningkmp.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// External Deklaration für window (Browser-API, ohne unresolved references)
external val window: Window

external interface Window {
    val innerHeight: Int
    val innerWidth: Int
}

// Actual-Implementierungen (jetzt @Composable, um mit expect zu matchen)
@Composable
actual fun getScreenHeightDp(): Dp {
    val heightPx = window.innerHeight.toFloat()
    return with(LocalDensity.current) { heightPx.toDp() }
}

@Composable
actual fun getScreenWidthDp(): Dp {
    val widthPx = window.innerWidth.toFloat()
    return with(LocalDensity.current) { widthPx.toDp() }
}
