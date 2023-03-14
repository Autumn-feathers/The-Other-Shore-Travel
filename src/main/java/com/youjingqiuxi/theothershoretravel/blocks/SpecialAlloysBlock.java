package com.youjingqiuxi.theothershoretravel.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SpecialAlloysBlock extends Block
{

    public SpecialAlloysBlock()
    {
        super(Properties.of(Material.STONE).strength(1.5f,6.0f).sound(SoundType.STONE).lightLevel(s -> 0).friction(0.9f).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
    }
}