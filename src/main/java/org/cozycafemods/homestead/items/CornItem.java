package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class CornItem extends Item {
    public CornItem(){
        super(new FabricItemSettings().food(ModFoodComponents.CORN));
    }
}
