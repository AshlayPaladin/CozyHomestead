package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.cozycafemods.homestead.blocks.FertilizedSoilBlock;
import org.cozycafemods.homestead.blocks.ModBlocks;

import static net.minecraft.block.FarmlandBlock.MOISTURE;

public class FertilizerItem extends Item {
    public FertilizerItem(){

        super(new FabricItemSettings().maxCount(1).maxDamage(64));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        ItemStack itemStack = context.getStack();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);

        if (state.getBlock() == Blocks.FARMLAND) {
            BlockState fertilizedBlockState = ModBlocks.FERTILIZED_SOIL.getDefaultState();

            world.setBlockState(pos, fertilizedBlockState, 3);

            FertilizedSoilBlock fertilizedBlock = (FertilizedSoilBlock) fertilizedBlockState.getBlock();
            fertilizedBlock.setFertilizedLevel(10);

            world.playSound(null, pos, SoundEvents.BLOCK_ROOTED_DIRT_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);

            if(player instanceof ServerPlayerEntity)
            {
                itemStack.damage(1, world.random, (ServerPlayerEntity) player);
            }
            else {
                itemStack.damage(1, world.random, null);
            }

            if(itemStack.getDamage() >= itemStack.getMaxDamage()) {
                world.playSound(null, context.getBlockPos(), SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.PLAYERS, 0.8F, 0.8F + world.random.nextFloat() * 0.4F);
                itemStack.decrement(1);
            }

            return ActionResult.SUCCESS;
        }
        else if (state.getBlock() == ModBlocks.FERTILIZED_SOIL) {

            FertilizedSoilBlock fertilizedBlock = (FertilizedSoilBlock) state.getBlock();
            fertilizedBlock.setFertilizedLevel(10);

            world.playSound(null, pos, SoundEvents.BLOCK_ROOTED_DIRT_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);

            if(player instanceof ServerPlayerEntity)
            {
                itemStack.damage(1, world.random, (ServerPlayerEntity) player);
            }
            else {
                itemStack.damage(1, world.random, null);
            }

            if(itemStack.getDamage() >= itemStack.getMaxDamage()) {
                world.playSound(null, context.getBlockPos(), SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.PLAYERS, 0.8F, 0.8F + world.random.nextFloat() * 0.4F);
                itemStack.decrement(1);
            }

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
