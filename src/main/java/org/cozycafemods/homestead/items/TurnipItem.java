package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.cozycafemods.homestead.blocks.ModBlocks;

public class TurnipItem extends Item {
    public TurnipItem(){
        super(new FabricItemSettings().food(ModFoodComponents.TURNIP));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Block block = world.getBlockState(blockPos).getBlock();

        if (block == Blocks.FARMLAND || block == ModBlocks.FERTILIZED_SOIL) {
            PlayerEntity playerEntity = context.getPlayer();
            ItemStack itemStack = context.getStack();
            BlockPos blockPosAbove = blockPos.up();
            if (world.isAir(blockPosAbove)) {
                world.setBlockState(blockPosAbove, ModBlocks.TURNIP_CROP_BLOCK.getDefaultState(), 3);
                if (!playerEntity.isCreative()) {
                    itemStack.decrement(1);
                }
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
}
