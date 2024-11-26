package com.tikal.saucept2.sound;

import com.tikal.saucept2.saucept2;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, saucept2.MOD_ID);

    public static RegistryObject<SoundEvent> SHAKE_THE_BUS = registerSoundEvent("shake_the_bus");
    public static RegistryObject<SoundEvent> AMBIENT = registerSoundEvent("ambient");
    public static RegistryObject<SoundEvent> DARK_NIGHT = registerSoundEvent("dark_night");
    public static RegistryObject<SoundEvent> FALLING_BEHIND = registerSoundEvent("falling_behind");
    public static RegistryObject<SoundEvent> RSA = registerSoundEvent("rsa");
    public static RegistryObject<SoundEvent> SLEEP = registerSoundEvent("sleep");
    public static RegistryObject<SoundEvent> ZAKIM_BRIDGE = registerSoundEvent("zakim_bridge");
    public static RegistryObject<SoundEvent> SOLEMN = registerSoundEvent("solemn");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(saucept2.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}