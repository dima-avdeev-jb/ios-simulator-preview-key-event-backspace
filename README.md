## Compose for iOS bug reproducer https://github.com/JetBrains/compose-multiplatform/issues/3855


Backspace key handled in Modifier `.onPreviewKeyEvent { event ->`.

Handled successfully with physical keyboard on simulator, but not handled with on-screen keyboard.
