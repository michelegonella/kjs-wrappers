@file:JsModule("react-native")

package react.native

import react.*

external interface ViewSyntheticTouchEvent {
    var changedTouches : Array<ViewSyntheticTouchEvent>// - Array of all touch events that have changed since the last event.
    var identifier : String// - The ID of the touch.
    var locationX : Number// - The X position of the touch, relative to the element.
    var locationY : Number// - The Y position of the touch, relative to the element.
    var pageX : Number// - The X position of the touch, relative to the root element.
    var pageY : Number// - The Y position of the touch, relative to the root element.
    var target : String// - The node id of the element receiving the touch event.
    var timestamp : Any//??? - A time identifier for the touch, useful for velocity calculation.
    var touches : Array<Any>//- Array of all current touches on the screen.
}

external interface ViewProps : StylableProps {
    var onStartShouldSetResponder : (ViewSyntheticTouchEvent) -> Boolean
    var accessibilityLabel : ReactElement
    var hitSlop : TopBottomLeftRight
    var nativeID : String
    var onAccessibilityTap : (ViewSyntheticTouchEvent) -> Unit
    var onLayout : (dynamic/*{nativeEvent: { layout: {x, y, width, height}}}*/) -> Unit
    var onMagicTap : (ViewSyntheticTouchEvent) -> Unit
    var onMoveShouldSetResponder : (ViewSyntheticTouchEvent) -> Boolean
    var onMoveShouldSetResponderCapture : (ViewSyntheticTouchEvent) -> Boolean
    var onResponderGrant : (ViewSyntheticTouchEvent) -> dynamic
    var onResponderMove : (ViewSyntheticTouchEvent) -> dynamic
    var onResponderReject : (ViewSyntheticTouchEvent) -> dynamic
    var onResponderRelease : (ViewSyntheticTouchEvent) -> dynamic
    var onResponderTerminate : (ViewSyntheticTouchEvent) -> dynamic
    var onResponderTerminationRequest : (ViewSyntheticTouchEvent) -> dynamic
    var accessible : Boolean
    var onStartShouldSetResponderCapture : (ViewSyntheticTouchEvent) -> Boolean
    var pointerEvents : String//enum('box-none', 'none', 'box-only', 'auto')
    var removeClippedSubviews : Boolean
    var testID : String
    var accessibilityComponentType : String//Android 'none' 'button' 'radiobutton_checked' 'radiobutton_unchecked'
    var accessibilityLiveRegion : String//android enum('none', 'polite', 'assertive')
    var collapsable : Boolean//Android
    var importantForAccessibility : String//Android enum('auto', 'yes', 'no', 'no-hide-descendants')
    var needsOffscreenAlphaCompositing : Boolean//Android
    var renderToHardwareTextureAndroid : Boolean
    var accessibilityTraits : Array<String>//iOS 'none' 'button' 'link' 'header' 'search' 'image' 'selected' 'plays' 'key' 'text' 'summary' 'disabled' 'frequentUpdates' 'startsMedia' 'adjustable' 'allowsDirectInteraction' 'pageTurn'
    var accessibilityViewIsModal : Boolean//iOS
    var accessibilityElementsHidden : Boolean//iOS
    var shouldRasterizeIOS : Boolean//iOS

}

@JsName("View")
external class ViewComponent : Component<ViewProps, RState> {
    override fun render(): ReactElement?
}










