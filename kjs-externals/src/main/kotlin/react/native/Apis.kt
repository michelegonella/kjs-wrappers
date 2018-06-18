@file:JsModule("react-native")
package react.native

import react.RComponent


external object Dimensions {
    fun get(dim/*window|screen*/ : String): WithAndHeight
    fun addEventListener(type: String/*change*/, handler : (dynamic/*object with window and screen of type WithAndHeight*/) -> Unit)
    fun removeEventListener(type: String, handler : (dynamic) -> Unit)
}

external object PixelRatio {
    fun get() : Double//1 -> 160 dpi .....
    fun getFontScale() : Number//
    fun getPixelSizeForLayoutSize(layoutSize : Number) : Int
    fun roundToNearestPixel(layoutSize : Number) : Double
}

external object StyleSheet {
    fun create(style: dynamic): dynamic
    fun flatten(styles : Array<dynamic>) : dynamic
    val hairlineWidth : Int
    val absoluteFillObject : Style
    val absoluteFill : Style
}


external fun findNodeHandle(ref: Any) : Any

external object AppRegistry {
    fun <T : RComponent<*, *>> registerComponent(name: String, createComponent: () -> JsClass<T>)
}

external interface PlatformSelectConfig<T> {
    var ios: T
    var android: T
}


external object Platform {
    /**
     * Has the value 'ios' or 'android'
     */

    val OS: String
    /**
     * On iOS, the [VERSION] is a result of -[UIDevice systemVersion], which is a [String] with the
     * current version of the operating system. An example of the system version is "10.3".
     *
     * On Android, the [VERSION] is an [Int] representing the api level. An example is that
     */

    @JsName("Version")
    val VERSION: dynamic

    fun <T> select(select: PlatformSelectConfig<T>): T
}
