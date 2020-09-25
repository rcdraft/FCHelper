package io.github.relapercrystal.fchelper;

import io.github.relapercrystal.fchelper.mod.RegistryUtil;
import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer {

    @Override
    public void onInitialize() {
        RegistryUtil.registerBlocks();
        RegistryUtil.registerItems();
    }
    
}
