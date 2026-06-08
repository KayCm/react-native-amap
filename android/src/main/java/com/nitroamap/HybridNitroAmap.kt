package com.nitroamap

import android.graphics.Color
import android.view.View
import androidx.annotation.Keep
import com.facebook.proguard.annotations.DoNotStrip
import com.facebook.react.uimanager.ThemedReactContext
import com.margelo.nitro.nitroamap.HybridNitroAmapSpec

@Keep
@DoNotStrip
class HybridNitroAmap(val context: ThemedReactContext): HybridNitroAmapSpec() {
    // View
    override val view: View = View(context)

    // Props
    private var _isRed = false
    override var isRed: Boolean
        get() = _isRed
        set(value) {
            _isRed = value
            view.setBackgroundColor(
                if (value) Color.RED
                else Color.BLACK
            )
        }
}
