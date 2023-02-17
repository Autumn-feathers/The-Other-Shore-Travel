package com.youjingqiuxi.theothershoretravel.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicCrystalBlock extends Block {

    public MagicCrystalBlock() {
        super(Properties.of(Material.STONE).strength(1.5f,6.0f).sound(SoundType.STONE).lightLevel(s -> 7).friction(0.9f));
    }
}