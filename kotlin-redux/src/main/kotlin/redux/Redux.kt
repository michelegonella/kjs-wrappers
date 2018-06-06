package com.nominanuda.krui.redux

import kotlinext.js.JsFunction1
import react.RProps

typealias Reducer<T> = (/*state :*/ T?, /*action :*/ dynamic) -> T
typealias ToPropsMapper<T> = (T) -> RProps
typealias Dispatch = JsFunction1<Any, Unit>
typealias DispatchToPropsMapper<T> = (Dispatch) -> RProps
