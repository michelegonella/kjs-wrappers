package com.nominanuda.krui.react.native

import kotlinext.js.jsObject
import react.native.Style

inline fun mkStyle(builder: Style.() -> Unit): Style = jsObject(builder)

typealias FlexDirection = String
val row : FlexDirection = "row"
val column : FlexDirection = "column"





