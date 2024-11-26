package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class TNTDrop extends Block {
    public TNTDrop(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        PrimedTnt tnt = EntityType.TNT.create(pLevel);
        tnt.moveTo((double) pPos.getX() + 0.5D, (double) pPos.getY(), (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
        pLevel.addFreshEntity(tnt);
    }
}
