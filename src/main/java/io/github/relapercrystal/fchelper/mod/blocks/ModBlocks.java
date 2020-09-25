package io.github.relapercrystal.fchelper.mod.blocks;

import io.github.relapercrystal.fchelper.ModMain;
import io.github.relapercrystal.fchelper.mod.RegistryUtil;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class ModBlocks {
    private ModBlocks() { super(); }

    /**
    * A shortcut to always return {@code false} in a typed context predicate with an
    * {@link EntityType}, used like {@code settings.allowSpawning(Blocks::never)}.
    */
    public static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    public static Boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    public static Boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    /**
     * Registers all blocks to the game registry.
     */
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(RegistryUtil.NAMESPACE, "construction_block"), NoClassBlocks.CONSTRUCTION_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(RegistryUtil.NAMESPACE, "protector_glass"), NoClassBlocks.PROTECTOR_GLASS);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(RegistryUtil.NAMESPACE, "construction_block"), new BlockItem(NoClassBlocks.CONSTRUCTION_BLOCK, new Item.Settings().group(ModMain.FCHELPER_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(RegistryUtil.NAMESPACE, "protector_glass"), new BlockItem(NoClassBlocks.PROTECTOR_GLASS, new Item.Settings().group(ModMain.FCHELPER_GROUP)));
    }

    public static void registerTranslucent() {
        BlockRenderLayerMap.INSTANCE.putBlock(NoClassBlocks.PROTECTOR_GLASS, RenderLayer.getTranslucent());
    }
}
