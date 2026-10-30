package net.subthy.reclaimed_rocks.datagen.loot;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.subthy.reclaimed_rocks.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        add(ModBlocks.DOLOMITE.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, ModBlocks.DOLOMITE_COBBLESTONE.get()));
        add(ModBlocks.WEATHERED_LIMESTONE.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()));
        add(ModBlocks.GABBRO.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, ModBlocks.GABBRO_COBBLESTONE.get()));
        //DOLOMITE
        this.dropSelf(ModBlocks.DOLOMITE_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.DOLOMITE_POLISHED_BLOCK.get());
        this.dropSelf(ModBlocks.DOLOMITE_PAVED_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_FANCY_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_PILLAR.get());
        this.dropSelf(ModBlocks.DOLOMITE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_LAYERED_BLOCK.get());
        // WEATHERED_LIMESTONE
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_PILLAR.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.get());
        // GABBRO
        this.dropSelf(ModBlocks.GABBRO_BRICKS.get());
        this.dropSelf(ModBlocks.GABBRO_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GABBRO_LAYERED_BLOCK.get());
        this.dropSelf(ModBlocks.GABBRO_POLISHED_BLOCK.get());
        this.dropSelf(ModBlocks.GABBRO_PAVED_BRICKS.get());
        this.dropSelf(ModBlocks.GABBRO_FANCY_BRICKS.get());
        this.dropSelf(ModBlocks.GABBRO_PILLAR.get());
        this.dropSelf(ModBlocks.GABBRO_CHISELED_BRICKS.get());
        // Slab
        //Dolomite
        this.add(ModBlocks.DOLOMITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_PAVED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_PAVED_BRICK_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_POLISHED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_POLISHED_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_BRICK_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_LAYERED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_LAYERED_SLAB.get()));
        // Limestone
        this.add(ModBlocks.WEATHERED_LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_SLAB.get()));
        this.add(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_SLAB.get()));
        this.add(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get()));
        this.add(ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get()));
        this.add(ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get()));
        // GABBRO
        this.add(ModBlocks.GABBRO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_SLAB.get()));
        this.add(ModBlocks.GABBRO_PAVED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_PAVED_BRICK_SLAB.get()));
        this.add(ModBlocks.GABBRO_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.GABBRO_POLISHED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_POLISHED_SLAB.get()));
        this.add(ModBlocks.GABBRO_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_BRICK_SLAB.get()));
        this.add(ModBlocks.GABBRO_FANCY_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_FANCY_BRICK_SLAB.get()));
        this.add(ModBlocks.GABBRO_LAYERED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GABBRO_LAYERED_SLAB.get()));
        //Stair
        // Dolomite
        this.dropSelf(ModBlocks.DOLOMITE_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_POLISHED_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_LAYERED_STAIRS.get());
        // Limestone
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_LAYERED_STAIRS.get());
        // GABBRO
        this.dropSelf(ModBlocks.GABBRO_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_POLISHED_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_LAYERED_STAIRS.get());

        // Wall
        // Dolomite
        this.dropSelf(ModBlocks.DOLOMITE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_WALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_POLISHED_WALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.DOLOMITE_LAYERED_WALL.get());
        // Limestone
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get());
        // GABBRO
        this.dropSelf(ModBlocks.GABBRO_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_POLISHED_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_PAVED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_FANCY_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.GABBRO_LAYERED_WALL.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
