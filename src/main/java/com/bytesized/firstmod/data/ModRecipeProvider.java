package com.bytesized.firstmod.data;



import com.bytesized.firstmod.block.ModBlocks;
import com.bytesized.firstmod.item.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModBlocks.TITANIUM_BLOCK.get())
                .define('T', ModItems.TITANIUM_INGOT.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .unlockedBy("has_material", has(ModItems.TITANIUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(ModItems.SMART_BLOW_TORCH.get())
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('F', Items.FLINT.asItem())
                .pattern("TTF")
                .pattern("T  ")
                .pattern("T  ")
                .unlockedBy("has_material", has(ModItems.TITANIUM_INGOT.get()))

                .save(pFinishedRecipeConsumer);

    }
}
