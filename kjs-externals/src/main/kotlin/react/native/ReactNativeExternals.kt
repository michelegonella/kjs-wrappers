//@file:JsModule("react-native-web")//dist/exports
@file:JsModule("react-native")

package react.native

import react.RClass
import react.RComponent
import react.RProps

//external object ReactNative {
    external    fun findNodeHandle(ref: Any) : Any
//}

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


external interface ViewProps : StylableProps

external val View : RClass<ViewProps>
/*
open external class View : Component<ViewProps, RState> {
    override fun render(): dynamic = definedExternally
}
*/

external interface TextProps : StylableProps {

}

external val Text : RClass<TextProps>

/*
open external class Text : Component<TextProps, RState> {
    override fun render(): dynamic = definedExternally
}
*/

//external object Text
external object Button

external interface DrawerLayoutAndroidProps : StylableProps {
    var drawerWidth : Int
    //var drawerPosition={DrawerLayoutAndroid.positions.Left}
    var renderNavigationView : Any//={() => navigationView}
}

external val DrawerLayoutAndroid : RClass<DrawerLayoutAndroidProps>

external interface ImageProps : StylableProps {
    var source : Any
}

external val Image : RClass<ImageProps>


external interface TouchableHighlightProps : RProps {
    var onPress : () -> Any?
}

external val TouchableHighlight : RClass<TouchableHighlightProps>


//// STYLE

external interface StylableProps : RProps {
    var style : Style?
}

external object StyleSheet {
    fun create(style: dynamic): dynamic
}

external interface ViewStyle {
    var borderRightColor: String
    var backfaceVisibility: String
    var borderBottomColor: String
    var borderBottomEndRadius: String
    var borderBottomLeftRadius: String
    var borderBottomRightRadius: String
    var borderBottomStartRadius: String
    var borderBottomWidth: String
    var borderColor: String
    var borderEndColor: String
    var borderLeftColor: String
    var borderLeftWidth: String
    var borderRadius: String
    var backgroundColor: String
    var borderRightWidth: String
    var borderStartColor: String
    var borderStyle: String
    var borderTopColor: String
    var borderTopEndRadius: String
    var borderTopLeftRadius: String
    var borderTopRightRadius: String
    var borderTopStartRadius: String
    var borderTopWidth: String
    var borderWidth: String
    var opacity: String
    var elevation: String
}

external interface ShadowStyle {
    var shadowColor: String
    var shadowOffset: String
    var shadowOpacity: String
    var shadowRadius: String
}


external interface LayoutStyle {
    var alignContent: String
    var alignItems: String
    var alignSelf: String
    var aspectRatio: String
    var borderBottomWidth: String
    var borderEndWidth: String
    var borderLeftWidth: String
    var borderRightWidth: String
    var borderStartWidth: String
    var borderTopWidth: String
    var borderWidth: String
    var bottom: String
    var direction: String
    var display: String
    var end: String
    var flex : Int
    var flexBasis: String
    var flexDirection : String
    var flexGrow: String
    var flexShrink: String
    var flexWrap: String
    var height: String
    var justifyContent: String
    var left: String
    var margin: String
    var marginBottom: String
    var marginEnd: String
    var marginHorizontal: String
    var marginLeft: String
    var marginRight: String
    var marginStart: String
    var marginTop: String
    var marginVertical: String
    var maxHeight: String
    var maxWidth: String
    var minHeight: String
    var minWidth: String
    var overflow: String
    var padding: String
    var paddingBottom: String
    var paddingEnd: String
    var paddingHorizontal: String
    var paddingLeft: Int
    var paddingRight: String
    var paddingStart: String
    var paddingTop: String
    var paddingVertical: String
    var position: String
    var right: String
    var start: String
    var top: String
    var width: String
    var zIndex: String
}

external interface TextStyle {
    var textShadowOffset: String
    var color: String
    var fontSize: Int
    var fontStyle: String
    var fontWeight: String
    var lineHeight: String
    var textAlign: String
    var textDecorationLine: String
    var textShadowColor: String
    var fontFamily: String
    var textShadowRadius: String
    var includeFontPadding: String
    var textAlignVertical: String
    var fontVariant: String
    var letterSpacing: String
    var textDecorationColor: String
    var textDecorationStyle: String
    var writingDirection: String
}


external interface Style : TextStyle, LayoutStyle, ShadowStyle {
    var backgroundColor : String
}


