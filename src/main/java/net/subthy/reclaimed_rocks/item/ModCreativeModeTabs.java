package net.subthy.reclaimed_rocks.item;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReclaimedRocksMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("reclaimed_rocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DOLOMITE.get()))
                    .title(Component.translatable("creativetab.reclaimed_rocks_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.DOLOMITE.get());
                        output.accept(ModBlocks.DOLOMITE_PILLAR.get());
                        output.accept(ModBlocks.DOLOMITE_CHISELED_BRICKS.get());
                        output.accept(ModBlocks.DOLOMITE_LAYERED_BLOCK.get());
                        output.accept(ModBlocks.DOLOMITE_BRICKS.get());
                        output.accept(ModBlocks.DOLOMITE_COBBLESTONE.get());
                        output.accept(ModBlocks.DOLOMITE_PAVED_BRICKS.get());
                        output.accept(ModBlocks.DOLOMITE_PAVED_BRICK_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_POLISHED_BLOCK.get());
                        output.accept(ModBlocks.DOLOMITE_FANCY_BRICKS.get());
                        output.accept(ModBlocks.DOLOMITE_BRICK_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_POLISHED_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_LAYERED_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_LAYERED_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_POLISHED_STAIRS.get());
                        output.accept(ModBlocks.DOLOMITE_BRICK_WALL.get());
                        output.accept(ModBlocks.DOLOMITE_POLISHED_WALL.get());
                        output.accept(ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get());
                        output.accept(ModBlocks.DOLOMITE_COBBLESTONE_WALL.get());
                        output.accept(ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get());
                        output.accept(ModBlocks.DOLOMITE_WALL.get());
                        output.accept(ModBlocks.DOLOMITE_LAYERED_WALL.get());

                        output.accept(ModBlocks.WEATHERED_LIMESTONE.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_PILLAR.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_LAYERED_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_WALL.get());
                        output.accept(ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get());

                        output.accept(ModBlocks.GABBRO.get());
                        output.accept(ModBlocks.GABBRO_PILLAR.get());
                        output.accept(ModBlocks.GABBRO_CHISELED_BRICKS.get());
                        output.accept(ModBlocks.GABBRO_LAYERED_BLOCK.get());
                        output.accept(ModBlocks.GABBRO_BRICKS.get());
                        output.accept(ModBlocks.GABBRO_COBBLESTONE.get());
                        output.accept(ModBlocks.GABBRO_PAVED_BRICKS.get());
                        output.accept(ModBlocks.GABBRO_PAVED_BRICK_SLAB.get());
                        output.accept(ModBlocks.GABBRO_POLISHED_BLOCK.get());
                        output.accept(ModBlocks.GABBRO_FANCY_BRICKS.get());
                        output.accept(ModBlocks.GABBRO_BRICK_SLAB.get());
                        output.accept(ModBlocks.GABBRO_POLISHED_SLAB.get());
                        output.accept(ModBlocks.GABBRO_SLAB.get());
                        output.accept(ModBlocks.GABBRO_FANCY_BRICK_SLAB.get());
                        output.accept(ModBlocks.GABBRO_COBBLESTONE_SLAB.get());
                        output.accept(ModBlocks.GABBRO_LAYERED_SLAB.get());
                        output.accept(ModBlocks.GABBRO_COBBLESTONE_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_LAYERED_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_BRICK_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_POLISHED_STAIRS.get());
                        output.accept(ModBlocks.GABBRO_BRICK_WALL.get());
                        output.accept(ModBlocks.GABBRO_POLISHED_WALL.get());
                        output.accept(ModBlocks.GABBRO_PAVED_BRICK_WALL.get());
                        output.accept(ModBlocks.GABBRO_COBBLESTONE_WALL.get());
                        output.accept(ModBlocks.GABBRO_FANCY_BRICK_WALL.get());
                        output.accept(ModBlocks.GABBRO_WALL.get());
                        output.accept(ModBlocks.GABBRO_LAYERED_WALL.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
