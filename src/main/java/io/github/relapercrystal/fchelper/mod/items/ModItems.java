package io.github.relapercrystal.fchelper.mod.items;

import io.github.relapercrystal.fchelper.ModMain;
import io.github.relapercrystal.fchelper.mod.RegistryUtil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModItems {
    private ModItems() {

    }

    public static final ItemMarker MARKER = new ItemMarker(new FabricItemSettings().group(ModMain.FCHELPER_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RegistryUtil.NAMESPACE, "marker"), MARKER);
    }
}