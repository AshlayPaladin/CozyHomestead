package org.cozycafemods.homestead.items;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent CILANTRO = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).snack().build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent MICROGREEN = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).snack().build();
    public static final FoodComponent PARSLEY = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).snack().build();
    public static final FoodComponent RICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build();
    public static final FoodComponent TURNIP = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
}
