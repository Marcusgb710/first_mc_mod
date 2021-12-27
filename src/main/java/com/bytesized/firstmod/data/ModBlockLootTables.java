package com.bytesized.firstmod.data;

import com.bytesized.firstmod.block.ModBlocks;
import com.bytesized.firstmod.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NEON_BLOCK.get());
        this.add(ModBlocks.TITANIUM_ORE.get(), (block) -> {
           return createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.TITANIUM_INGOT.get());
        });
        this.add(ModBlocks.NEON_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.NEON_ORE.get(), ModItems.NEON_INGOT.get());
        });


        this.dropSelf(ModBlocks.SPEEDY_BLOCK.get());

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get) :: iterator;
    }
}
