package org.cozycafemods.homestead;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.cozycafemods.homestead.datagen.ModLootTableProvider;
import org.cozycafemods.homestead.datagen.ModModelProvider;

public class CozyHomesteadDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
    }
}
