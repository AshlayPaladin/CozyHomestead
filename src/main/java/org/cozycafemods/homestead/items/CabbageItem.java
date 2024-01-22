package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class CabbageItem extends Item {
    public CabbageItem(){
        super(new FabricItemSettings().food(ModFoodComponents.CABBAGE));
    }
}
