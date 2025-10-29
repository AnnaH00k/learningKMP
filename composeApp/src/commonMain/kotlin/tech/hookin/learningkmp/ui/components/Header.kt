package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import learningkmp.composeapp.generated.resources.Res
import learningkmp.composeapp.generated.resources.logoC
import org.jetbrains.compose.resources.painterResource


@Composable
fun Header() {
    val backgroundColor = HexToColor("#435A4D")
    val textColor = HexToColor("#779F7F")

    var searchQuery by remember { mutableStateOf(TextFieldValue("")) }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = backgroundColor,
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(Res.drawable.logoC),
                contentDescription = "Challengor logo",
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
            )

            // Search Bar
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search", color = textColor.copy(alpha = 0.6f)) },
                singleLine = true,

                modifier = Modifier
                    .widthIn(min = 150.dp, max = 300.dp)
                    .height(36.dp)
                    .background(color = backgroundColor, shape = RoundedCornerShape(8.dp))
            )
        }
    }
}