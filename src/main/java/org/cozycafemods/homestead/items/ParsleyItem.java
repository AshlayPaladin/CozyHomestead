package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ParsleyItem extends Item {
    public ParsleyItem(){
        super(new FabricItemSettings().food(ModFoodComponents.PARSLEY));
    }
}
