package com.youjingqiuxi.theothershoretravel;

import com.youjingqiuxi.theothershoretravel.init.InitBlocks;
import com.youjingqiuxi.theothershoretravel.init.InitItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TheOtherShoreTravel.MOD_ID)
public class TheOtherShoreTravel{
    public static final String MOD_ID = "theothershoretravel";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public TheOtherShoreTravel() {
        InitItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        InitBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final ItemGroup TAB = new ItemGroup("TheOtherShoreTravel")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(InitItems.Ethereal_Unit.get());
        }
    };
}