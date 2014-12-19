package com.mattdahepic.exchangeorb.recipes.conversions;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class IronGold {
    public IronGold() {

    }
    public static void registerRecipe () {
        //8 iron for 1 gold
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot,1), getRecipeTo());
        //1 gold for 8 iron
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,8),getRecipeFrom());
    }
    private static Object[] getRecipeTo () {
        ItemStack iron = new ItemStack(Items.iron_ingot,1);
        Object[] recipe = new Object[9];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = iron;
        recipe[2] = iron;
        recipe[3] = iron;
        recipe[4] = iron;
        recipe[5] = iron;
        recipe[6] = iron;
        recipe[7] = iron;
        recipe[8] = iron;
        return recipe;
    }

    private static Object[] getRecipeFrom () {
        ItemStack gold = new ItemStack(Items.gold_ingot,1);
        Object[] recipe = new Object[2];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = gold;
        return recipe;
    }
}
