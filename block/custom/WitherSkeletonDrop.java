package com.tikal.saucept2.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static net.minecraft.world.item.enchantment.Enchantments.KNOCKBACK;

public class WitherSkeletonDrop extends Block {
    public WitherSkeletonDrop(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        WitherSkeleton wither_skeleton = EntityType.WITHER_SKELETON.create(pLevel);
        List<Item> coral_fan_list = new ArrayList<>();
            coral_fan_list.add(Items.BRAIN_CORAL_FAN);
            coral_fan_list.add(Items.FIRE_CORAL_FAN);
            coral_fan_list.add(Items.BUBBLE_CORAL_FAN);
            coral_fan_list.add(Items.HORN_CORAL_FAN);
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        Item drop = coral_fan_list.get(rand_int);
        ItemStack coral_fan = new ItemStack(drop);
        wither_skeleton.setBaby(true);
        wither_skeleton.setItemSlot(EquipmentSlot.OFFHAND, coral_fan);
        wither_skeleton.setDropChance(EquipmentSlot.OFFHAND, 2.0F);
        ItemStack sword = new ItemStack(Items.STONE_SWORD);
        wither_skeleton.setItemSlot(EquipmentSlot.MAINHAND, sword);
        wither_skeleton.moveTo((double) pPos.getX() + 0.5D, (double) pPos.getY(), (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
        pLevel.addFreshEntity(wither_skeleton);
        wither_skeleton.spawnAnim();
    }
}
