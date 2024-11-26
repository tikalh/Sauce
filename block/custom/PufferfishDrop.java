package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class PufferfishDrop extends Block {
    public PufferfishDrop(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        pLevel.setBlockAndUpdate(pPos.below(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.below().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.below().west().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.below().east(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.below().east().east(), Blocks.WATER.defaultBlockState());

        pLevel.setBlockAndUpdate(pPos.south().below(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().below().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().below().west().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().below().east(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().below().east().east(), Blocks.WATER.defaultBlockState());

        pLevel.setBlockAndUpdate(pPos.north().below(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().below().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().below().west().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().below().east(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().below().east().east(), Blocks.WATER.defaultBlockState());

        pLevel.setBlockAndUpdate(pPos.north().north().below(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().north().below().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().north().below().west().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().north().below().east(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.north().north().below().east().east(), Blocks.WATER.defaultBlockState());

        pLevel.setBlockAndUpdate(pPos.south().south().below(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().south().below().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().south().below().west().west(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().south().below().east(), Blocks.WATER.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.south().south().below().east().east(), Blocks.WATER.defaultBlockState());

        Pufferfish pufferfish = EntityType.PUFFERFISH.create(pLevel);
        pufferfish.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 9600, 1000000));
        pufferfish.moveTo((double) pPos.getX() + 0.5D, (double) pPos.getY(), (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
        pLevel.addFreshEntity(pufferfish);
        pufferfish.spawnAnim();
    }
}
