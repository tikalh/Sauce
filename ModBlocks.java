package com.tikal.saucept2.block;

import com.tikal.saucept2.block.custom.*;
import com.tikal.saucept2.item.ModItems;
import com.tikal.saucept2.saucept2;
import com.tikal.saucept2.sound.ModSounds;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, saucept2.MOD_ID);

    //blocks
    public static final RegistryObject<Block> SAUCY_BLOCK = registerBlock("saucy_block",
            () -> new SaucyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> WOOL_DROP = registerBlock("wool_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> REDSTONE_DROP = registerBlock("redstone_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> ORE_DROP = registerBlock("ore_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> VALORE_DROP = registerBlock("valore_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> TOOLS_DROP = registerBlock("tools_drop",
            () -> new ToolsDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> NETHER_DROP = registerBlock("nether_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> STARTER_DROP = registerBlock("starter_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> CRAZY_DROP = registerBlock("crazy_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> CHARGED_CREEPER_DROP = registerBlock("charged_creeper_drop",
            () -> new ChargedCreeperDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> HUSK_DROP = registerBlock("husk_drop",
            () -> new HuskDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> PUFFERFISH_DROP = registerBlock("pufferfish_drop",
            () -> new PufferfishDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> END_CRYSTAL_DROP = registerBlock("end_crystal_drop",
            () -> new EndCrystalDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> PILLAGER_DROP = registerBlock("giant_drop",
            () -> new PillagerDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> VILLAGER_DROP = registerBlock("villager_drop",
            () -> new VillagerDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SAPLING_DROP = registerBlock("sapling_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> CAGE_DROP = registerBlock("cage_drop",
            () -> new CageDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> WOOD_TOOLS_DROP = registerBlock("wood_tools_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> GOLD_TOOLS_DROP = registerBlock("gold_tools_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> IRON_TOOLS_DROP = registerBlock("iron_tools_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> FALL_DROP = registerBlock("fall_drop",
            () -> new FallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> MORE_BLOCKS_DROP = registerBlock("more_blocks_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> ROSE_STICK_DROP = registerBlock("rose_stick_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SHULKER_DROP = registerBlock("shulker_drop",
            () -> new ShulkerDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> TNT_DROP = registerBlock("tnt_drop",
            () -> new TNTDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SNOWMAN_DROP = registerBlock("snowman_drop",
            () -> new SnowManDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> VEX_DROP = registerBlock("vex_drop",
            () -> new VexDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> EXPLOSION_DROP = registerBlock("explosion_drop",
            () -> new ExplosionDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> GUARDIAN_DROP = registerBlock("guardian_drop",
            () -> new GuardianDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> EPEARL_DROP = registerBlock("epearl_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> BOW_DROP = registerBlock("bow_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> ARMOR_DROP = registerBlock("armor_drop",
            () -> new ArmorDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> LEATHER_ARMOR_DROP = registerBlock("leather_armor_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> GOLD_ARMOR_DROP = registerBlock("gold_armor_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> IRON_ARMOR_DROP = registerBlock("iron_armor_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> ARROW_DROP = registerBlock("arrow_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> KNOCKBACK_DROP = registerBlock("knockback_drop",
            () -> new KnockBackDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);
//^now mooshroom drop
    public static final RegistryObject<Block> PORTAL_DROP = registerBlock("portal_drop",
            () -> new PortalDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> WITHER_SKELETON_DROP = registerBlock("wither_skeleton_drop",
            () -> new WitherSkeletonDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> DISC_DROP = registerBlock("disc_drop",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> SPIKE_DROP = registerBlock("spike_drop",
            () -> new SpikeDrop(BlockBehaviour.Properties.of(Material.STONE).strength(0.2f)), CreativeModeTab.TAB_MISC);




    //to add new drop: add block, blockstate, add to list in saucyblock class, add 1 to bound in random in saucyblock class

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
