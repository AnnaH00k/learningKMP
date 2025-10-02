package tech.hookin.learningkmp.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Expect: Plattform-spezifische Abfragen (jetzt @Composable für Konsistenz)
@Composable
expect fun getScreenHeightDp(): Dp

@Composable
expect fun getScreenWidthDp(): Dp

// Extension für Dp-Multiplikation
fun Dp.times(factor: Float): Dp = Dp(this.value * factor)

// vh und vw bleiben gleich, da sie nun auf composable expects bauen
@Composable
fun Vh(v: Float): Dp = getScreenHeightDp().times(v / 100f)

@Composable
fun Vw(v: Float): Dp = getScreenWidthDp().times(v / 100f)
