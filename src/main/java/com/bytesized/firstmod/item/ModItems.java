package com.bytesized.firstmod.item;

import com.bytesized.firstmod.FirstMod;
import com.bytesized.firstmod.item.custom.ModArmorItem;
import com.bytesized.firstmod.item.custom.SmartBlowTorchItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);


    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_NEON = ITEMS.register("raw_neon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_INGOT = ITEMS.register("neon_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

       public static final RegistryObject<Item> NEON_NUGGET = ITEMS.register("neon_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

    public static final RegistryObject<Item> SMART_BLOW_TORCH = ITEMS.register("smart_blow_torch",
            () -> new SmartBlowTorchItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModTiers.TITANIUM, 6, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModTiers.TITANIUM, 2, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModTiers.TITANIUM, 1, 2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModTiers.TITANIUM, 4, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new AxeItem(ModTiers.TITANIUM, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_BOOTS= ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS= ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE= ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_HELMET= ITEMS.register("titanium_helmet",
            () -> new ModArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static final RegistryObject<Item> NEON_SWORD = ITEMS.register("neon_sword",
            () -> new SwordItem(ModTiers.NEON, 6, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_PICKAXE = ITEMS.register("neon_pickaxe",
            () -> new PickaxeItem(ModTiers.NEON, 2, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_SHOVEL = ITEMS.register("neon_shovel",
            () -> new ShovelItem(ModTiers.NEON, 1, 2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_AXE = ITEMS.register("neon_axe",
            () -> new AxeItem(ModTiers.NEON, 4, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_HOE = ITEMS.register("neon_hoe",
            () -> new AxeItem(ModTiers.NEON, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_BOOTS = ITEMS.register("neon_boots",
            () -> new ArmorItem(ModNeonArmourMaterial.NEON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_LEGGINGS = ITEMS.register("neon_leggings",
            () -> new ArmorItem(ModNeonArmourMaterial.NEON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_CHESTPLATE= ITEMS.register("neon_chestplate",
            () -> new ArmorItem(ModNeonArmourMaterial.NEON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> NEON_HELMET= ITEMS.register("neon_helmet",
            () -> new ArmorItem(ModNeonArmourMaterial.NEON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));











    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
