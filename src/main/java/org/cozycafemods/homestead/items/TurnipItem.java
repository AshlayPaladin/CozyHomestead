package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class TurnipItem extends Item {
    public TurnipItem(){
        super(new FabricItemSettings().food(ModFoodComponents.TURNIP));
    }
}
