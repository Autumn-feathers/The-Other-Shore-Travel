package com.youjingqiuxi.theothershoretravel.init;

import com.youjingqiuxi.theothershoretravel.TheOtherShoreTravel;
import com.youjingqiuxi.theothershoretravel.blocks.MagicCrystalBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheOtherShoreTravel.MOD_ID);
    public static RegistryObject<Block> magicCrystalBlock = BLOCKS.register("magic_crystal_block", MagicCrystalBlock::new);
}
