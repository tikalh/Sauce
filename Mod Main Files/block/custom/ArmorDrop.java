package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.tikal.saucept2.block.ModBlocks.*;

public class ArmorDrop extends Block {
    public ArmorDrop(Properties p_49795_) {
        super(p_49795_);
    }
    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {

        List<RegistryObject<Block>> block_results = new ArrayList<>();
        block_results.add(LEATHER_ARMOR_DROP);
        block_results.add(GOLD_ARMOR_DROP);
        block_results.add(IRON_ARMOR_DROP);
        Random rand = new Random();
        int rand_int = rand.nextInt(3);
        RegistryObject<Block> drop_det = block_results.get(rand_int);
        BlockState blockstate = drop_det.get().defaultBlockState();
        pLevel.setBlockAndUpdate(pPos, blockstate);
    }
}
