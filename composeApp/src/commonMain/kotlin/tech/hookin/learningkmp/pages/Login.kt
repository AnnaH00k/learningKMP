package tech.hookin.learningkmp.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import tech.hookin.learningkmp.ui.components.CenteredRow
import tech.hookin.learningkmp.ui.components.H2
import tech.hookin.learningkmp.ui.components.MainButton
import tech.hookin.learningkmp.ui.components.MainPage
import tech.hookin.learningkmp.ui.components.MainTextInput

@Composable
fun Login(
    BackClick: () -> Unit,
    onLoginSubmit: (email: String, password: String) -> Boolean
) {
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }
    val showError = remember { mutableStateOf(false) }

    MainPage(background = "#779F7F", textColor = "#202226") {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            MainButton(
                text = "Back",
                onClick = BackClick,
            )
        }
        H2("Login")

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            MainTextInput(
                value = emailState.value,
                onValueChange = { emailState.value = it },
                label = "Email",
                modifier = Modifier.fillMaxWidth()
            )
            MainTextInput(
                value = passwordState.value,
                onValueChange = { passwordState.value = it },
                label = "Password",
                modifier = Modifier.fillMaxWidth(),
            )
            if (showError.value) {
                Text(
                    text = "Invalid email or password",
                    color = Color.Red,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            CenteredRow {
                MainButton(
                    text = "Login",
                    onClick = {
                        val success = onLoginSubmit(emailState.value, passwordState.value)
                        showError.value = !success
                    },
                )
            }
        }
    }
}
