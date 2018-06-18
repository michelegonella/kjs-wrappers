package com.nominanuda.krui.react.native

import kotlinext.js.jsObject
import react.*
import react.native.*

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

fun RBuilder.View(handler: RHandler<ViewProps>) : ReactElement = child(ViewComponent::class, handler)

fun RBuilder.Text(handler: RHandler<TextProps>) : ReactElement = child(TextComponent::class, handler)

fun RBuilder.Button(handler: RHandler<ButtonProps>) : ReactElement = child(ButtonComponent::class, handler)

fun RBuilder.FlatList(handler: RHandler<FlatListProps>) : ReactElement = child(FlatListComponent::class, handler)

fun RBuilder.ScrollView(handler: RHandler<ScrollViewProps>) : ReactElement = child(ScrollViewComponent::class, handler)

fun RBuilder.SectionList(handler: RHandler<SectionListProps>) : ReactElement = child(SectionListComponent::class, handler)
