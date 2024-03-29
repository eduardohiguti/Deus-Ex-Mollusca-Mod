package net.epitaph.mollusca.block;

import net.epitaph.mollusca.MolluscaMod;
import net.epitaph.mollusca.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MolluscaMod.MOD_ID);

    public static final RegistryObject<Block> OBSCURO_BLOCK = registerBlock("obscuro_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> OBSCURO_ORE = registerBlock("obscuro_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS),
                    UniformInt.of(10, 15)));
    public static final RegistryObject<Block> DEEPSLATE_OBSCURO_ORE = registerBlock("deepslate_obscuro_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS),
                    UniformInt.of(10, 15)));



    public static final RegistryObject<Block> KITRINOS_BLOCK = registerBlock("kitrinos_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> KITRINOS_ORE = registerBlock("kitrinos_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS),
                    UniformInt.of(10, 15)));
    public static final RegistryObject<Block> DEEPSLATE_KITRINOS_ORE = registerBlock("deepslate_kitrinos_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS),
                    UniformInt.of(10, 15)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
