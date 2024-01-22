package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class MicrogreensItem extends Item {
    public MicrogreensItem(){
        super(new FabricItemSettings().food(ModFoodComponents.MICROGREEN));
    }
}
