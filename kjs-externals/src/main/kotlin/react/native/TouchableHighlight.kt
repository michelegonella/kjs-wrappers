@file:JsModule("react-native")
package react.native

import react.RClass
import react.RProps

external interface TouchableHighlightProps : RProps {
    var onPress : () -> Any?
}

external val TouchableHighlight : RClass<TouchableHighlightProps>
