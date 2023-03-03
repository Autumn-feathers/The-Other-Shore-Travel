package com.youjingqiuxi.theothershoretravel.init;

import com.youjingqiuxi.theothershoretravel.TheOtherShoreTravel;
import com.youjingqiuxi.theothershoretravel.items.MagicCrystal;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheOtherShoreTravel.MOD_ID);
    public static RegistryObject<Item> magicCrystal = ITEMS.register("magic_crystal", MagicCrystal::new);
    //public static RegistryObject<Item> highFrequency = ITEMS.register("high_frequency", HighFrequenry::new);
    public static RegistryObject<Item> magicCrystalBlock = ITEMS.register("magic_crystal_block", () -> new BlockItem(InitBlocks.magicCrystalBlock.get(), new Item.Properties().tab(TheOtherShoreTravel.TAB)));
}