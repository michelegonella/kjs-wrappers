package com.nominanuda.krui.react.native

import kotlinext.js.jsObject
import react.native.Dimensions
import react.native.PixelRatio
import react.native.Style

inline fun mkStyle(builder: Style.() -> Unit): Style = jsObject(builder)

typealias FlexDirection = String
val row : FlexDirection = "row"
val column : FlexDirection = "column"



fun widthPercentageToDP(widthPercent : Double) : Double {
    val screenWidth = Dimensions.get("window").width as Double
    return PixelRatio.roundToNearestPixel(screenWidth * widthPercent / 100)
}

fun heightPercentageToDP(heightPercent : Double) : Double {
    val screenHeight = Dimensions.get("window").height as Double
    return PixelRatio.roundToNearestPixel(screenHeight * heightPercent / 100)
}

