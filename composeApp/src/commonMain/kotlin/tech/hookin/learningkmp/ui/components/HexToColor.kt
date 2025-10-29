package tech.hookin.learningkmp.ui.components

import androidx.compose.ui.graphics.Color

fun HexToColor(hex: String): Color {
    val cleanedHex = hex.removePrefix("#")
    // Accepts 6 or 8 digit hex codes (RGB or ARGB)
    return try {
        when (cleanedHex.length) {
            6 -> Color(
                red = cleanedHex.substring(0, 2).toInt(16),
                green = cleanedHex.substring(2, 4).toInt(16),
                blue = cleanedHex.substring(4, 6).toInt(16),
                alpha = 0xFF
            )
            8 -> Color(
                alpha = cleanedHex.substring(0, 2).toInt(16),
                red = cleanedHex.substring(2, 4).toInt(16),
                green = cleanedHex.substring(4, 6).toInt(16),
                blue = cleanedHex.substring(6, 8).toInt(16)
            )
            else -> Color(0xFF435A4D)
        }
    } catch (e: Exception) {
        Color(0xFF435A4D)
    }
}