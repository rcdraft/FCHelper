package io.github.relapercrystal.fchelper.mod;

import io.github.relapercrystal.fchelper.mod.items.ModItems;

public final class RegistryUtil {
    private RegistryUtil() { super(); }

    public static void registerBlocks() {
        // TODO add a first block
    }

    // redirect to moditems
    public static void registerItems() {
        ModItems.registerItems();
    }
}
