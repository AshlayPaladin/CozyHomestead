package org.cozycafemods.homestead;

import net.fabricmc.api.ModInitializer;

import org.cozycafemods.homestead.blocks.ModBlocks;
import org.cozycafemods.homestead.datagen.ModLootTableProvider;
import org.cozycafemods.homestead.items.ModItemGroups;
import org.cozycafemods.homestead.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyHomestead implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("cozyhomestead");
	public static final String MOD_ID = "cozyhomestead";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Cozy Cafe's Homestead Branch is Now Open!");

		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}