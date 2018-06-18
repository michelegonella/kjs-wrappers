@file:JsModule("react-native")
package react.native

import react.Component
import react.RState
import react.ReactElement

external interface ScrollViewProps : ViewProps {
    var alwaysBounceVertical: Boolean//iOS
    var contentContainerStyle: ViewStyle
    var keyboardDismissMode: String//enum('none', 'on-drag', 'interactive')
    var keyboardShouldPersistTaps: String//enum('always', 'never', 'handled', false, true)
    var onContentSizeChange: (/*contentWidth*/Number, /*contentHeight*/Number) -> Unit
    var onMomentumScrollBegin: () -> Unit
    var onMomentumScrollEnd: () -> Unit
    var onScroll: () -> Unit
    var onScrollBeginDrag: () -> Unit
    var onScrollEndDrag: () -> Unit
    var pagingEnabled: Boolean
    var refreshControl: Any
    var scrollEnabled: Boolean
    var showsHorizontalScrollIndicator: Boolean
    var showsVerticalScrollIndicator: Boolean
    var stickyHeaderIndices: Array<Int>
    var endFillColor: String//android
    var overScrollMode: String//enum('auto', 'always', 'never') android
    var scrollPerfTag: String //android
    var alwaysBounceHorizontal: Boolean//iOS
    var horizontal: Boolean
    var automaticallyAdjustContentInsets: Boolean//iOS
    var bounces: Boolean//iOs
    var bouncesZoom: Boolean//iOS
    var canCancelContentTouches: Boolean//iOS
    var centerContent: Boolean//iOS
    var contentInset: TopBottomLeftRight//iOS
    var contentInsetAdjustmentBehavior: String//enum('automatic', 'scrollableAxes', 'never', 'always') iOS
    var contentOffset: PointPropType//iOS
    var decelerationRate: Any//iOS enum('fast', 'normal'), ,number
    var directionalLockEnabled: Boolean//iOS
    var indicatorStyle: String//iOS enum('default', 'black', 'white')
    var maximumZoomScale: Number//iOS
    var minimumZoomScale: Number//iOS
    var pinchGestureEnabled: Boolean//iOS
    var scrollEventThrottle: Number//iOS
    var scrollIndicatorInsets: TopBottomLeftRight//iOS
    var scrollsToTop: Boolean//iOS
    var snapToAlignment: String//enum('start', 'center', 'end')
    var snapToInterval: Number
    var zoomScale: Number//iOS
}

@JsName("ScrollView")
open external class ScrollViewComponent : Component<ScrollViewProps, RState> {
    override fun render(): ReactElement?
    fun scrollToEnd(options: dynamic): Unit
    fun scrollTo(cooAndAnimated: dynamic): Unit
    fun flashScrollIndicators(): Unit
}
