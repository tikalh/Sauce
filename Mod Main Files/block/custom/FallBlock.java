package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;

public class FallBlock extends Block {
    public FallBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level world, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        world.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        Player playervar = player;
        playervar.teleportTo(pos.getX(), 256,pos.getZ());
        return true;
    }
}
