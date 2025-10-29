package tech.hookin.learningkmp


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import tech.hookin.learningkmp.ui.components.CenteredRow
import tech.hookin.learningkmp.ui.components.ChallengorHeadline
import tech.hookin.learningkmp.ui.components.MainButton
import tech.hookin.learningkmp.ui.components.MainPage
import tech.hookin.learningkmp.ui.components.H2
import tech.hookin.learningkmp.ui.components.Header
import tech.hookin.learningkmp.ui.utils.Vh
import tech.hookin.learningkmp.ui.utils.getScreenHeightDp
import tech.hookin.learningkmp.ui.utils.getScreenWidthDp

@Composable
@Preview
fun App() {

    MainPage(background = "#779F7F", textColor = "#202226") {
        val screenWidthDp = getScreenWidthDp()

        if (screenWidthDp > 600.dp) {
            Header()

        } else {
            Spacer(modifier = Modifier.height(Vh(10f)))

        }
        H2(text = getScreenHeightDp().toString())
        H2(text = getScreenWidthDp().toString())

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

