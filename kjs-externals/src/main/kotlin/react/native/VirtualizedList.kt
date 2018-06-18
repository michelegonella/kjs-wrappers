@file:JsModule("react-native")
package react.native

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external interface VirtualizedListProps : ScrollViewProps {
    var renderItem: (info: dynamic) -> ReactElement
    var data: Any
    var getItem: (data: Any, index: Int) -> Any
    var getItemCount: (data: Any) -> Int
    var debug: Boolean
    var extraData: Any
    var getItemLayout: (data: Any, index: Int) -> Any//{length: number, offset: number, index: number}
    var initialScrollIndex: Int
    var inverted: Boolean
    var CellRendererComponent: Any// React Component Class,or a render function. Defaults to using View.
    var ListEmptyComponent: Any
    var ListFooterComponent: Any
    var ListHeaderComponent: Any
    var onEndReached: Any
    var onRefresh: () -> Unit
    var onScrollToIndexFailed: (dynamic) -> Unit//{info:{index: number,highestMeasuredFrameIndex: number,averageItemLength: number,}})
    var onViewableItemsChanged: (dynamic) -> Unit//{info:{viewableItems: array,changed: array}}
    var refreshing: Boolean
    var renderScrollComponent: (props: RProps) -> ReactElement//(props: object) => element;
    var viewabilityConfig: Any//
    var viewabilityConfigCallbackPairs: Array<dynamic>
    var initialNumToRender: Int
    var keyExtractor: (/*item*/Any, /*index*/ Int) -> String;
    var maxToRenderPerBatch: Int
    var onEndReachedThreshold: Number
    var updateCellsBatchingPeriod: Long
    var windowSize: Int
    var progressViewOffset: Number//android
}

@JsName("VirtualizedList")
open external class VirtualizedListComponent : Component<VirtualizedListProps, RState> {
    override fun render(): ReactElement?
    fun scrollToEnd(options: dynamic): Unit
    fun flashScrollIndicators(): Unit
    fun scrollToIndex(options: dynamic): Unit
    fun scrollToItem(options: dynamic): Unit
    fun scrollToOffset(options: dynamic): Unit
    fun recordInteraction(): Unit
}
