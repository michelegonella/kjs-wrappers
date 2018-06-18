@file:JsModule("react-native")
package react.native

import react.RClass

external interface DrawerLayoutAndroidProps : StylableProps {
    var drawerWidth : Int
    //var drawerPosition={DrawerLayoutAndroid.positions.Left}
    var renderNavigationView : Any//={() => navigationView}
}

external val DrawerLayoutAndroid : RClass<DrawerLayoutAndroidProps>
