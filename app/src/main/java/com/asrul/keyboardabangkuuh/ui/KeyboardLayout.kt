package com.asrul.keyboardabangkuuh.ui

import BackspaceKey
import EnterKey
import SearchKey
import SendKey
import ShiftKey
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAbangkuuh
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType.Accent
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType.Primary
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType.Secondary
import com.asrul.keyboardabangkuuh.ui.component.KeyboardTextAbangkuuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GrayLightAbangkuh
import com.asrul.keyboardabangkuuh.util.Constants.Emoji.FIRE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.COMMA
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DELETE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DOT
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.ENTER
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.MENYALA
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SHIFT
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SPACE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SWITCH
import com.asrul.keyboardabangkuuh.util.Constants.Number.FIVE
import com.asrul.keyboardabangkuuh.util.Constants.Number.FOUR
import com.asrul.keyboardabangkuuh.util.Constants.Number.ONE
import com.asrul.keyboardabangkuuh.util.Constants.Number.SEVEN
import com.asrul.keyboardabangkuuh.util.Constants.Number.SIX
import com.asrul.keyboardabangkuuh.util.Constants.Number.THREE
import com.asrul.keyboardabangkuuh.util.Constants.template
import com.asrul.keyboardabangkuuh.util.Constants.uppercase
import com.asrul.keyboardabangkuuh.util.simpleVerticalScrollbar

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun KeyboardLayout(
    keysMatrix: MutableState<Array<Array<String>>>,
    currentImeOptions: Int,
    onKeyPressed: (String) -> Unit
) {
    val scrollState = rememberScrollState()
    var isExpanded by remember { mutableStateOf(false) }
    val animateHeight by animateDpAsState(
        targetValue = if (isExpanded) 200.dp else 75.dp,
        label = "height",
        animationSpec = tween(100)
    )

    BoxWithConstraints {
        val max = maxWidth / 10
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(GrayLightAbangkuh)
                .wrapContentHeight(),
            verticalArrangement = Center,
            horizontalAlignment = CenterHorizontally
        ) {
            Box(
                contentAlignment = BottomEnd,
                modifier = Modifier.background(GrayLightAbangkuh)
            ) {
                FlowRow(
                    modifier = Modifier
                        .padding(start = 4.dp, end = 4.dp, top = 8.dp)
                        .fillMaxWidth()
                        .height(animateHeight)
                        .verticalScroll(scrollState, isExpanded)
                        .simpleVerticalScrollbar(scrollState)
                ) {
                    template.forEach { value ->
                        KeyboardTextAbangkuuh(
                            value = value,
                            modifier = Modifier.wrapContentWidth(),
                            onKeyPressed = { onKeyPressed(it) }
                        )
                    }
                }

                KeyboardKeyAbangkuuh(
                    modifier = Modifier.height(48.dp),
                    value = isExpanded.toString(),
                    onKeyPressed = {
                        isExpanded = !isExpanded
                    },
                    type = Accent,
                    icon = if (isExpanded) Default.KeyboardArrowDown else Default.KeyboardArrowUp
                )
            }
            keysMatrix.value.forEach { row ->
                Row(
                    modifier = Modifier.background(GrayLightAbangkuh)
                ) {
                    row.forEach {
                        val enterIcon = when (currentImeOptions) {
                            ONE -> EnterKey
                            THREE -> SearchKey
                            FOUR -> SendKey
                            SIX -> Default.KeyboardArrowRight
                            SEVEN -> Default.Check
                            FIVE -> Default.KeyboardArrowLeft
                            else -> Default.KeyboardArrowRight
                        }

                        val icon = when (it) {
                            SHIFT -> ShiftKey
                            DELETE -> BackspaceKey
                            ENTER -> EnterKey
                            else -> null
                        }

                        val replaceValue = when (it) {
                            DOT -> "."
                            SPACE -> " "
                            COMMA -> ","
                            MENYALA -> FIRE
                            SWITCH -> "?123"
                            else -> it
                        }

                        val modifier = when (it) {
                            SPACE -> Modifier.width(max * 4)
                            SWITCH, SHIFT, DELETE, ENTER -> Modifier.weight(1f)
                            else -> Modifier.width(max)
                        }

                        val type = when (it) {
                            SHIFT, DELETE, COMMA, DOT, SWITCH -> Secondary
                            ENTER -> Accent
                            else -> Primary
                        }

                        KeyboardKeyAbangkuuh(
                            icon = icon,
                            value = replaceValue,
                            onKeyPressed = { text -> onKeyPressed(text) },
                            modifier = modifier,
                            type = type
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun LayoutPrev() {
    KeyboardLayout(
        keysMatrix = mutableStateOf(uppercase), onKeyPressed = {}, currentImeOptions = 0
    )
}