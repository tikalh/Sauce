package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.IceSpikeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.Random;

public class PortalDrop extends Block {
    public PortalDrop(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        BlockPos blockpos = pPos;
        Random random =new Random();
        int i = random.nextInt(4) + 7;
        int j = i / 4 + random.nextInt(2);
        if (j > 1 && random.nextInt(60) == 0) {
            blockpos = blockpos.above(10 + random.nextInt(30));
        }

        for(int k = 0; k < i; ++k) {
            float f = (1.0F - (float)k / (float)i) * (float)j;
            int l = Mth.ceil(f);

            for(int i1 = -l; i1 <= l; ++i1) {
                float f1 = (float)Mth.abs(i1) - 0.25F;

                for(int j1 = -l; j1 <= l; ++j1) {
                    float f2 = (float)Mth.abs(j1) - 0.25F;
                    if ((i1 == 0 && j1 == 0 || !(f1 * f1 + f2 * f2 > f * f)) && (i1 != -l && i1 != l && j1 != -l && j1 != l || !(random.nextFloat() > 0.75F))) {
                        BlockState blockstate = pLevel.getBlockState(blockpos.offset(i1, k, j1));
                        if (blockstate.isAir() || blockstate.is(Blocks.DIRT) || blockstate.is(Blocks.SNOW_BLOCK) || blockstate.is(Blocks.ICE)) {
                            pLevel.setBlockAndUpdate(blockpos.offset(i1, k, j1), Blocks.PACKED_ICE.defaultBlockState());
                        }

                        if (k != 0 && l > 1) {
                            blockstate = pLevel.getBlockState(blockpos.offset(i1, -k, j1));
                            if (blockstate.isAir() || blockstate.is(Blocks.DIRT) || blockstate.is(Blocks.SNOW_BLOCK) || blockstate.is(Blocks.ICE)) {
                                pLevel.setBlockAndUpdate(blockpos.offset(i1, -k, j1), Blocks.PACKED_ICE.defaultBlockState());
                            }
                        }
                    }
                }
            }
        }

        int k1 = j - 1;
        if (k1 < 0) {
            k1 = 0;
        } else if (k1 > 1) {
            k1 = 1;
        }

        for(int l1 = -k1; l1 <= k1; ++l1) {
            for(int i2 = -k1; i2 <= k1; ++i2) {
                BlockPos blockpos1 = blockpos.offset(l1, -1, i2);
                int j2 = 50;
                if (Math.abs(l1) == 1 && Math.abs(i2) == 1) {
                    j2 = random.nextInt(5);
                }

                while(blockpos1.getY() > 50) {
                    BlockState blockstate1 = pLevel.getBlockState(blockpos1);
                    if (!blockstate1.isAir() && !blockstate1.is(Blocks.DIRT) && !blockstate1.is(Blocks.SNOW_BLOCK) && !blockstate1.is(Blocks.ICE) && !blockstate1.is(Blocks.PACKED_ICE)) {
                        break;
                    }

                    pLevel.setBlockAndUpdate(blockpos1, Blocks.PACKED_ICE.defaultBlockState());
                    blockpos1 = blockpos1.below();
                    --j2;
                    if (j2 <= 0) {
                        blockpos1 = blockpos1.below(random.nextInt(5) + 1);
                        j2 = random.nextInt(5);
                    }
                }
            }
        }
    }

}
