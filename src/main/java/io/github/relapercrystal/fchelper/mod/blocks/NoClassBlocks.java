package io.github.relapercrystal.fchelper.mod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

/**
 * Contains all blocks entires.
 */
public class NoClassBlocks {
    private NoClassBlocks() {}

    public static final BlockProtectorGlass PROTECTOR_GLASS = new BlockProtectorGlass(AbstractBlock.Settings.of(Material.GLASS).strength(-1F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(ModBlocks::never).solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never));
    public static final Block CONSTRUCTION_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(-1.0F).dropsNothing().allowsSpawning(ModBlocks::never));
}