package io.github.relapercrystal.fchelper.mod;

import io.github.relapercrystal.fchelper.mod.blocks.ModBlocks;
import io.github.relapercrystal.fchelper.mod.items.ModItems;

public final class RegistryUtil {
    private RegistryUtil() { super(); }

    public static final String NAMESPACE = "fchelper";
    // Registers blocks
    public static void registerBlocks() {
        ModBlocks.registerBlocks();
        ModBlocks.registerTranslucent();
    }

    // Registers items and block items
    public static void registerItems() {
        ModItems.registerItems();
        ModBlocks.registerBlockItems();
    }
}
