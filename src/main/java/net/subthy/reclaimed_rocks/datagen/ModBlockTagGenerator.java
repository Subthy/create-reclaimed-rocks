package net.subthy.reclaimed_rocks.datagen;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.subthy.reclaimed_rocks.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ReclaimedRocksMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DOLOMITE.get(),
                        ModBlocks.DOLOMITE_BRICKS.get(),
                        ModBlocks.DOLOMITE_SLAB.get(),
                        ModBlocks.DOLOMITE_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE.get(),
                        ModBlocks.DOLOMITE_POLISHED_BLOCK.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICKS.get(),
                        ModBlocks.DOLOMITE_POLISHED_SLAB.get(),
                        ModBlocks.DOLOMITE_PILLAR.get(),
                        ModBlocks.DOLOMITE_POLISHED_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get(),
                        ModBlocks.DOLOMITE_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_CHISELED_BRICKS.get(),
                        ModBlocks.DOLOMITE_LAYERED_BLOCK.get(),
                        ModBlocks.DOLOMITE_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_WALL.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_POLISHED_WALL.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_LAYERED_SLAB.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICKS.get(),

                        ModBlocks.WEATHERED_LIMESTONE.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICKS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_PILLAR.get(),
                        ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get(),
                        ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get(),
                        ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get(),

                        ModBlocks.GABBRO.get(),
                        ModBlocks.GABBRO_COBBLESTONE.get(),
                        ModBlocks.GABBRO_BRICKS.get(),
                        ModBlocks.GABBRO_PILLAR.get(),
                        ModBlocks.GABBRO_CHISELED_BRICKS.get(),
                        ModBlocks.GABBRO_LAYERED_BLOCK.get(),
                        ModBlocks.GABBRO_POLISHED_BLOCK.get(),
                        ModBlocks.GABBRO_PAVED_BRICKS.get(),
                        ModBlocks.GABBRO_SLAB.get(),
                        ModBlocks.GABBRO_BRICK_SLAB.get(),
                        ModBlocks.GABBRO_POLISHED_SLAB.get(),
                        ModBlocks.GABBRO_COBBLESTONE_SLAB.get(),
                        ModBlocks.GABBRO_BRICK_STAIRS.get(),
                        ModBlocks.GABBRO_COBBLESTONE_STAIRS.get(),
                        ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.GABBRO_STAIRS.get(),
                        ModBlocks.GABBRO_COBBLESTONE_WALL.get(),
                        ModBlocks.GABBRO_BRICK_WALL.get(),
                        ModBlocks.GABBRO_POLISHED_WALL.get(),
                        ModBlocks.GABBRO_FANCY_BRICK_WALL.get(),
                        ModBlocks.GABBRO_PAVED_BRICK_WALL.get(),
                        ModBlocks.GABBRO_WALL.get(),
                        ModBlocks.GABBRO_LAYERED_SLAB.get(),
                        ModBlocks.GABBRO_FANCY_BRICK_SLAB.get(),
                        ModBlocks.GABBRO_FANCY_BRICKS.get()


                        );
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.DOLOMITE_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_POLISHED_WALL.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_WALL.get(),
                        ModBlocks.DOLOMITE_LAYERED_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get(),
                        ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get(),
                        ModBlocks.GABBRO_COBBLESTONE_WALL.get(),
                        ModBlocks.GABBRO_FANCY_BRICK_WALL.get(),
                        ModBlocks.GABBRO_POLISHED_WALL.get(),
                        ModBlocks.GABBRO_PAVED_BRICK_WALL.get(),
                        ModBlocks.GABBRO_WALL.get(),
                        ModBlocks.GABBRO_BRICK_WALL.get(),
                        ModBlocks.GABBRO_LAYERED_WALL.get()
                );

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.DOLOMITE_STAIRS.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_LAYERED_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_POLISHED_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_LAYERED_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS.get(),
                        ModBlocks.GABBRO_BRICK_STAIRS.get(),
                        ModBlocks.GABBRO_LAYERED_STAIRS.get(),
                        ModBlocks.GABBRO_COBBLESTONE_STAIRS.get(),
                        ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.GABBRO_POLISHED_STAIRS.get(),
                        ModBlocks.GABBRO_STAIRS.get()
        );

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.DOLOMITE_SLAB.get(),
                        ModBlocks.DOLOMITE_LAYERED_SLAB.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_POLISHED_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get(),
                        ModBlocks.WEATHERED_LIMESTONE_SLAB.get(),
                        ModBlocks.GABBRO_LAYERED_SLAB.get(),
                        ModBlocks.GABBRO_BRICK_SLAB.get(),
                        ModBlocks.GABBRO_COBBLESTONE_SLAB.get(),
                        ModBlocks.GABBRO_FANCY_BRICK_SLAB.get(),
                        ModBlocks.GABBRO_POLISHED_SLAB.get(),
                        ModBlocks.GABBRO_SLAB.get()
    );
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}