package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

        if ((state.getBlock() instanceof FertilizedSoilBlock) || (state.getBlock() == Blocks.FARMLAND)) {
            BlockPos blockPosAbove = pos.up();
            if (world.isAir(blockPosAbove)) {
                world.setBlockState(blockPosAbove, ModBlocks.CABBAGE_CROP_BLOCK.getDefaultState(), 3);
                if (!player.isCreative()) {
                    itemStack.decrement(1);
                }
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }
}
