package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class TomatoItem extends Item {
    public TomatoItem(){
        super(new FabricItemSettings().food(ModFoodComponents.TOMATO));
    }
}
