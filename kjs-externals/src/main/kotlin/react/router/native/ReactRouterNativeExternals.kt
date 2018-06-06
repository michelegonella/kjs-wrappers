@file:JsModule("react-router-native")
package react.router.native

import react.RClass
import react.RProps
import react.ReactElement

external interface NativeRouterProps : RProps {

}

external val NativeRouter : RClass<NativeRouterProps>

external interface RouteProps : RProps {
    var exact : Boolean
    var path : String
    var component : Any//() -> ReactElement //JsClass<dynamic> aka ctor
}
external val Route : RClass<RouteProps>

external interface LinkProps : RProps {
    var to :String
    var onPress  : Any?
    var component : Any?//A component for making Link respond properly to touches. Typically will be one React Native’s “touchable” components (TouchableHighlight, TouchableOpacity, etc). All props passed to Link will be passed along to this component. Defaults to TouchableHighlight.
}
external val Link : RClass<LinkProps>


