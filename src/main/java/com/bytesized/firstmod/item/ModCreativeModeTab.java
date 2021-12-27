package com.bytesized.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("first_mod_tab"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };
}
