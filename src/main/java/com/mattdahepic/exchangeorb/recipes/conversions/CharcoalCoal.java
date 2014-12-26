package com.mattdahepic.exchangeorb.recipes.conversions;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CharcoalCoal {
    public CharcoalCoal() {

    }
    public static void registerRecipe () {
        //4 charcoal for coal
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal,1),getRecipeTo());
        //1 coal for 4 charcoal
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal,4,1),getRecipeFrom());
    }
    private static Object[] getRecipeTo () {
        ItemStack charcoal = new ItemStack(Items.coal,1,1);
        Object[] recipe = new Object[5];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = charcoal;
        recipe[2] = charcoal;
        recipe[3] = charcoal;
        recipe[4] = charcoal;
        return recipe;
    }

    private static Object[] getRecipeFrom () {
        ItemStack coal = new ItemStack(Items.coal,1,0);
        Object[] recipe = new Object[2];
        recipe[0] = new ItemStack(ExchangeOrb.itemExchangeOrb.setContainerItem(ExchangeOrb.itemExchangeOrb),1);
        recipe[1] = coal;
        return recipe;
    }
}
