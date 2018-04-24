// it assumes that `const ReactSomething = require('react-something')` works in JS
@file:JsModule("react-redux")
package react.redux

import react.RBuilder
import react.RClass
import react.RProps
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
external fun connect(mapStateToProps : Any, mapDispatchToProps: Any) : (Any) -> JsClass<Any>





