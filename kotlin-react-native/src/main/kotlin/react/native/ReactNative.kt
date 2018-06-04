//@file:JsModule("react-native-web")//dist/exports
//@file:JsModule("react-native")

package react.native

import kotlinext.js.jsObject

inline fun mkStyle(builder: Style.() -> Unit): Style = jsObject(builder)

typealias FlexDirection = String
val row : FlexDirection = "row"
val column : FlexDirection = "column"





