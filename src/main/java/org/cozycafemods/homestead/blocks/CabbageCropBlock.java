package org.cozycafemods.homestead.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.cozycafemods.homestead.items.ModItems;

public class CabbageCropBlock extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = Properties.AGE_3;

    public CabbageCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public ItemConvertible getSeedsItem() {
        return ModItems.CABBAGE_SEEDS;
    }

    @Override
    public int getMaxAge(){
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

//    @Override
//    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
//
//
//        World world = context.getWorld();
//        BlockPos pos = context.getBlockPos();
//        ItemStack itemStack = context.getStack();
//        PlayerEntity player = context.getPlayer();
//        BlockState state = world.getBlockState(pos);
//    }
}
