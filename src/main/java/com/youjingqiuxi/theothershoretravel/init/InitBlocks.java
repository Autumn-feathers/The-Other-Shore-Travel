package com.youjingqiuxi.theothershoretravel.init;

import com.youjingqiuxi.theothershoretravel.TheOtherShoreTravel;
import com.youjingqiuxi.theothershoretravel.blocks.HighPressureBlock;
import com.youjingqiuxi.theothershoretravel.blocks.MagicCrystalBlock;
import com.youjingqiuxi.theothershoretravel.blocks.OverclockingBlock;
import com.youjingqiuxi.theothershoretravel.blocks.SpecialAlloysBlock;
import com.youjingqiuxi.theothershoretravel.blocks.MagicBusBasics;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheOtherShoreTravel.MOD_ID);
    public static RegistryObject<Block> Magic_Crystal_Block = BLOCKS.register("magic_crystal_block", MagicCrystalBlock::new);
    public static RegistryObject<Block> High_Pressure_Block = BLOCKS.register("high_pressure_block", HighPressureBlock::new);
    public static RegistryObject<Block> Overclocking_Block = BLOCKS.register("overclocking_block", OverclockingBlock::new);
    public static RegistryObject<Block> Special_Alloys_Block = BLOCKS.register("special_alloys_block", SpecialAlloysBlock::new);
    public static RegistryObject<Block> Magic_Bus_Basics = BLOCKS.register("magic_bus_basics", MagicBusBasics::new);
}