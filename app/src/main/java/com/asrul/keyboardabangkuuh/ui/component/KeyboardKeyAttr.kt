package com.asrul.keyboardabangkuuh.ui.component

import androidx.compose.ui.graphics.Color
import com.asrul.keyboardabangkuuh.ui.theme.Color.BlackAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GrayDarkAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GreenAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.WhiteAbangkuh

object KeyboardKeyAttr {
    sealed class KeyboardKeyType(
        open val backgroundColor: Color,
        open val foregroundColor: Color
    ) {
        data object Primary : KeyboardKeyType(
            backgroundColor = WhiteAbangkuh,
            foregroundColor = BlackAbangkuh
        )

        data object Secondary : KeyboardKeyType(
            backgroundColor = GrayDarkAbangkuh,
            foregroundColor = BlackAbangkuh
        )

        data object Accent : KeyboardKeyType(
            backgroundColor = GreenAbangkuh,
            foregroundColor = WhiteAbangkuh
        )
    }
}