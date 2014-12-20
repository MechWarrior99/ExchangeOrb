package com.mattdahepic.exchangeorb.recipes.conversions;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DiamondEmerald {
    public DiamondEmerald () {

    }
    public static void registerRecipes () {
        //2 diamond for 1 emerald
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald,1),getRecipeTo());
        //1 emerald for 2 diamonds
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,2),getRecipeFrom());
    }
    private static Object[] getRecipeTo () {
        ItemStack diamond = new ItemStack(Items.diamond,1);
        Object[] recipe = new Object[3];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = diamond;
        recipe[2] = diamond;
        return recipe;
    }
    private static Object[] getRecipeFrom () {
        Object[] recipe = new Object[2];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = new ItemStack(Items.emerald,1);
        return recipe;
    }
}
