package tech.hookin.learningkmp.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import tech.hookin.learningkmp.objects.User
import tech.hookin.learningkmp.ui.components.H2
import tech.hookin.learningkmp.ui.components.MainButton
import tech.hookin.learningkmp.ui.components.MainPage

@Composable
fun Dashboard(
    BackClick: () -> Unit,
    currentUser: User,
    registeredUsers: List<User>
) {
    MainPage(background = "#779F7F", textColor = "#202226") {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            MainButton(
                text = "Back",
                onClick = BackClick,
            )
        }
        H2("Dashboard")

        Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
            H2("Logged in as:")
            Text("ID: ${currentUser.id}")
            Text("Name: ${currentUser.name}")
            Text("Email: ${currentUser.email}")
            Spacer(modifier = Modifier.fillMaxWidth())
            H2("All Registered Users")
            // Table headers
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Text("ID", modifier = Modifier.weight(2f))
                Text("Name", modifier = Modifier.weight(2f))
                Text("Email", modifier = Modifier.weight(3f))
                Text("Password", modifier = Modifier.weight(3f))
            }
            // List all users
            registeredUsers.forEach { user ->
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text(user.id, modifier = Modifier.weight(2f))
                    Text(user.name, modifier = Modifier.weight(2f))
                    Text(user.email, modifier = Modifier.weight(3f))
                    Text(user.password, modifier = Modifier.weight(3f))
                }
            }
        }
    }
}
