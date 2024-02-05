package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.cozycafemods.homestead.CozyHomestead;
import org.cozycafemods.homestead.blocks.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup COZYHOMESTEAD_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CozyHomestead.MOD_ID, "homestead"),
            FabricItemGroup.builder().
            displayName(Text.translatable("itemgroup.homestead")).
            icon(() -> new ItemStack((ModItems.CABBAGE))).
                    entries(((displayContext, entries) -> {
                        entries.add(ModItems.CABBAGE);
                        entries.add(ModItems.CILANTRO);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.MICROGREENS);
                        entries.add(ModItems.PARSLEY);
                        entries.add(ModItems.RICE);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TURNIP);

                        entries.add(ModItems.CABBAGE_SEEDS);
                        entries.add(ModItems.CILANTRO_SEEDS);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.add(ModItems.MICROGREENS_SEEDS);
                        entries.add(ModItems.PARSLEY_SEEDS);
                        entries.add(ModItems.RICE_SEEDS);
                        entries.add(ModItems.TOMATO_SEEDS);

                        entries.add(ModItems.FERTILIZER);
                    })).build());

    public static void registerItemGroups(){
        CozyHomestead.LOGGER.info("Registering Item Groups for " + CozyHomestead.MOD_ID);
    }
}
