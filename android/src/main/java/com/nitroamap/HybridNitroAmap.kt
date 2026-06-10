package com.nitroamap

import android.graphics.Color
import android.view.View
import androidx.annotation.Keep
import com.facebook.proguard.annotations.DoNotStrip
import com.facebook.react.uimanager.ThemedReactContext
import com.margelo.nitro.nitroamap.HybridNitroAmapSpec
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import android.widget.FrameLayout
import com.amap.api.maps2d.MapView
import com.amap.api.maps2d.AMap;

@Keep
@DoNotStrip
class HybridNitroAmap(val context: ThemedReactContext): HybridNitroAmapSpec() {
    // View
    //override val view: View = View(context)

    //override val view: View = FrameLayout(context)

   override val view:MapView = MapView(context).apply {
                                                           layoutParams = FrameLayout.LayoutParams(
                                                               FrameLayout.LayoutParams.MATCH_PARENT,
                                                               FrameLayout.LayoutParams.MATCH_PARENT
                                                           )
                                                       }

    //AMap aMap = view.getMap();
    //aMap.setMapType(AMap.MAP_TYPE_SATELLITE);

    // Props
    private var _isRed = false
    override var isRed: Boolean
        get() = _isRed
        set(value) {
            _isRed = value
            view.setBackgroundColor(
                if (value) Color.BLUE
                else Color.BLACK
            )
        }



}
