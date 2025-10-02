package tech.hookin.learningkmp.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
actual fun getScreenHeightDp(): Dp {
    val configuration = LocalConfiguration.current
    return with(LocalDensity.current) { configuration.screenHeightDp.dp }
}

@Composable
actual fun getScreenWidthDp(): Dp {
    val configuration = LocalConfiguration.current
    return with(LocalDensity.current) { configuration.screenWidthDp.dp }
}
