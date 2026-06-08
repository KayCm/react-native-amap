package com.nitroamap;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.uimanager.ViewManager;
import com.margelo.nitro.nitroamap.*;
import com.margelo.nitro.nitroamap.views.*;


public class NitroAmapPackage : BaseReactPackage() {
  override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? = null

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider = ReactModuleInfoProvider { emptyMap() }
  
  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
    val viewManagers = ArrayList<ViewManager<*, *>>()
    viewManagers.add(HybridNitroAmapManager())
    return viewManagers
  }

  companion object {
    init {
      NitroAmapOnLoad.initializeNative()
    }
  }
}

