package io.github.relapercrystal.fchelper.mod;

import io.github.relapercrystal.fchelper.mod.blocks.ModBlocks;
import io.github.relapercrystal.fchelper.mod.items.ModItems;

public final class RegistryUtil {
    private RegistryUtil() { super(); }

    // Registers blocks
    public static void registerBlocks() {
        ModBlocks.registerBlocks();
    }

    // Registers items and block items
    public static void registerItems() {
        ModItems.registerItems();
        ModBlocks.registerBlockItems();
    }
}
