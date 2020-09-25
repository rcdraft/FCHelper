package io.github.relapercrystal.fchelper.mod.blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private ModBlocks() { super(); }

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier("fchelper", "construction_block"), NoClassBlocks.CONSTRUCTION_BLOCK);
    }

    public static void registerBlockItems()
    {
        Registry.register(Registry.ITEM, new Identifier("fchelper", "construction_block"), new BlockItem(NoClassBlocks.CONSTRUCTION_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
