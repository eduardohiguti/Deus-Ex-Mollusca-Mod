package net.epitaph.mollusca.item;

import net.epitaph.mollusca.MolluscaMod;
import net.epitaph.mollusca.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MolluscaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOLLUSCA_TAB = CREATIVE_MODE_TABS.register("mollusca_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSCURO_INGOT.get()))
                    .title(Component.translatable("creativetab.mollusca_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OBSCURO_INGOT.get());
                        pOutput.accept(ModItems.RAW_OBSCURO.get());

                        pOutput.accept(ModItems.KITRINOS.get());

                        pOutput.accept(ModBlocks.OBSCURO_BLOCK.get());
                        pOutput.accept(ModBlocks.OBSCURO_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_OBSCURO_ORE.get());

                        pOutput.accept(ModBlocks.KITRINOS_BLOCK.get());
                        pOutput.accept(ModBlocks.KITRINOS_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_KITRINOS_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
