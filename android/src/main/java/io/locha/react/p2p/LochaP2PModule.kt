package io.locha.react.p2p

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class LochaP2PModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    companion object
    {
        init
        {
            System.loadLibrary("react_native_locha_p2p")
        }
    }
    override fun getName(): String {
        return "LochaP2P"
    }

    @ReactMethod
    fun hello(input: String): String {
        return nativeHello(input)
    }

    external fun nativeHello(input: String): String;
}