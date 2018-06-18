@file:JsModule("react-native")
package react.native

import react.Component
import react.RState
import react.ReactElement

external interface TextProps : StylableProps {

}

@JsName("Text")
open external class TextComponent : Component<TextProps, RState> {
    override fun render(): ReactElement?
}



