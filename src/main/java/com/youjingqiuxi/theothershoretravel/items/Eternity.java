package com.youjingqiuxi.theothershoretravel.items;

import com.youjingqiuxi.theothershoretravel.TheOtherShoreTravel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Eternity extends Item
{
    public Eternity()
    {
        super(new Properties().tab(TheOtherShoreTravel.TAB));
    }
    public boolean isFoil(ItemStack pStack)
    {
        return true;
    }
}