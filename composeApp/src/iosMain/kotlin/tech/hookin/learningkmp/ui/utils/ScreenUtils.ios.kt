@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)  // Falls nötig, für UIKit-Interop

package tech.hookin.learningkmp.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp  // Für dp
import platform.UIKit.UIScreen
import platform.CoreGraphics.CGRectGetHeight  // Hilfsfunktion für sicheren Zugriff (optional, aber löst Resolver-Probleme)
import platform.CoreGraphics.CGRectGetWidth

@Composable
actual fun getScreenHeightDp(): Dp {
    val screen = UIScreen.mainScreen
    val bounds = screen.bounds
    val heightPx = (CGRectGetHeight(bounds) * screen.scale).toFloat()  // Zu Float casten für toDp()
    return with(LocalDensity.current) { heightPx.toDp() }
}

@Composable
actual fun getScreenWidthDp(): Dp {
    val screen = UIScreen.mainScreen
    val bounds = screen.bounds
    val widthPx = (CGRectGetWidth(bounds) * screen.scale).toFloat()  // Zu Float casten für toDp()
    return with(LocalDensity.current) { widthPx.toDp() }
}
