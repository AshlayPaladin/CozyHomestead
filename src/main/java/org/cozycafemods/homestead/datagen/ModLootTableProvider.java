package org.cozycafemods.homestead.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.state.property.IntProperty;
import org.cozycafemods.homestead.blocks.*;
import org.cozycafemods.homestead.items.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generate(){
        // Add Crop Seed Drops
        addCrop(ModBlocks.CABBAGE_CROP_BLOCK, ModItems.CABBAGE, ModItems.CABBAGE_SEEDS, CabbageCropBlock.AGE, CabbageCropBlock.MAX_AGE);
        addCrop(ModBlocks.CILANTRO_CROP_BLOCK, ModItems.CILANTRO, ModItems.CILANTRO_SEEDS, CilantroCropBlock.AGE, CilantroCropBlock.MAX_AGE);
        addCrop(ModBlocks.CORN_CROP_BLOCK, ModItems.CORN, ModItems.CORN_SEEDS, CornCropBlock.AGE, CornCropBlock.MAX_AGE);
        addCrop(ModBlocks.MICROGREENS_CROP_BLOCK, ModItems.MICROGREENS, ModItems.MICROGREENS_SEEDS, MicrogreensCropBlock.AGE, MicrogreensCropBlock.MAX_AGE);
        addCrop(ModBlocks.PARSLEY_CROP_BLOCK, ModItems.PARSLEY, ModItems.PARSLEY_SEEDS, ParsleyCropBlock.AGE, ParsleyCropBlock.MAX_AGE);
        addCrop(ModBlocks.RICE_CROP_BLOCK, ModItems.RICE, ModItems.RICE_SEEDS, RiceCropBlock.AGE, RiceCropBlock.MAX_AGE);
        addCrop(ModBlocks.TOMATO_CROP_BLOCK, ModItems.TOMATO, ModItems.TOMATO_SEEDS, TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE);
        addCrop(ModBlocks.TURNIP_CROP_BLOCK, ModItems.TURNIP, ModItems.TURNIP, TurnipCropBlock.AGE, TurnipCropBlock.MAX_AGE);

        // Add Block Drops
        addDrop(ModBlocks.FERTILIZED_SOIL, drops(Blocks.DIRT));
        addDrop(ModBlocks.FERTILIZED_SOIL, drops(Items.BONE_MEAL));
    }

    protected void addCrop(Block cropBlock, Item cropProduce, Item cropSeed, IntProperty ageProperty, int maxAge) {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(cropBlock).properties(StatePredicate.Builder.create()
                .exactMatch(ageProperty, maxAge));
        addDrop(cropBlock, cropDrops(cropBlock, cropProduce, cropSeed, builder));
    }
}
