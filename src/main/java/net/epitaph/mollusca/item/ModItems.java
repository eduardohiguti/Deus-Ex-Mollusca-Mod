package net.epitaph.mollusca.item;

import net.epitaph.mollusca.MolluscaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MolluscaMod.MOD_ID);

    public static final RegistryObject<Item> KITRINOS = ITEMS.register("kitrinos",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OBSCURO_INGOT = ITEMS.register("obscuro_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_OBSCURO = ITEMS.register("raw_obscuro",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
