package com.asrul.keyboardabangkuuh.ui.component

import BackspaceKey
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.appcompat.app.AppCompatDelegate.NightMode
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.UiMode
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType.Accent
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType.Primary
import com.asrul.keyboardabangkuuh.ui.component.KeyboardKeyAttr.KeyboardKeyType.Secondary
import com.asrul.keyboardabangkuuh.ui.theme.Color.BlackAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GrayDarkAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GrayLightAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GrayMediumAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.GreenAbangkuh
import com.asrul.keyboardabangkuuh.ui.theme.Color.WhiteAbangkuh

@Composable
fun KeyboardKeyAbangkuuh(
    value: String,
    onKeyPressed: (String) -> Unit,
    modifier: Modifier = Modifier,
    type: KeyboardKeyType = Primary,
    icon: ImageVector? = null
) {
    Box(
        modifier = modifier
            .height(56.dp)
            .padding(horizontal = 3.dp, vertical = 6.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(6.dp),
                spotColor = type.backgroundColor
            )
            .background(
                brush = linearGradient(listOf(type.backgroundColor, type.backgroundColor.copy(.6f))),
                shape = RoundedCornerShape(6.dp)
            )
            .clickable { onKeyPressed(value) }
            .padding(horizontal = 6.dp),
        contentAlignment = Center
    ) {
        icon?.let {
            Icon(
                imageVector = icon,
                contentDescription = value,
                tint = type.foregroundColor
            )
        } ?: Text(
            text = value,
            fontSize = 17.sp,
            fontWeight = SemiBold,
            color = type.foregroundColor
        )
    }
}

@Composable
@Preview
fun KeyboardKeyAbangkuhPreview() {
    Row(modifier = Modifier.background(GrayLightAbangkuh)) {
        KeyboardKeyAbangkuuh(
            type = Primary,
            value = "Q",
            onKeyPressed = {},
            icon = null, modifier = Modifier.weight(1f)
        )
        KeyboardKeyAbangkuuh(
            type = Secondary,
            value = "W",
            onKeyPressed = {},
            icon = null,
            modifier = Modifier.width(56.dp)
        )
        KeyboardKeyAbangkuuh(
            type = Accent,
            value = "E",
            onKeyPressed = {},
            icon = BackspaceKey
        )
    }
}

@Composable
fun KeyboardTextAbangkuuh(
    value: String,
    onKeyPressed: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .wrapContentWidth()
            .padding(5.dp, 3.dp)
            .background(WhiteAbangkuh, RoundedCornerShape(6.dp))
            .clickable { onKeyPressed(value) }
            .padding(horizontal = 10.dp, vertical = 4.dp),
        contentAlignment = Center
    ) {
        Text(
            text = value,
            color = BlackAbangkuh
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 1000)
fun KeyboardTextAbangkuuhPreview() {
    KeyboardTextAbangkuuh(
        value = "kasih paham capt \uD83D\uDD25\uD83D\uDE4C\uD83C\uDFFB\uD83D\uDCAF",
        onKeyPressed = {}
    )
}