package com.mattdahepic.exchangeorb.recipes;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeExchangeOrb {
    public RecipeExchangeOrb () {

    }
    public static void registerRecipe () {
        GameRegistry.addShapedRecipe(new ItemStack(ExchangeOrb.itemExchangeOrb,1),getRecipe());
        GameRegistry.addShapedRecipe(new ItemStack(ExchangeOrb.itemExchangeOrb,1),getRecipeFlipped());
    }
    private static Object[] getRecipe () {
        ItemStack glowstoneDust = new ItemStack(Items.glowstone_dust); //x
        ItemStack redstoneDust = new ItemStack(Items.redstone); //y
        ItemStack diamond = new ItemStack(Items.diamond); //z
        String row1 = "yxy";
        String row2 = "xzx";
        String row3 = "yxy";
        Object[] recipe = new Object[9];
        recipe[0] = row1;
        recipe[1] = row2;
        recipe[2] = row3;
        recipe[3] = 'x';
        recipe[4] = glowstoneDust;
        recipe[5] = 'y';
        recipe[6] = redstoneDust;
        recipe[7] = 'z';
        recipe[8] = diamond;
        return recipe;
    }
    private static Object[] getRecipeFlipped () {
        ItemStack glowstoneDust = new ItemStack(Items.glowstone_dust); //x
        ItemStack redstoneDust = new ItemStack(Items.redstone); //y
        ItemStack diamond = new ItemStack(Items.diamond); //z
        String row1 = "xyx";
        String row2 = "yzy";
        String row3 = "xyx";
        Object[] recipe = new Object[9];
        recipe[0] = row1;
        recipe[1] = row2;
        recipe[2] = row3;
        recipe[3] = 'x';
        recipe[4] = glowstoneDust;
        recipe[5] = 'y';
        recipe[6] = redstoneDust;
        recipe[7] = 'z';
        recipe[8] = diamond;
        return recipe;
    }
}
