package io.github.relapercrystal.fchelper.mod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class NoClassBlocks {
    private NoClassBlocks() {}

    public static final Block CONSTRUCTION_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(-1.0F).dropsNothing());
}