package org.cozycafemods.homestead.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.cozycafemods.homestead.CozyHomestead;

import java.util.IdentityHashMap;

public class ModBlocks {
    public static final Block CABBAGE_CROP_BLOCK = new CabbageCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block CILANTRO_CROP_BLOCK = new CilantroCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block CORN_CROP_BLOCK = new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block MICROGREENS_CROP_BLOCK = new MicrogreensCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block PARSLEY_CROP_BLOCK = new ParsleyCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block RICE_CROP_BLOCK = new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block TOMATO_CROP_BLOCK = new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT));
    public static final Block TURNIP_CROP_BLOCK = new TurnipCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));

    public static void registerBlocks() {
        CozyHomestead.LOGGER.info("Registering Blocks for " + CozyHomestead.MOD_ID);

        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "cabbage_crop"), CABBAGE_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "cilantro_crop"), CILANTRO_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "corn_crop"), CORN_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "microgreens_crop"), MICROGREENS_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "parsley_crop"), PARSLEY_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "rice_crop"), RICE_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "tomato_crop"), TOMATO_CROP_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(CozyHomestead.MOD_ID, "turnip_crop"), TURNIP_CROP_BLOCK);
    }
}
