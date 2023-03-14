package com.youjingqiuxi.theothershoretravel.init;

import com.youjingqiuxi.theothershoretravel.TheOtherShoreTravel;
import com.youjingqiuxi.theothershoretravel.items.MagicCrystal;
import com.youjingqiuxi.theothershoretravel.items.HighPressure;
import com.youjingqiuxi.theothershoretravel.items.Overclocking;
import com.youjingqiuxi.theothershoretravel.items.Eternity;
import com.youjingqiuxi.theothershoretravel.items.EternalFragments;
import com.youjingqiuxi.theothershoretravel.items.SpecialAlloys;
import com.youjingqiuxi.theothershoretravel.items.SteelRockCrystals;
import com.youjingqiuxi.theothershoretravel.items.EtherealUnit;
import com.youjingqiuxi.theothershoretravel.items.MagicCrystalWrench;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheOtherShoreTravel.MOD_ID);
    public static RegistryObject<Item> Magic_Crystal = ITEMS.register("magic_crystal", MagicCrystal::new);
    public static RegistryObject<Item> High_Pressure = ITEMS.register("high_pressure", HighPressure::new);
    public static RegistryObject<Item> Overclocking = ITEMS.register("overclocking", Overclocking::new);
    public static RegistryObject<Item> Eternity = ITEMS.register("eternity", Eternity::new);
    public static RegistryObject<Item> Eternal_Fragments = ITEMS.register("eternal_fragments", EternalFragments::new);
    public static RegistryObject<Item> Special_Alloys = ITEMS.register("special_alloys", SpecialAlloys::new);
    public static RegistryObject<Item> Steel_Rock_Crystals = ITEMS.register("steel_rock_crystals", SteelRockCrystals::new);
    public static RegistryObject<Item> Ethereal_Unit = ITEMS.register("ethereal_unit", EtherealUnit::new);
    public static RegistryObject<Item> Magic_Crystal_Wrench = ITEMS.register("magic_crystal_wrench", MagicCrystalWrench::new);
    public static RegistryObject<Item> Magic_Crystal_Block = ITEMS.register("magic_crystal_block", () -> new BlockItem(InitBlocks.Magic_Crystal_Block.get(), new Item.Properties().tab(TheOtherShoreTravel.TAB)));
    public static RegistryObject<Item> High_Pressure_Block = ITEMS.register("high_pressure_block", () -> new BlockItem(InitBlocks.High_Pressure_Block.get(), new Item.Properties().tab(TheOtherShoreTravel.TAB)));
    public static RegistryObject<Item> Overclocking_Block = ITEMS.register("overclocking_block", () -> new BlockItem(InitBlocks.Overclocking_Block.get(), new Item.Properties().tab(TheOtherShoreTravel.TAB)));
    public static RegistryObject<Item> Special_Alloys_Block = ITEMS.register("special_alloys_block", () -> new BlockItem(InitBlocks.Special_Alloys_Block.get(), new Item.Properties().tab(TheOtherShoreTravel.TAB)));
    public static RegistryObject<Item> Magic_Bus_Basics = ITEMS.register("magic_bus_basics", () -> new BlockItem(InitBlocks.Magic_Bus_Basics.get(), new Item.Properties().tab(TheOtherShoreTravel.TAB)));
}