package com.mattdahepic.exchangeorb.recipes.conversions;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class IronRedstone {
    public IronRedstone() {

    }
    public static void registerRecipe () {
        //1 iron for 8 redstone
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 8), getRecipeTo());
        //8 redstone for 1 iron
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,1),getRecipeFrom());
    }
    private static Object[] getRecipeTo () {
        ItemStack iron = new ItemStack(Items.iron_ingot,1);
        Object[] recipe = new Object[2];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = iron;
        return recipe;
    }

    private static Object[] getRecipeFrom () {
        ItemStack redstone = new ItemStack(Items.redstone,1);
        Object[] recipe = new Object[9];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = redstone;
        recipe[2] = redstone;
        recipe[3] = redstone;
        recipe[4] = redstone;
        recipe[5] = redstone;
        recipe[6] = redstone;
        recipe[7] = redstone;
        recipe[8] = redstone;
        return recipe;
    }
}
