@file:JsModule("react-native")
package react.native

import react.Component
import react.RState
import react.ReactElement

external interface FlatListProps : VirtualizedListProps {
}

@JsName("FlatList")
open external class FlatListComponent : Component<FlatListProps, RState> {
    override fun render(): ReactElement?
}
