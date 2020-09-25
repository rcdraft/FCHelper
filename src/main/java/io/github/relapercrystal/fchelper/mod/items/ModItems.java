package io.github.relapercrystal.fchelper.mod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModItems {
    private ModItems() {

    }

    private static final ItemMarker MARKER = new ItemMarker(new FabricItemSettings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("fchelper", "marker"), MARKER);
    }
}