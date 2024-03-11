package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.cozycafemods.homestead.CozyHomestead;
import org.cozycafemods.homestead.blocks.ModBlocks;

public class CabbageSeedsItem extends Item {
    public CabbageSeedsItem(){
        super(new FabricItemSettings());
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        ItemStack itemStack = context.getStack();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);

        if ((state.getBlock() == ModBlocks.FERTILIZED_SOIL) || (state.getBlock() == Blocks.FARMLAND)) {
            BlockPos blockPosAbove = pos.up();
            //CozyHomestead.LOGGER.info("Checking POS for open space: X=" + pos.getX() + ", Y=" + pos.getY() + ", Z=" + pos.getZ());
            if (world.isAir(blockPosAbove)) {
                world.setBlockState(blockPosAbove, ModBlocks.CABBAGE_CROP_BLOCK.getDefaultState(), 3);
                //CozyHomestead.LOGGER.info("Cabbage Block Created at X:" + blockPosAbove.getX() + ", Y:" + blockPosAbove.getY() + ", Z:" + blockPosAbove.getZ());
                if (!player.isCreative()) {
                    itemStack.decrement(1);
                }
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }
}
