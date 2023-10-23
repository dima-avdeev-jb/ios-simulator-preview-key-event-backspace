import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent

@Composable
fun App() {
    var text by remember { mutableStateOf("Focus to TextField and press backspace") }
    var backSpaceCounter by remember { mutableStateOf(0) }

    Column {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .onPreviewKeyEvent { event ->
                    if (event.key == Key.Backspace) {
                        backSpaceCounter++
                        true
                    } else {
                        false
                    }
                },
            value = text,
            onValueChange = {
                text = it
            }
        )
        Text("Backspace pressed $backSpaceCounter times")
    }

}
