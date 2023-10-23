import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    var text by remember { mutableStateOf("Press backspace or space") }
    var backSpaceCounter by remember { mutableStateOf(0) }
    var spaceCounter by remember { mutableStateOf(0) }

    Column {
        BasicTextField(
            modifier = Modifier
                .padding(8.dp)
                .border(1.dp, Color.Blue)
                .fillMaxWidth()
                .onPreviewKeyEvent { event ->
                    when (event.key) {
                        Key.Backspace -> {
                            backSpaceCounter++
                            true
                        }

                        Key.Spacebar -> {
                            spaceCounter++
                            true
                        }

                        else -> false
                    }
                },
            value = text,
            onValueChange = {
                text = it
            }
        )
        Text("Backspace pressed $backSpaceCounter times")
        Text("Space pressed $spaceCounter times")
    }

}
