package io.github.relapercrystal.fchelper.mod.blocks;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockProtectorGlass extends AbstractGlassBlock {
    protected BlockProtectorGlass(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        boolean success = false;

        if(player.isCreative() && player.hasPermissionLevel(2)) {
            success = true;
        }
        
        if(!world.isClient) {
            if(success) {
                // TODO Break the block
                player.sendMessage(new TranslatableText("block.fchelper.protector_glass.use"), false);
            }
            else {
                player.sendMessage(new TranslatableText("block.fchelper.protector_glass.use"), false);
            }
            
        }
        return ActionResult.SUCCESS;
    }
}