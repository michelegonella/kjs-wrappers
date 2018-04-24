@file:JsModule("react-router-redux")
package react.router.redux

import react.RClass
import react.RProps

external fun routerMiddleware(arg : Any) : Any

//external fun routerReducer(vararg args : Any) : Any

external val routerReducer : ( args : Any) -> Any

external interface ConnectedRouterProps: RProps {
    var history: Any
}

external val ConnectedRouter: RClass<ConnectedRouterProps>


external fun push(route : String)

