package lib
/*
import history.createBrowserHistory
import kotlinext.js.js
import kotlinext.js.requireAll
import org.w3c.dom.events.Event
import org.w3c.dom.get
import react.*
import react.dom.render
import react.redux.Provider
import react.redux.connect
import react.router.redux.ConnectedRouter
import react.router.redux.routerMiddleware
import react.router.redux.routerReducer
import redux.applyMiddleware
import redux.combineReducers
import redux.compose
import redux.createStore
import kotlin.browser.document
import kotlin.browser.window


typealias DOMEventHandler = (Event) -> Unit
typealias ActionCreator = () -> (dynamic) -> Unit
typealias ActionCreator2 = () -> (Dispatch) -> Unit

fun jsType(_type : String) : dynamic {
    return js {
        type = _type
    }
}
class Dispatch {
    operator fun invoke(_type : String) {
        asDynamic()(js {
            type = _type
        })
    }
    /*inline*/ operator fun invoke(_type : String, /*TODO ??crossinline*/ builder : dynamic.() -> Unit) {
        val obj: dynamic = js {
            type = _type
        }
        asDynamic()( obj.apply(builder)
        )
    }
}


fun dispatchable(action : Any) : () -> (dynamic) -> Unit {
    return fun () : (dynamic) -> Unit {
        //val funx : (dynamic) -> Unit =
        return fun(dispatch: dynamic)  {
            dispatch(action)
        }
        //return funx
    }
}

fun reduxAppRootRender(app: RComponent<RProps,RState>) {
    requireAll(kotlinext.js.require.context("src", true, js("/\\.css$/")))

    val _history = createBrowserHistory()

    val initialState = kotlinext.js.js {}
    val reduxDevToolExtension : dynamic? = window["__REDUX_DEVTOOLS_EXTENSION__"]
    val enhancers : Array<Any> = if(reduxDevToolExtension == null) arrayOf() else arrayOf(reduxDevToolExtension())

    val _thunk = redux.thunk.default
    val middleware = arrayOf(
            _thunk,
            routerMiddleware(_history)
    )

    val composedEnhancers = compose(
            applyMiddleware(*middleware),
            *enhancers
    )

    val _routerReducer = routerReducer
    val mm = module.counterReducer
    val rootReducer = combineReducers(kotlinext.js.js {
        routing = _routerReducer
        counter = mm
    })

    val _store = createStore(
            rootReducer,
            initialState,
            composedEnhancers
    )

    render(document.getElementById("root")) {
        Provider() {
            attrs {
                store = _store
            }
            ConnectedRouter {
                attrs {
                    history = _history
                }
                app
            }
        }
    }
}

fun <P : RProps, S : RState,T : RComponent<P,S>, STATE : Any> reduxConnect(cl : JsClass<T>, mapStateToProps : (STATE) -> dynamic, mapDispatchToProps : (Any) -> Any) : RClass<P> {
    val conn : JsClass<Any> = connect(mapStateToProps, mapDispatchToProps)(cl)
    //val rClass = conn as RClass<T>
    return conn as RClass<P>
}


*/