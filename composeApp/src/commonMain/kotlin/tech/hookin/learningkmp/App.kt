package tech.hookin.learningkmp


import androidx.compose.material3.*
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import tech.hookin.learningkmp.ui.components.CenteredRow
import tech.hookin.learningkmp.ui.components.ChallengorHeadline
import tech.hookin.learningkmp.ui.components.MainButton
import tech.hookin.learningkmp.ui.components.MainPage
import tech.hookin.learningkmp.ui.components.H2

@Composable
@Preview
fun App() {

    MainPage(background = "#779F7F", textColor = "#202226") {

        ChallengorHeadline()
        H2("Find and create your next challenge")



        CenteredRow {


            MainButton(
                text = "Login",
                onClick = {/* add link */ },
            )
            MainButton(
                text = "Register",
                onClick = {/* add link */ },
            )
        }


    }

}

