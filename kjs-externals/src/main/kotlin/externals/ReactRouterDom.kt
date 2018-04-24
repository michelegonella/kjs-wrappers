@file:JsModule("react-router-dom")
package react.router.dom

import react.RClass
import react.RProps

//import { Route, Link } from 'react-router-dom'

external interface RouteProps: RProps {
    var exact : Any//TODO boolean
    var path : String
    var component : Any//?? Component ?
}

//<Route exact path="/" container.component={Home} />
external val Route: RClass<RouteProps>

external interface LinkProps: RProps {
    var to : String
}

//<Link class="nav-link" to="/">Home</Link>
external val Link: RClass<LinkProps>
