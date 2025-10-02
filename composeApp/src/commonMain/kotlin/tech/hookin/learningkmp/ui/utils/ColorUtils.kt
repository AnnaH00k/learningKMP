package tech.hookin.learningkmp.ui.utils

import androidx.compose.ui.graphics.Color

fun String.toColorOrNull(): Color? {
    return try {
        val cleanHex = this.removePrefix("#")
        val colorLong = cleanHex.toLong(16)
        Color(colorLong or 0xFF000000)  // Fügt Alpha (FF) hinzu, falls nicht vorhanden
    } catch (e: Exception) {
        null  // Ungültiger Hex -> null
    }
}
