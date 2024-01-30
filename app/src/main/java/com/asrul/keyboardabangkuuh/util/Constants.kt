package com.asrul.keyboardabangkuuh.util

import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.COMMA
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DELETE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DOT
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.ENTER
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.MENYALA
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SHIFT
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SPACE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SWITCH

object Constants {
    object KeyboardKey {
        const val MENYALA = "MENYALA"
        const val DELETE = "DELETE"
        const val SHIFT = "SHIFT"
        const val ENTER = "ENTER"
        const val SWITCH = "SWITCH"
        const val COMMA = "COMMA"
        const val SPACE = "SPACE"
        const val DOT = "DOT"
    }

    object Number {
        const val ZERO = 0
        const val ONE = 1
        const val TWO = 2
        const val THREE = 3
        const val FOUR = 4
        const val FIVE = 5
        const val SIX = 6
        const val SEVEN = 7
        const val EIGHT = 8
        const val NINE = 9
    }

    object Emoji {
        const val FIRE = "🔥"
        const val HANDS_UP = "🙌🏻"
        const val ONE_HUNDRED = "💯"
        const val RESPECT = "🫡"
        const val OKE = "👍🏻"
        const val HIGH_FIVE = "🙏"
        const val MELTING = "🫠"
    }

    val uppercase = arrayOf(
        arrayOf("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"),
        arrayOf("A", "S", "D", "F", "G", "H", "J", "K", "L"),
        arrayOf(SHIFT, "Z", "X", "C", "V", "B", "N", "M", DELETE),
        arrayOf(SWITCH, COMMA, MENYALA, SPACE, DOT, ENTER)
    )

    val lowercase = arrayOf(
        arrayOf("q", "w", "e", "r", "t", "y", "u", "i", "o", "p"),
        arrayOf("a", "s", "d", "f", "g", "h", "j", "k", "l"),
        arrayOf(SHIFT, "z", "x", "c", "v", "b", "n", "m", DELETE),
        arrayOf(SWITCH, COMMA, MENYALA, SPACE, DOT, ENTER)
    )

    val template = arrayOf(
        "manyala capt 🔥🔥",
        "tetep ilmu padi 🌾🌾",
        "terbaik kandaku 🙌🏼",
        "mahkotamu masih dilas, king 👑",
        "giling terus boss 💪",
        "gas kanda 🔥🔥",
        "tipis tipis 🔥🔛🔝",
        "tetaplah ilmu padi 🌾🙇‍♂️🌾🔝🔝🔝",
        "lanjutkan abangkuuhh 🔥🔝💥",
        "kasih paham tipis tipis 🤝🏼",
        "top selalu idola 🔥",
        "tipis tipis asal menyala king 👑🔥",
        "idola 🙌🏼🙌🏼",
        "tetap membumi abangkuh 🔥🙌🏼🌎",
        "sesekali 🙌🏼",
        "kalau diatas jgn lupa merunduk 🌾🙌🏼🙇‍♂️",
        "eh yg punya setengah indo nih ee 😜😜",
        "eitsss pondasi bangsa abangkuuhh 🔥🔝🙌🏼",
        "kelas abangda 🔥🫡",
        "kasih jedag jedug dulu abangkuh🤩🥵",
        "jangan kasi longgar king 🔝💯🔥🙌🏼",
        "wanita mana yang berani menyakitimu king 💯💯💪❤‍🔥",
        "kelas banget kanda 🙏🏼🕺🏻",
        "panutan 🔝✊🏼🙌🏼",
        "top abangku 👍🏼👍🏼",
        "percaya proses capt 🔥🔥",
        "manyala ilmu padi 🌾🔥",
        "kelas abangkuu 🔥🔝",
        "🔛🔝 selalu idola 🔥",
        "ini mahkotamu king 👑",
        "trcium aroma ilmu padi abangkuh🔥🔥🌾🌾",
        "jangan kasih kendor ee 🕺🏻🕺🏻",
        "apotik tutup captain 🔥🔥💯🔝",
        "kasih paham capt 🔥💯🙌🏼",
        "percaya proses king 💯💯💪❤‍🔥",
        "izin abangkuu 🔥",
        "mahkota sedang transit di dc cakung kingg 🔥👑🙇‍♂️",
        "rispeekk 👍🏼🙌🏼",
        "kasih keras idola 🔥🔥",
        "kasih keras abangkuhh 🔥👊🏼",
        "kelas boskuuuh 🔥👍🏼",
        "capt idolaa 🔥🙌🏼🔝",
        "weees kelas abangku 🔥🔥",
        "terstill💪💪",
        "abang idola panutan ini 😘😘",
        "top 🔝",
        "meroket abangku 🚀🚀🚀",
        "starboy vibez🥵😎🥀💥🐙",
        "isinya daging semua abangkuu🔥🔥🔛🔝",
        "jagoan mama muncul 🔥🔥🔥",
        "beraksi🍻🍻",
        "kasih apa? kasih paham abangkuhh👊👊👊🔥🔥🔥🔥",
        "kasih paham queen, ilmu baddie 🔥🔥💅💅",
        "kasih paham queen 🤭🔥 MENYALA",
        "manyala panutan abangda 🔥🔥",
        "kasih tebal king 🤙🤙",
        "kasih tahu abangkuuu🔥🔥🙇‍♂️🙇‍♂️",
        "sungkem dulu abangkuuu🙇‍♂️🙇‍♂️",
        "biarkan abangku memasakkk🔥🔥🧑‍🍳🧑‍🍳",
        "kasi paham wakk 🔥🔥🔥",
        "eihhh mantaapp pedii kaliii 🔥🔥🔥",
        "bertahap abangkuuuu🔥🤙🪜👟",
        "nikmati proses kakandaaa🤙🔥🙇‍♂️",
        "jangan kasih kendor king 🔥🔥🔥",
        "gokil capt kaki tiga🦵🔥🔥"
    )
}