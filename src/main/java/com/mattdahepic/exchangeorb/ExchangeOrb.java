package com.mattdahepic.exchangeorb;

import com.mattdahepic.exchangeorb.item.ItemExchangeOrb;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid = ExchangeOrb.MODID, name = ExchangeOrb.NAME, version = ExchangeOrb.VERSION)
public class ExchangeOrb {
    @Mod.Instance("exchangeorb")
    public static ExchangeOrb instance;

    public static final String MODID = "exchangeorb";
    public static final String VERSION = "v1.1";
    public static final String NAME = "Exchange Orb";

    @SidedProxy(clientSide = "com.mattdahepic.exchangeorb.client.ClientProxy", serverSide = "com.mattdahepic.exchangeorb.CommonProxy")
    public static CommonProxy proxy;

    //blocks

    //items
    public static Item itemExchangeOrb;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        itemExchangeOrb = new ItemExchangeOrb();
        proxy.registerBlocksItems();
        proxy.registerRecipes();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
