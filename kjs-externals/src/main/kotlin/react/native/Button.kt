@file:JsModule("react-native")
package react.native

import react.Component
import react.RState
import react.ReactElement

external interface ButtonProps : StylableProps {

}

@JsName("Button")
open external class ButtonComponent : Component<ButtonProps, RState> {
    override fun render(): ReactElement?
}

