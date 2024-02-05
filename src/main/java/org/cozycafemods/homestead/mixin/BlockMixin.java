package org.cozycafemods.homestead.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.cozycafemods.homestead.blocks.FertilizedSoilBlock;
import org.cozycafemods.homestead.blocks.ModBlocks;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class BlockMixin {

    @Inject(method = "afterBreak", at = @At("HEAD"))
    private void onAfterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack, CallbackInfo ci) {
        if (state.getBlock() instanceof CropBlock) {
            CropBlock crop = (CropBlock) state.getBlock();
            if (crop.isMature(state)) {
                BlockPos soilPos = pos.down();
                BlockState soilState = world.getBlockState(soilPos);
                if (soilState.getBlock() == ModBlocks.FERTILIZED_SOIL) {
                    FertilizedSoilBlock farmlandBlock = (FertilizedSoilBlock) soilState.getBlock();
                    farmlandBlock.decreaseFertilization();
                }
            }
        }
    }
}

