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
    var borderBottomWidth: Int
    var borderColor: String
    var borderEndColor: String
    var borderLeftColor: String
    var borderLeftWidth: Int
    var borderRadius: String
    var backgroundColor: String
    var borderRightWidth: Int
    var borderStartColor: String
    var borderStyle: String
    var borderTopColor: String
    var borderTopEndRadius: String
    var borderTopLeftRadius: String
    var borderTopRightRadius: String
    var borderTopStartRadius: String
    var borderTopWidth: Int
    var borderWidth: Int
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
    var alignContent: String//enum('flex-start', 'flex-end', 'center', 'stretch', 'space-between', 'space-around')
    var alignItems: String//enum('flex-start', 'flex-end', 'center', 'stretch', 'baseline')
    var alignSelf: String//enum('auto', 'flex-start', 'flex-end', 'center', 'stretch', 'baseline')
    var aspectRatio: Number
    var borderBottomWidth: Int
    var borderEndWidth: Int
    var borderLeftWidth: Int
    var borderRightWidth: Int
    var borderStartWidth: Int
    var borderTopWidth: Int
    var borderWidth: Int
    var bottom: Any//number,string points or percentages
    var direction: String//enum('inherit', 'ltr', 'rtl')
    var display: String//enum('none', 'flex')
    var end: Any//number, ,string
    var flex : Int
    var flexBasis: Any//number, ,string
    var flexDirection : String//enum('row', 'row-reverse', 'column', 'column-reverse')
    var flexGrow: Int
    var flexShrink: Int
    var flexWrap: String//enum('wrap', 'nowrap')
    var height: Any//points or percentages
    var justifyContent: String//enum('flex-start', 'flex-end', 'center', 'space-between', 'space-around', 'space-evenly')
    var left: Any//points or percentages
    var margin: Any//points or percentages
    var marginBottom: Any//points or percentages
    var marginEnd: Any//points or percentages
    var marginHorizontal: Any//points or percentages
    var marginLeft: Any//points or percentages
    var marginRight: Any//points or percentages
    var marginStart: Any//points or percentages
    var marginTop: Any//points or percentages
    var marginVertical: Any//points or percentages
    var maxHeight: Any//points or percentages
    var maxWidth: Any//points or percentages
    var minHeight: Any//points or percentages
    var minWidth: Any//points or percentages
    var overflow: String//enum('visible', 'hidden', 'scroll')
    var padding: Any//points or percentages
    var paddingBottom: Any//points or percentages
    var paddingEnd: Any//points or percentages
    var paddingHorizontal: Any//points or percentages
    var paddingLeft: Any//points or percentages
    var paddingRight: Any//points or percentages
    var paddingStart: Any//points or percentages
    var paddingTop: Any//points or percentages
    var paddingVertical: Any//points or percentages
    var position: String//enum('absolute', 'relative')
    var right: Any//points or percentages
    var start: Any//points or percentages
    var top: Any//points or percentages
    var width: Any//points or percentages
    var zIndex: Int
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


external interface Style : ViewStyle, TextStyle, LayoutStyle, ShadowStyle


