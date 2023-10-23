## Compose for iOS bug reproducer
Backspace key handled in Modifier `.onPreviewKeyEvent { event ->`.

Handled successfully with physical keyboard on simulator, but not handled with on-screen keyboard.
