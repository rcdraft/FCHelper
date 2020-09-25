package io.github.relapercrystal.fchelper;

import io.github.relapercrystal.fchelper.mod.RegistryUtil;
import io.github.relapercrystal.fchelper.mod.blocks.ModBlocks;
import io.github.relapercrystal.fchelper.mod.items.ItemMarker;
import io.github.relapercrystal.fchelper.mod.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModMain implements ModInitializer {
    public static final ItemGroup FCHELPER_GROUP = FabricItemGroupBuilder.build(
		new Identifier(RegistryUtil.NAMESPACE, "fchelper_group"),
		() -> new ItemStack(ModItems.MARKER));

    @Override
    public void onInitialize() {
        RegistryUtil.registerBlocks();
        RegistryUtil.registerItems();
    }
    
}
