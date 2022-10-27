package com.marsman2234.orbitalintrigue.item;

import com.marsman2234.orbitalintrigue.OrbitalIntrigue;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OrbitalIntrigue.MOD_ID);

    public static final RegistryObject<Item> ETHERIUM_SHARD = ITEMS.register("etherium_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OI_GENERAL_TAB)));
    public static final RegistryObject<Item> REFINED_ETHERIUM = ITEMS.register("refined_etherium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OI_GENERAL_TAB)));
    public static final RegistryObject<Item> ETHERIUM_BLADE = ITEMS.register("etherium_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OI_GENERAL_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
