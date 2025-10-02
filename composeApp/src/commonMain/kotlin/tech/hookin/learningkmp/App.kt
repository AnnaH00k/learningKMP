package tech.hookin.learningkmp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import tech.hookin.learningkmp.ui.components.CenteredBoxWithPadding
import tech.hookin.learningkmp.ui.components.QuestionSection
import tech.hookin.learningkmp.ui.components.SpacerBox
import tech.hookin.learningkmp.ui.components.MainPage

@Composable
@Preview
fun App() {

        MainPage(background = "#0F1B2E",  text = "#FDD8E6") {

                Text("What is Kotlin Multiplatform (KMP)?")
                Text("KMP lässt dich Code zwischen Android, iOS, Web und Desktop teilen.")

                // Sektion 1: Boxes mit Text und Alignments
                QuestionSection("1. Boxes mit Text und Alignments") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color.Black),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Zentrierter Text in einer Box")
                    }
                }

                // Sektion 2: Fluid-Seite
                QuestionSection("2. Fluid-Seite") {
                    Text("Verwende fillMaxSize() und weight() für responsive Layouts.")
                }

                // Sektion 3: Color Schemes festlegen
                QuestionSection("3. Color Schemes festlegen") {
                    Text("Definiere in MaterialTheme, z.B. primary = Color(0xFF6200EE).")
                }

                // Sektion 4: Wichtigste KMP-Packages
                QuestionSection("4. Wichtigste KMP-Packages") {
                    Text("androidx.compose, kotlinx.coroutines, kotlinx.serialization, etc.")
                }

                // Neue Sektion: Vordefinierte Boxes
                QuestionSection("Vordefinierte Boxes (z. B. Spacer und Zentriert)") {
                    CenteredBoxWithPadding {
                        Text("Zentrierter Text in der Box")
                    }
                }
            }

    }

