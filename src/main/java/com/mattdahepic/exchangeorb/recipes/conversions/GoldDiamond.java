package com.mattdahepic.exchangeorb.recipes.conversions;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GoldDiamond {
    public GoldDiamond() {

    }
    public static void registerRecipe () {
        //4 gold for 1 diamond
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), getRecipeTo());
        //1 diamond for 4 gold
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot,4),getRecipeFrom());
    }
    private static Object[] getRecipeTo () {
        ItemStack gold = new ItemStack(Items.gold_ingot,1);
        Object[] recipe = new Object[5];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = gold;
        recipe[2] = gold;
        recipe[3] = gold;
        recipe[4] = gold;
        return recipe;
    }

    private static Object[] getRecipeFrom () {
        ItemStack diamond = new ItemStack(Items.diamond,1);
        Object[] recipe = new Object[2];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = diamond;
        return recipe;
    }
}
