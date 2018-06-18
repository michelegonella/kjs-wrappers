@file:JsModule("react-native")
package react.native

import react.Component
import react.RState
import react.ReactElement

external interface Section {
    var title: String
    var renderItem: (info: dynamic) -> ReactElement
    var data: Any
}

external interface SectionListProps : VirtualizedListProps {
    var sections: Array<Section>//required
    var ItemSeparatorComponent: Any
    var legacyImplementation: Boolean
    var renderSectionFooter: (dynamic) -> ReactElement?//{info: {section: SectionT}}
    var renderSectionHeader: (dynamic) -> ReactElement?//{info: {section: SectionT}}
    var SectionSeparatorComponent: Any
    var stickySectionHeadersEnabled: Boolean
}

@JsName("SectionList")
open external class SectionListComponent : Component<SectionListProps, RState> {
    override fun render(): ReactElement?
    fun recordInteraction(): Unit
    fun flashScrollIndicators(): Unit
    fun scrollToLocation(options: dynamic): Unit
}
