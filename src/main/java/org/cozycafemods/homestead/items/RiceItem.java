package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class RiceItem extends Item {
    public RiceItem(){
        super(new FabricItemSettings().food(ModFoodComponents.RICE));
    }
}
