package com.youjingqiuxi.theothershoretravel.group;

import com.youjingqiuxi.theothershoretravel.items.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TheOtherShoreTravelGroup extends ItemGroup {
    public TheOtherShoreTravelGroup() {
        super("TheOtherShoreTravel");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.magicCrystal.get());
    }
}
