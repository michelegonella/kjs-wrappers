@file:JsModule("react-native")
package react.native

import react.RClass

external interface ImageProps : StylableProps {
    var blurRadius : Number
    var onLayout : (dynamic) -> Unit//{nativeEvent: {layout: {x, y, width, height}}}.
    var onLoad : (dynamic) -> Unit
    var onLoadEnd : (dynamic) -> Unit
    var onLoadStart : (dynamic) -> Unit
    var resizeMode : String //enum('cover', 'contain', 'stretch', 'repeat', 'center')
    var source : Any
    var loadingIndicatorSource : Array<Any>
    var onError : (dynamic) -> Unit//{nativeEvent: {error}}.
    var testID : String
    var resizeMethod : String//enum('auto', 'resize', 'scale')
    var accessibilityLabel : Any//iOS
    var accessible : Boolean//iOS
    var capInsets : dynamic//object: {top: number, left: number, bottom: number, right: number} iOS
    var defaultSource : Any//object, number iOS
    var onPartialLoad : (dynamic) -> Unit//iOS
    var onProgress : (dynamic) -> Unit//iOS {nativeEvent: {loaded, total}}.
    var fadeDuration : Int //Android only. By default, it is 300ms.
}

external val Image : RClass<ImageProps>
//{
//    override var displayName: String? = definedExternally
//    fun getSize(uri : String, success : () -> Unit, failure : ((dynamic) -> Unit)? = definedExternally) :  Unit
//    fun prefetch(url: String) : Long?//Android Number iOS Unit
//    fun abortPrefetch(requestId : Long)//Android
//    fun queryCache(urls :Array<String>) : dynamic// Returns a mapping from URL to cache status, such as "disk" or "memory". If a requested URL is not in the mapping, it means it's not in the cache.
//    fun resolveAssetSource(
//            source : Any//A number (opaque type returned by require('./foo.png')) or an ImageSource. ImageSource is an object like { uri: '<http location || file path>' }
//    ) : dynamic //Resolves an asset reference into an object which has the properties uri, width, and height.
//}
