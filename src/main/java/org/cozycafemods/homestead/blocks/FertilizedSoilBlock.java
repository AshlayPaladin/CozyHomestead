package org.cozycafemods.homestead.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class FertilizedSoilBlock extends FarmlandBlock {
    private static int fertilizedLevel = 10;

    public FertilizedSoilBlock(Settings settings)
    {
        super(settings);
    }

    public int getFertilizedLevel() {
        return fertilizedLevel;
    }

    public void setFertilizedLevel(int level) {
        fertilizedLevel = level;
    }

    public void decreaseFertilization() {
        if(fertilizedLevel > 0) {
            fertilizedLevel = fertilizedLevel - 1;
        }
        else {
            fertilizedLevel = 0;
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if(fertilizedLevel == 0) {
            BlockState farmlandBlockState = Blocks.FARMLAND.getDefaultState();

            world.setBlockState(pos, farmlandBlockState, 3);
        }
    }
}
