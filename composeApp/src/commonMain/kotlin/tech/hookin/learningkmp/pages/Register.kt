package tech.hookin.learningkmp.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tech.hookin.learningkmp.ui.components.H2
import tech.hookin.learningkmp.ui.components.MainButton
import tech.hookin.learningkmp.ui.components.MainPage
@Composable
fun Register(BackClick: () -> Unit) {
    MainPage(background = "#779F7F", textColor = "#202226") {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {

            MainButton(
                text = "Back",
                onClick = BackClick,
            )
        }
        H2("Register")
    }
}