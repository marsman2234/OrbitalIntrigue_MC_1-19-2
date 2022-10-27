package com.marsman2234.orbitalintrigue.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OI_GENERAL_TAB = new CreativeModeTab("oigeneraltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ETHERIUM_SHARD.get());
        }
    };
}
