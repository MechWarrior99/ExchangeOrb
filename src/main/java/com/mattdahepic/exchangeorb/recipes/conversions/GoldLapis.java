package com.mattdahepic.exchangeorb.recipes.conversions;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GoldLapis {
    public GoldLapis () {

    }
    public static void registerRecipes () {
        //2 gold for 8 lapis
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,8,4), getRecipeTo());
        //8 lapis for 2 gold
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot,2), getRecipeFrom());
    }

    private static Object[] getRecipeTo() {
        ItemStack gold = new ItemStack(Items.gold_ingot,1);
        Object[] recipe = new Object[3];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = gold;
        recipe[2] = gold;
        return recipe;
    }

    private static Object[] getRecipeFrom() {
        ItemStack lapis = new ItemStack(Items.dye,1,4);
        Object[] recipe = new Object[9];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = lapis;
        recipe[2] = lapis;
        recipe[3] = lapis;
        recipe[4] = lapis;
        recipe[5] = lapis;
        recipe[6] = lapis;
        recipe[7] = lapis;
        recipe[8] = lapis;
        return recipe;
    }
}
