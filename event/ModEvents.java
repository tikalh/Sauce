package com.tikal.saucept2.event;

import com.tikal.saucept2.block.ModBlocks;
import com.tikal.saucept2.item.ModItems;
import com.tikal.saucept2.saucept2;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = saucept2.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void pigSpawn(LivingSpawnEvent.CheckSpawn event)
    {
        if (event.getEntity().getType() == EntityType.PIG) {
            BlockPos pos = event.getEntity().getOnPos();
            Level level = event.getEntity().getLevel();
            level.setBlockAndUpdate(pos.above(), ModBlocks.SAUCY_BLOCK.get().defaultBlockState());
        }
    }
    @SubscribeEvent
    public static void mobDrop(LivingDeathEvent event)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(11);
        if(event.getEntity().getType() != EntityType.SLIME && event.getEntity() instanceof Monster && rand_int == 1) {
            Level level = event.getEntity().getLevel();
            BlockPos pos = event.getEntity().getOnPos();
            Item saucy_block_item = ModBlocks.SAUCY_BLOCK.get().asItem();
            ItemStack item_stack = new ItemStack(saucy_block_item);
            ItemEntity item_entity = new ItemEntity(level, (double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ(), item_stack);
            level.addFreshEntity(item_entity);
        }
    }
    @SubscribeEvent
    public static void slimeRegulations(LivingSpawnEvent.SpecialSpawn event){
        BlockPos pPos = new BlockPos(event.getX(), event.getY()-1, event.getZ());
        BlockState block_on = event.getWorld().getBlockState(pPos);
        if(event.getEntity().getType() == EntityType.SLIME && (block_on != Blocks.GRASS_BLOCK.defaultBlockState() && block_on != Blocks.DIRT.defaultBlockState())){
            event.setCanceled(true);
        }
    }
}
