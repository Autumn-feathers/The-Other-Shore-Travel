package com.youjingqiuxi.theothershoretravel.block;

import com.youjingqiuxi.theothershoretravel.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> magicCrystalBlock = BLOCKS.register("magic_crystal_block", MagicCrystalBlock::new);
}
