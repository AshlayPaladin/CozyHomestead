package org.cozycafemods.homestead.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.cozycafemods.homestead.items.ModItems;

public class ParsleyCropBlock extends CropBlock {
    public static final int MAX_AGE = 7;
    public static final IntProperty AGE = Properties.AGE_7;

    public ParsleyCropBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[] {
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,2.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,3.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,4.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,5.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,6.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,7.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,8.0D,16.0D),
            Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,9.0D,16.0D)
    };

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

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
    }
}
