package com.bytesized.firstmod.block;

import com.bytesized.firstmod.FirstMod;
import com.bytesized.firstmod.block.custom.SpeedyBlock;
import com.bytesized.firstmod.item.ModCreativeModeTab;
import com.bytesized.firstmod.item.ModItems;
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
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)
                    .requiresCorrectToolForDrops()

            ), CreativeModeTab.TAB_MATERIALS);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)
                    .requiresCorrectToolForDrops()

            ), CreativeModeTab.TAB_MATERIALS);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)
                    .requiresCorrectToolForDrops()

            ), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> NEON_BLOCK = registerBlock("neon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()

            ), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> NEON_ORE = registerBlock("neon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()

            ), ModCreativeModeTab.TUTORIAL_TAB);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    }


    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
