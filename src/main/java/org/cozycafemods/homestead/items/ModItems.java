package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.cozycafemods.homestead.CozyHomestead;
import org.cozycafemods.homestead.blocks.ModBlocks;

public class ModItems {
    // Food Items
    public static final Item CABBAGE = new CabbageItem();
    public static final Item CILANTRO = new CilantroItem();
    public static final Item CORN = new CornItem();
    public static final Item MICROGREENS = new MicrogreensItem();
    public static final Item PARSLEY = new ParsleyItem();
    public static final Item RICE = new RiceItem();
    public static final Item TOMATO = new TomatoItem();
    public static final Item TURNIP = new TurnipItem();

    // Seed Items
    public static final Item CABBAGE_SEEDS = new AliasedBlockItem(ModBlocks.CABBAGE_CROP_BLOCK, new FabricItemSettings());
    public static final Item CILANTRO_SEEDS = new AliasedBlockItem(ModBlocks.CILANTRO_CROP_BLOCK, new FabricItemSettings());
    public static final Item CORN_SEEDS = new AliasedBlockItem(ModBlocks.CORN_CROP_BLOCK, new FabricItemSettings());
    public static final Item MICROGREENS_SEEDS = new AliasedBlockItem(ModBlocks.MICROGREENS_CROP_BLOCK, new FabricItemSettings());
    public static final Item PARSLEY_SEEDS = new AliasedBlockItem(ModBlocks.PARSLEY_CROP_BLOCK, new FabricItemSettings());
    public static final Item RICE_SEEDS = new AliasedBlockItem(ModBlocks.RICE_CROP_BLOCK, new FabricItemSettings());
    public static final Item TOMATO_SEEDS = new AliasedBlockItem(ModBlocks.TOMATO_CROP_BLOCK, new FabricItemSettings());

    public static void registerItems(){
        CozyHomestead.LOGGER.info("Registering Items for" + CozyHomestead.MOD_ID);

        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "cabbage"), CABBAGE);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "cabbage_seeds"), CABBAGE_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "cilantro"), CILANTRO);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "cilantro_seeds"), CILANTRO_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "corn"), CORN);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "corn_seeds"), CORN_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "microgreens"), MICROGREENS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "microgreens_seeds"), MICROGREENS_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "parsley"), PARSLEY);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "parsley_seeds"), PARSLEY_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "rice"), RICE);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "rice_seeds"), RICE_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "tomato_seeds"), TOMATO_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(CozyHomestead.MOD_ID, "turnip"), TURNIP);
    }
}
