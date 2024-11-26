package com.tikal.saucept2.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

public class SecretSauce extends Item {
    public SecretSauce(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pPlayer.sendMessage(new TranslatableComponent("item.saucept2.sauce.sauce"), pPlayer.getUUID());
        BlockPos pPos = pPlayer.getOnPos();
        int y = pPos.getY();
        for (int i = 0; i<21; i++){
            Random rand = new Random();
            int rand_int = rand.nextInt(4);
            y++;
            switch (rand_int) {
                case 1:
                    Cod cod = EntityType.COD.create(pLevel);
                    cod.moveTo((double) pPos.getX() + 0.5D, (double) y, (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
                    pLevel.addFreshEntity(cod);
                    break;
                case 2:
                    Salmon salmon = EntityType.SALMON.create(pLevel);
                    salmon.moveTo((double) pPos.getX() + 0.5D, (double) y, (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
                    pLevel.addFreshEntity(salmon);
                    break;
                case 3:
                    Pufferfish pufferfish = EntityType.PUFFERFISH.create(pLevel);
                    pufferfish.moveTo((double) pPos.getX() + 0.5D, (double) y, (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
                    pLevel.addFreshEntity(pufferfish);
                case 4:
                    TropicalFish tropicalfish = EntityType.TROPICAL_FISH.create(pLevel);
                    tropicalfish.moveTo((double) pPos.getX() + 0.5D, (double) y, (double) pPos.getZ() + 0.5D, 0.0F, 0.0F);
                    pLevel.addFreshEntity(tropicalfish);
            }
        }
        pPlayer.getItemInHand(pUsedHand).hurtAndBreak(1, pPlayer, (player) -> player.broadcastBreakEvent(pUsedHand));
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
