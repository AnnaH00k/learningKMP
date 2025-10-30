package tech.hookin.learningkmp


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import tech.hookin.learningkmp.pages.Login
import tech.hookin.learningkmp.pages.Register

// Screen-Enum für Navigation
enum class Screen {
    HOME,
    LOGIN,
    REGISTER
}

@Composable
fun App() {
    var currentScreen by remember { mutableStateOf(Screen.HOME) }


        when (currentScreen) {
            Screen.HOME -> {
                Landingpage(
                    NavigateToLogin = {
                        currentScreen = Screen.LOGIN
                    },
                    NavigateToRegister = {
                        currentScreen = Screen.REGISTER
                    }
                )
            }
            Screen.LOGIN -> {
                Login(
                    BackClick = {
                        currentScreen = Screen.HOME
                    }
                )
            }

            Screen.REGISTER -> {
                Register(
                    BackClick = {
                        currentScreen = Screen.HOME
                    }
                )
            }
        }

}

