package com.youjingqiuxi.theothershoretravel;

import com.youjingqiuxi.theothershoretravel.block.BlockRegistry;
import com.youjingqiuxi.theothershoretravel.items.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class TheOtherShoreTravel{

    public TheOtherShoreTravel() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}