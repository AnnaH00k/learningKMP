package tech.hookin.learningkmp.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.platform.LocalWindowInfo


@OptIn(ExperimentalFoundationApi::class)
@Composable
actual fun getScreenHeightDp(): Dp {
    val heightPx = LocalWindowInfo.current.containerSize.height.toFloat()
    return with(LocalDensity.current) { heightPx.toDp() }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
actual fun getScreenWidthDp(): Dp {
    val widthPx = LocalWindowInfo.current.containerSize.width.toFloat()
    return with(LocalDensity.current) { widthPx.toDp() }
}
