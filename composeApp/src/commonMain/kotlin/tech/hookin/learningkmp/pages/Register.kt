package tech.hookin.learningkmp.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import tech.hookin.learningkmp.ui.components.CenteredRow
import tech.hookin.learningkmp.ui.components.H2
import tech.hookin.learningkmp.ui.components.MainButton
import tech.hookin.learningkmp.ui.components.MainPage
import tech.hookin.learningkmp.ui.components.MainTextInput
import tech.hookin.learningkmp.ui.components.PasswordInput

@Composable
fun Register(
    BackClick: () -> Unit,
    onRegisterSubmit: (name: String, email: String, password: String) -> Unit
) {
    val nameState = remember { mutableStateOf("") }
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }
    val isPasswordValid = remember { mutableStateOf(false) }

    MainPage(background = "#779F7F", textColor = "#202226") {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            MainButton(
                text = "Back",
                onClick = BackClick,
            )
        }
        H2("Register")
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            MainTextInput(
                value = nameState.value,
                onValueChange = { nameState.value = it },
                label = "Name",
                modifier = Modifier.fillMaxWidth(),
            )
            MainTextInput(
                value = emailState.value,
                onValueChange = { emailState.value = it },
                label = "Email",
                modifier = Modifier.fillMaxWidth(),
            )
            PasswordInput(
                onValueChange = { passwordState.value = it },
                passwordValue = passwordState.value,
                onValidationChange = { isPasswordValid.value = it }
            )
        }
        CenteredRow() {
            MainButton(
                text = "Register",
                enabled = isPasswordValid.value,
                onClick = {
                    onRegisterSubmit(nameState.value, emailState.value, passwordState.value)
                },
            )
        }
    }
}
