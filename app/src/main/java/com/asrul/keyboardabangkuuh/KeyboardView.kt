package com.asrul.keyboardabangkuuh

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.EditorInfo.IME_ACTION_NONE
import android.view.inputmethod.EditorInfo.IME_MASK_ACTION
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.text.input.ImeOptions
import com.asrul.keyboardabangkuuh.ui.KeyboardLayout
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.COMMA
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DELETE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DOT
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.ENTER
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.MENYALA
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SHIFT
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SPACE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SWITCH
import com.asrul.keyboardabangkuuh.util.Constants.Number.ONE
import com.asrul.keyboardabangkuuh.util.Constants.Number.TWO
import com.asrul.keyboardabangkuuh.util.Constants.Number.ZERO
import com.asrul.keyboardabangkuuh.util.Constants.lowercase
import com.asrul.keyboardabangkuuh.util.Constants.uppercase

@SuppressLint("ViewConstructor")
class KeyboardView(
    context: Context,
    private val currentImeOptions: Int,
    private val onKeyPressed: (String) -> Unit
) : AbstractComposeView(context) {
    @Composable
    override fun Content() {

        var shiftPressedCount by remember { mutableIntStateOf(ZERO) }
        var lastKeyPressed by remember { mutableLongStateOf(0) }

        val keysMatrix = remember { mutableStateOf(lowercase) }

        LaunchedEffect(shiftPressedCount) {
            keysMatrix.value = if (shiftPressedCount > ZERO) uppercase else lowercase
        }

        KeyboardLayout(
            keysMatrix = keysMatrix,
            currentImeOptions = currentImeOptions,
            onKeyPressed = {
                onKeyPressed(it)
                if (it == SHIFT) {
                    val now = System.currentTimeMillis()
                    when (shiftPressedCount) {
                        ZERO -> {
                            lastKeyPressed = now
                            shiftPressedCount += ONE
                        }

                        ONE -> {
                            shiftPressedCount = if (now - lastKeyPressed < 200) {
                                shiftPressedCount + ONE
                            } else ZERO
                        }

                        TWO -> shiftPressedCount = ZERO
                    }
                } else {
                    if (shiftPressedCount < 2) {
                        shiftPressedCount = ZERO
                    }
                }
            }
        )
    }
}