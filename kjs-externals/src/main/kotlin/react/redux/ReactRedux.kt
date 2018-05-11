// it assumes that `const ReactSomething = require('react-something')` works in JS
@file:JsModule("react-redux")
package react.redux

import kotlinext.js.JsFunction0
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement
import kotlin.reflect.KClass

//external class Provider(store: String, children: () -> Unit) {
//}

external interface ProviderProps: RProps {
    var store: Any
}
external val Provider: RClass<ProviderProps>

/*
export default connect(
    mapStateToProps,
    mapDispatchToProps
)(Home)
 */


external fun <S1 : Any, S2 : Any, P : RProps> connect(
        mapStateToProps : (S1) -> P, mapDispatchToProps: (S2) -> P) : (Any) -> RClass<P>





