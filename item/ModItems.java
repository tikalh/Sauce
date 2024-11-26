package com.tikal.saucept2.item;

import com.tikal.saucept2.item.custom.SecretSauce;
import com.tikal.saucept2.saucept2;
import com.tikal.saucept2.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, saucept2.MOD_ID);

    public static final RegistryObject<Item> STB_MUSIC_DISC = ITEMS.register("stb_music_disc",
            () -> new RecordItem(4, ModSounds.SHAKE_THE_BUS, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> AMBIENT_MUSIC_DISC = ITEMS.register("ambient_music_disc",
            () -> new RecordItem(4, ModSounds.AMBIENT, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> DN_MUSIC_DISC = ITEMS.register("dn_music_disc",
            () -> new RecordItem(4, ModSounds.DARK_NIGHT, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> FB_MUSIC_DISC = ITEMS.register("fb_music_disc",
            () -> new RecordItem(4, ModSounds.FALLING_BEHIND, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> RSA_MUSIC_DISC = ITEMS.register("rsa_music_disc",
            () -> new RecordItem(4, ModSounds.RSA, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> SLEEP_MUSIC_DISC = ITEMS.register("sleep_music_disc",
            () -> new RecordItem(4, ModSounds.SLEEP, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> ZB_MUSIC_DISC = ITEMS.register("zb_music_disc",
            () -> new RecordItem(4, ModSounds.ZAKIM_BRIDGE, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> SOLEMN = ITEMS.register("solemn_music_disc",
            () -> new RecordItem(4, ModSounds.SOLEMN, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> SAUCE = ITEMS.register("sauce",
            () -> new SecretSauce(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.EPIC).durability(1)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
