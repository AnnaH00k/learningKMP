package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PasswordInput(
    onValueChange: (String) -> Unit,
    passwordValue: String,
    onValidationChange: (Boolean) -> Unit // reports valid or invalid
) {
    val errorState = remember { mutableStateOf<String?>(null) }

    fun validatePassword(input: String): String? {
        if (input.length < 6) {
            return "Password must be at least 6 characters"
        }
        val forbiddenChars = "<>{}()[];:'\"\\/"
        if (input.any { it in forbiddenChars }) {
            return "Password contains invalid characters"
        }
        return null
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        MainTextInput(
            value = passwordValue,
            onValueChange = { newValue ->
                onValueChange(newValue)
                val error = validatePassword(newValue)
                errorState.value = error
                onValidationChange(error == null)
            },
            label = "Password",
            modifier = Modifier.fillMaxWidth()
        )
        errorState.value?.let { error ->
            Text(
                text = error,
                color = Color.Red,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
    }
}
