package com.youjingqiuxi.theothershoretravel.items;

import com.youjingqiuxi.theothershoretravel.Utils;
import com.youjingqiuxi.theothershoretravel.block.BlockRegistry;
import com.youjingqiuxi.theothershoretravel.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> magicCrystal = ITEMS.register("magic_crystal", MagicCrystal::new);
    public static final RegistryObject<Item> magicCrystalBlock = ITEMS.register("magic_crystal_block", () -> new BlockItem(BlockRegistry.magicCrystalBlock.get(), new Item.Properties().tab(ModGroup.itemGroup)));
}