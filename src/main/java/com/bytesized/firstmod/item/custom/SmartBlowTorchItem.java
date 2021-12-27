package com.bytesized.firstmod.item.custom;

import com.bytesized.firstmod.block.ModBlocks;
import com.bytesized.firstmod.item.ModItems;
import com.google.common.collect.ImmutableMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;


import java.util.Map;


public class SmartBlowTorchItem extends Item {

    private static final Map<Block, Item> BLOW_TORCH_ITEM_CRAFT =
            new ImmutableMap.Builder<Block, Item>()
                    .put(ModBlocks.TITANIUM_ORE.get(), ModItems.TITANIUM_INGOT.get() )
                    .put(ModBlocks.NEON_ORE.get(), ModItems.NEON_INGOT.get())
                    .put(Blocks.IRON_ORE, Items.IRON_INGOT.asItem())
                    .put(Blocks.GOLD_ORE, Items.GOLD_INGOT.asItem())
                    .put(Blocks.COPPER_ORE, Items.COPPER_INGOT.asItem())
                    .put(Blocks.DIAMOND_ORE, Items.DIAMOND.asItem())
                    .put(Blocks.SAND, Blocks.GLASS.asItem())

                    .build();

    public SmartBlowTorchItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public  InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()){
            final var player = pContext.getPlayer();
            final var level = player.level;
            final BlockPos pos = pContext.getClickedPos();
            final BlockState state = level.getBlockState(pos);
            final Block block = state.getBlock();


            if(canBlowTorch(block)){
                ItemEntity entityItem = new ItemEntity(level,
                        pos.getX(), pos.getY(), pos.getZ(),
                        new ItemStack(BLOW_TORCH_ITEM_CRAFT.get(block), 1));


                level.destroyBlock(pos, false);

                level.addFreshEntity(entityItem);
                pContext.getItemInHand().hurtAndBreak(1, player, p -> {
                    p.broadcastBreakEvent(pContext.getHand());



                });


            }else{
                player.sendMessage(new TextComponent("Cannot Blow Torch This Block"),
                        Util.NIL_UUID);

            }

        }



        return InteractionResult.SUCCESS;
    }

    private boolean canBlowTorch(Block block){
        return BLOW_TORCH_ITEM_CRAFT.containsKey(block);
    }
}
