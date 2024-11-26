package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class SpikeDrop extends Block {
    public SpikeDrop(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        pLevel.setBlockAndUpdate(pPos.east(4).above(61), Blocks.DRIPSTONE_BLOCK.defaultBlockState());
        pLevel.setBlockAndUpdate(pPos.east(4).above(60), Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN));
        pLevel.setBlockAndUpdate(pPos.east(4).above(59), Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN));
        pLevel.setBlockAndUpdate(pPos.east(4).above(58), Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN));
        pLevel.setBlockAndUpdate(pPos.east(4).above(57), Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN));
        pLevel.setBlockAndUpdate(pPos.east(4).above(56), Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN));
        pLevel.setBlockAndUpdate(pPos.east(4).above(55), Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN));
        pLevel.removeBlock(pPos.east(4).above(61), false);
    }
}
