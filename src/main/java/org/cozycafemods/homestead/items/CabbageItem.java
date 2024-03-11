package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.cozycafemods.homestead.blocks.ModBlocks;

public class CabbageItem extends Item {
    public CabbageItem(){
        super(new FabricItemSettings().food(ModFoodComponents.CABBAGE));
    }

}
