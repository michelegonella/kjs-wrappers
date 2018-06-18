@file:JsModule("react-native")

package react.native

import react.*

external interface PointPropType {
    var x: Number
    var y: Number
}

external interface TopBottomLeftRight {
    var top : Number
    var bottom : Number
    var left : Number
    var right : Number
}

external interface WithAndHeight {
    var width : Number
    var height : Number
}


external interface StylableProps : RProps {
    var style : Any //Style || Array<Style>
}

external interface TransformStyle {
    var transforms : Array<dynamic>
}

external interface ImageStyle {
    var borderTopRightRadius: Number
    var backfaceVisibility: String//enum('visible', 'hidden')
    var borderBottomLeftRadius: Number
    var borderBottomRightRadius: Number
    var borderColor: String
    var borderRadius: Number
    var borderTopLeftRadius: Number
    var backgroundColor: String
    var borderWidth: Int
    var opacity: Number
    var overflow: String//enum('visible', 'hidden')
    var resizeMode: String// contain, cover, stretch, center, repeat
    var tintColor: String
    var overlayColor: String //(Android)
}

external interface ViewStyle {
    var borderRightColor: String
    var backfaceVisibility: String
    var borderBottomColor: String
    var borderBottomEndRadius: Number
    var borderBottomLeftRadius: Number
    var borderBottomRightRadius: Number
    var borderBottomStartRadius: Number
    var borderBottomWidth: Int
    var borderColor: String
    var borderEndColor: String
    var borderLeftColor: String
    var borderLeftWidth: Int
    var borderRadius: Number
    var backgroundColor: String
    var borderRightWidth: Int
    var borderStartColor: String
    var borderStyle: String
    var borderTopColor: String
    var borderTopEndRadius: Number
    var borderTopLeftRadius: Number
    var borderTopRightRadius: Number
    var borderTopStartRadius: Number
    var borderTopWidth: Int
    var borderWidth: Int
    var opacity: Number
    var elevation: String
}

external interface ShadowStyle {//iOS
    var shadowColor: String
    var shadowOffset: dynamic//object: {width: number,height: number}
    var shadowOpacity: Number
    var shadowRadius: Number
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


external interface Style : ViewStyle, TextStyle, LayoutStyle, ShadowStyle, ImageStyle, TransformStyle


