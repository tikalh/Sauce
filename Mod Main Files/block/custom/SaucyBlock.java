package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.tikal.saucept2.block.ModBlocks.*;

public class SaucyBlock extends Block {
    public SaucyBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState, @Nullable BlockEntity pBlockEntity, ItemStack pTool) {
        List<RegistryObject<Block>> block_results = new ArrayList<>();
        block_results.add(WOOL_DROP);
        block_results.add(REDSTONE_DROP);
        block_results.add(ORE_DROP);
        block_results.add(VALORE_DROP);
        //valore is now diamond armor/tools
        block_results.add(TOOLS_DROP);
        block_results.add(NETHER_DROP);
        block_results.add(STARTER_DROP);
        block_results.add(CRAZY_DROP);
        block_results.add(CHARGED_CREEPER_DROP);
        block_results.add(HUSK_DROP);
        block_results.add(PUFFERFISH_DROP);
        block_results.add(END_CRYSTAL_DROP);
        block_results.add(SAPLING_DROP);
        block_results.add(VILLAGER_DROP);
        block_results.add(PILLAGER_DROP);
        block_results.add(CAGE_DROP);
        block_results.add(FALL_DROP);
        block_results.add(MORE_BLOCKS_DROP);
        block_results.add(ROSE_STICK_DROP);
        block_results.add(ROSE_STICK_DROP);
        //added twice bc its 2 items
        block_results.add(SHULKER_DROP);
        block_results.add(TNT_DROP);
        block_results.add(SNOWMAN_DROP);
        block_results.add(VEX_DROP);
        block_results.add(EXPLOSION_DROP);
        block_results.add(GUARDIAN_DROP);
        block_results.add(EPEARL_DROP);
        block_results.add(BOW_DROP);
        block_results.add(ARMOR_DROP);
        block_results.add(ARROW_DROP);
        block_results.add(KNOCKBACK_DROP);
        //now mushroom^
        block_results.add(WITHER_SKELETON_DROP);
        block_results.add(DISC_DROP);
        block_results.add(SPIKE_DROP);
        block_results.add(PORTAL_DROP);
        //ice spike drop^
        Random rand = new Random();
        int rand_int = rand.nextInt(35);
        //bound should equal the exact number of possible drops bc next int is inclusive to 0 but exclusive to the bound
        RegistryObject<Block> drop_det = block_results.get(rand_int);
        BlockState blockstate = drop_det.get().defaultBlockState();
        pLevel.setBlockAndUpdate(pPos, blockstate);
        pLevel.destroyBlock(pPos, true, pPlayer, 512);
    }
}
