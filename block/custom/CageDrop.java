package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class CageDrop extends Block {
    public CageDrop(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState, @Nullable BlockEntity pBlockEntity, ItemStack pTool) {

        pLevel.setBlockAndUpdate(pPlayer.getOnPos(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().above().above(), Blocks.LAVA.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().south(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().south().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().south().above().above(), Blocks.LAVA.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().above().above(), Blocks.LAVA.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().above().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().south(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().south(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().above().south(), Blocks.LAVA.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().above(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().above().north(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().south(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().south(), Blocks.LAVA.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().above().south(), Blocks.LAVA.defaultBlockState());


        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().above().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().above().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().above().above().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().above().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().above().above().south(), Blocks.IRON_BARS.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().above().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().above().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().above().above().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().above().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().above().above().south(), Blocks.IRON_BARS.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().south().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().south().south().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().south().south().above().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().south().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().south().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().above().south().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().south().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().south().south(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().above().south().south(), Blocks.IRON_BARS.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().above().above(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().north().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().north().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().above().above().north().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().north().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().north().north(), Blocks.IRON_BARS.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().above().above().north().north(), Blocks.IRON_BARS.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().east().east(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().east().east().above(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().east().east().above().above(), Blocks.SEA_LANTERN.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().west().west(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().west().west().above(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().north().north().west().west().above().above(), Blocks.SEA_LANTERN.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().south().south(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().south().south().above(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().west().west().south().south().above().above(), Blocks.SEA_LANTERN.defaultBlockState());

        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().south().south(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().south().south().above(), Blocks.SEA_LANTERN.defaultBlockState());
        pLevel.setBlockAndUpdate(pPlayer.getOnPos().east().east().south().south().above().above(), Blocks.SEA_LANTERN.defaultBlockState());
    }
}
