package com.farhan.tanvir.androidcleanarchitecture.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val BlueGrey900 = Color(0xFF263238)

val Colors.statusBarColor
    get() = if (isLight) Purple700 else BlueGrey900

val Colors.titleColor
    get() = if (isLight) Black else White

val Colors.topAppbarBackgroundColor
    get() = if (isLight) Purple700 else  BlueGrey900
