@file:JsModule("redux")
package redux

external fun createStore(rootReducer : Any,
                         initialState : Any,
                         composedEnhancers : Any) : Any
external fun applyMiddleware(vararg middlewares : Any/*Middleware*/ ) : Any /*GenericStoreEnhancer*/
external fun compose(vararg xxx : Any) : Any

external fun combineReducers(xxx : Any) : Any

external fun bindActionCreators(actionCreators : Any, dispatch : Any/*fun*/) : Any
