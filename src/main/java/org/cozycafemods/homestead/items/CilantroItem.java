package org.cozycafemods.homestead.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class CilantroItem extends Item {
    public CilantroItem(){
        super(new FabricItemSettings().food(ModFoodComponents.CILANTRO));
    }
}
