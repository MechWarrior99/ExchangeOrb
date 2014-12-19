package com.mattdahepic.exchangeorb;

import com.mattdahepic.exchangeorb.recipes.RecipeExchangeOrb;
import com.mattdahepic.exchangeorb.recipes.conversions.CharcoalCoal;
import com.mattdahepic.exchangeorb.recipes.conversions.GoldDiamond;
import com.mattdahepic.exchangeorb.recipes.conversions.IronGold;
import com.mattdahepic.exchangeorb.recipes.conversions.IronRedstone;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerRenderers() {}
    public void registerTiles() {}
    public void registerBlocksItems() {
        //items
        GameRegistry.registerItem(ExchangeOrb.itemExchangeOrb,"exchangeOrb");
    }
    public void registerRecipes() {
        RecipeExchangeOrb.registerRecipe();
        //conversions
        CharcoalCoal.registerRecipe();
        IronGold.registerRecipe();
        GoldDiamond.registerRecipe();
        IronRedstone.registerRecipe();
    }
}