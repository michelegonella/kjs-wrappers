package com.nominanuda.krui.redux

import kotlinext.js.JsFunction1
import kotlinext.js.js
import react.RProps

typealias Reducer<T> = (/*state :*/ T?, /*action :*/ dynamic) -> T
typealias ToPropsMapper<T> = (T) -> RProps
typealias Dispatch = JsFunction1<Any, Unit>
typealias DispatchToPropsMapper<T> = (Dispatch) -> RProps

inline fun <Z> noOpReducer( ) : Reducer<Z> {
    return {state : Z?, action: dynamic -> state ?: js {}}
}

//class WrappedReducer<T> : Reducer<T> {
//    private var r : Reducer<T> = noOpReducer()
//
//    fun setReducer(reducer : Reducer<T>) {
//        r = reducer
//    }
//
//    fun emptyReducer() {
//        r = noOpReducer()
//    }
//    operator fun invoke(state : T?, action : dynamic) : T {
//        return r(state, action)
//    }
//}