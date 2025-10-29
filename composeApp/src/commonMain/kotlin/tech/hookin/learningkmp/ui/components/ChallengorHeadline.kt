package tech.hookin.learningkmp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import learningkmp.composeapp.generated.resources.Res

import learningkmp.composeapp.generated.resources.challengorHeadline


@Composable
fun ChallengorHeadline(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(Res.drawable.challengorHeadline),
        contentDescription = "Challengor Headline",
        modifier = modifier.sizeIn(maxWidth = 600.dp) // example max width 200.dp
    )
}
