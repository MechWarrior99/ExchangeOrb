package com.mattdahepic.exchangeorb.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemExchangeOrb extends Item {
    public ItemExchangeOrb () {
        super();
        this.setUnlocalizedName("exchangeOrb");
        this.setMaxStackSize(1);
        //TODO: creative tabs
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("exchangeorb:itemExchangeOrb");
    }
}
