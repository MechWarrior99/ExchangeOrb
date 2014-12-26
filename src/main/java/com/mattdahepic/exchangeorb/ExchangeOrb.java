package com.mattdahepic.exchangeorb;

import com.mattdahepic.exchangeorb.item.ItemExchangeOrb;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;

@Mod(modid = ExchangeOrb.MODID, name = ExchangeOrb.NAME, version = ExchangeOrb.VERSION)
public class ExchangeOrb {
    @Mod.Instance("exchangeorb")
    public static ExchangeOrb instance;

    public static final String MODID = "exchangeorb";
    public static final String VERSION = "v1.3";
    public static final String NAME = "Exchange Orb";

    @SidedProxy(clientSide = "com.mattdahepic.exchangeorb.client.ClientProxy", serverSide = "com.mattdahepic.exchangeorb.CommonProxy")
    public static CommonProxy proxy;
    //public static ClientProxy clientProxy;

    //blocks

    //item
    public static Item itemExchangeOrb;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        itemExchangeOrb = new ItemExchangeOrb();
        proxy.registerBlocksItems();
        proxy.registerRecipes();
        proxy.registerRenderers();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogManager.getLogger().info("Ready to transmute!");
    }
}
