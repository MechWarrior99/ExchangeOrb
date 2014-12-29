package com.mattdahepic.exchangeorb.config;

import com.mattdahepic.exchangeorb.ExchangeOrb;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ExchangeOrbGuiConfigFactory extends GuiConfig {
    public ExchangeOrbGuiConfigFactory(GuiScreen parentScreen) {
        super(parentScreen, new ConfigElement(ExchangeOrb.configFile.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), ExchangeOrb.MODID,true,true,"Exchange Orb Configuration");
    }
}