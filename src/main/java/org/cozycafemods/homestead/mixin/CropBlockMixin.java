package org.cozycafemods.homestead.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.cozycafemods.homestead.blocks.FertilizedSoilBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.cozycafemods.homestead.blocks.ModBlocks;

@Mixin(CropBlock.class)
public class CropBlockMixin {
    @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
    private void onRandomTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        if (world.getBlockState(pos.down()).getBlock() ==  ModBlocks.FERTILIZED_SOIL) {
            CropBlock cropBlock = (CropBlock)state.getBlock();

            if (world.getBaseLightLevel(pos, 0) >= 9) {
                int i = cropBlock.getAge(state);
                if (i < cropBlock.getMaxAge()) {
                    world.setBlockState(pos, cropBlock.withAge(i + 1), 2);
                }
            }

            ci.cancel();
        }
    }
}
