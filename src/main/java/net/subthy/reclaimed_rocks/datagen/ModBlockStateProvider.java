package net.subthy.reclaimed_rocks.datagen;

import net.minecraft.resources.ResourceLocation;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ReclaimedRocksMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // DOLOMITE
        blockWithItem(ModBlocks.DOLOMITE);
        blockWithItem(ModBlocks.DOLOMITE_BRICKS);
        blockWithItem(ModBlocks.DOLOMITE_COBBLESTONE);
        blockWithItem(ModBlocks.DOLOMITE_POLISHED_BLOCK);
        blockWithItem(ModBlocks.DOLOMITE_FANCY_BRICKS);
        blockWithItem(ModBlocks.DOLOMITE_LAYERED_BLOCK);
        // WEATHERED_LIMESTONE
        blockWithItem(ModBlocks.WEATHERED_LIMESTONE);
        blockWithItem(ModBlocks.WEATHERED_LIMESTONE_BRICKS);
        blockWithItem(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE);
        blockWithItem(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK);
        blockWithItem(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS);
        blockWithItem(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK);
        // GABBRO
        blockWithItem(ModBlocks.GABBRO);
        blockWithItem(ModBlocks.GABBRO_BRICKS);
        blockWithItem(ModBlocks.GABBRO_COBBLESTONE);
        blockWithItem(ModBlocks.GABBRO_POLISHED_BLOCK);
        blockWithItem(ModBlocks.GABBRO_FANCY_BRICKS);
        blockWithItem(ModBlocks.GABBRO_LAYERED_BLOCK);
        // Block with side texture,top and bottom
            // DOLOMITE
        simpleBlockWithItem(ModBlocks.DOLOMITE_PAVED_BRICKS.get(), models().orientableWithBottom(ModBlocks.DOLOMITE_PAVED_BRICKS.getId().getPath(),
                modLoc("block/dolomite_paved_bricks"),
                modLoc("block/dolomite_paved_bricks"),
                ResourceLocation.parse("reclaimed_rocks:block/dolomite_paved_bricks_top"),
                modLoc("block/dolomite_paved_bricks_top")));

        simpleBlockWithItem(ModBlocks.DOLOMITE_PILLAR.get(), models().orientableWithBottom(ModBlocks.DOLOMITE_PILLAR.getId().getPath(),
                modLoc("block/dolomite_pillar"),
                modLoc("block/dolomite_pillar"),
                ResourceLocation.parse("reclaimed_rocks:block/dolomite_pillar_top"),
                modLoc("block/dolomite_pillar_top")));

        simpleBlockWithItem(ModBlocks.DOLOMITE_CHISELED_BRICKS.get(), models().orientableWithBottom(ModBlocks.DOLOMITE_CHISELED_BRICKS.getId().getPath(),
                modLoc("block/dolomite_chiseled_bricks"),
                modLoc("block/dolomite_chiseled_bricks"),
                ResourceLocation.parse("reclaimed_rocks:block/dolomite_chiseled_bricks_top"),
                modLoc("block/dolomite_chiseled_bricks_top")));
            // WEATHERED_LIMESTONE
        simpleBlockWithItem(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get(), models().orientableWithBottom(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.getId().getPath(),
                modLoc("block/weathered_limestone_paved_bricks"),
                modLoc("block/weathered_limestone_paved_bricks"),
                ResourceLocation.parse("reclaimed_rocks:block/weathered_limestone_paved_bricks_top"),
                modLoc("block/weathered_limestone_paved_bricks_top")));

        simpleBlockWithItem(ModBlocks.WEATHERED_LIMESTONE_PILLAR.get(), models().orientableWithBottom(ModBlocks.WEATHERED_LIMESTONE_PILLAR.getId().getPath(),
                modLoc("block/weathered_limestone_pillar"),
                modLoc("block/weathered_limestone_pillar"),
                ResourceLocation.parse("reclaimed_rocks:block/weathered_limestone_pillar_top"),
                modLoc("block/weathered_limestone_pillar_top")));

        simpleBlockWithItem(ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.get(), models().orientableWithBottom(ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.getId().getPath(),
                modLoc("block/weathered_limestone_chiseled_bricks"),
                modLoc("block/weathered_limestone_chiseled_bricks"),
                ResourceLocation.parse("reclaimed_rocks:block/weathered_limestone_chiseled_bricks_top"),
                modLoc("block/weathered_limestone_chiseled_bricks_top")));
            // GABBRO
        simpleBlockWithItem(ModBlocks.GABBRO_PAVED_BRICKS.get(), models().orientableWithBottom(ModBlocks.GABBRO_PAVED_BRICKS.getId().getPath(),
                modLoc("block/gabbro_paved_bricks"),
                modLoc("block/gabbro_paved_bricks"),
                ResourceLocation.parse("reclaimed_rocks:block/gabbro_paved_bricks_top"),
                modLoc("block/gabbro_paved_bricks_top")));

        simpleBlockWithItem(ModBlocks.GABBRO_PILLAR.get(), models().orientableWithBottom(ModBlocks.GABBRO_PILLAR.getId().getPath(),
                modLoc("block/gabbro_pillar"),
                modLoc("block/gabbro_pillar"),
                ResourceLocation.parse("reclaimed_rocks:block/gabbro_pillar_top"),
                modLoc("block/gabbro_pillar_top")));

        simpleBlockWithItem(ModBlocks.GABBRO_CHISELED_BRICKS.get(), models().orientableWithBottom(ModBlocks.GABBRO_CHISELED_BRICKS.getId().getPath(),
                modLoc("block/gabbro_chiseled_bricks"),
                modLoc("block/gabbro_chiseled_bricks"),
                ResourceLocation.parse("reclaimed_rocks:block/gabbro_chiseled_bricks_top"),
                modLoc("block/gabbro_chiseled_bricks_top")));
        // Slab
            // Dolomite
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_SLAB.get()), blockTexture(ModBlocks.DOLOMITE.get()), blockTexture(ModBlocks.DOLOMITE.get()));
        blockItem(ModBlocks.DOLOMITE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_PAVED_BRICK_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_PAVED_BRICKS.get()), blockTexture(ModBlocks.DOLOMITE_PAVED_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_PAVED_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_POLISHED_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_POLISHED_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()));
        blockItem(ModBlocks.DOLOMITE_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_BRICK_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_LAYERED_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_LAYERED_BLOCK.get()), blockTexture(ModBlocks.DOLOMITE_LAYERED_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_LAYERED_SLAB);
            // Limestone
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get()), blockTexture(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB);
            // GABBRO
        slabBlock(((SlabBlock) ModBlocks.GABBRO_SLAB.get()), blockTexture(ModBlocks.GABBRO.get()), blockTexture(ModBlocks.GABBRO.get()));
        blockItem(ModBlocks.GABBRO_SLAB);
        slabBlock(((SlabBlock) ModBlocks.GABBRO_PAVED_BRICK_SLAB.get()), blockTexture(ModBlocks.GABBRO_PAVED_BRICKS.get()), blockTexture(ModBlocks.GABBRO_PAVED_BRICKS.get()));
        blockItem(ModBlocks.GABBRO_PAVED_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.GABBRO_POLISHED_SLAB.get()), blockTexture(ModBlocks.GABBRO_POLISHED_BLOCK.get()), blockTexture(ModBlocks.GABBRO_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.GABBRO_POLISHED_SLAB);
        slabBlock(((SlabBlock) ModBlocks.GABBRO_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.GABBRO_COBBLESTONE.get()), blockTexture(ModBlocks.GABBRO_COBBLESTONE.get()));
        blockItem(ModBlocks.GABBRO_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.GABBRO_BRICK_SLAB.get()), blockTexture(ModBlocks.GABBRO_BRICKS.get()), blockTexture(ModBlocks.GABBRO_BRICKS.get()));
        blockItem(ModBlocks.GABBRO_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.GABBRO_FANCY_BRICK_SLAB.get()), blockTexture(ModBlocks.GABBRO_FANCY_BRICKS.get()), blockTexture(ModBlocks.GABBRO_FANCY_BRICKS.get()));
        blockItem(ModBlocks.GABBRO_FANCY_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.GABBRO_LAYERED_SLAB.get()), blockTexture(ModBlocks.GABBRO_LAYERED_BLOCK.get()), blockTexture(ModBlocks.GABBRO_LAYERED_BLOCK.get()));
        blockItem(ModBlocks.GABBRO_LAYERED_SLAB);

        // Stairs
            // Dolomite
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE.get()));
        blockItem(ModBlocks.DOLOMITE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_LAYERED_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_LAYERED_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_LAYERED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_POLISHED_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_POLISHED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()));
        blockItem(ModBlocks.DOLOMITE_COBBLESTONE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_PAVED_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS);
            // Limestone
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_LAYERED_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_LAYERED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS);
            // GABBRO
        stairsBlock((StairBlock) ModBlocks.GABBRO_STAIRS.get(), blockTexture(ModBlocks.GABBRO.get()));
        blockItem(ModBlocks.GABBRO_STAIRS);
        stairsBlock((StairBlock) ModBlocks.GABBRO_LAYERED_STAIRS.get(), blockTexture(ModBlocks.GABBRO_LAYERED_BLOCK.get()));
        blockItem(ModBlocks.GABBRO_LAYERED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.GABBRO_POLISHED_STAIRS.get(), blockTexture(ModBlocks.GABBRO_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.GABBRO_POLISHED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.GABBRO_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.GABBRO_COBBLESTONE.get()));
        blockItem(ModBlocks.GABBRO_COBBLESTONE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.GABBRO_BRICK_STAIRS.get(), blockTexture(ModBlocks.GABBRO_BRICKS.get()));
        blockItem(ModBlocks.GABBRO_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get(), blockTexture(ModBlocks.GABBRO_FANCY_BRICKS.get()));
        blockItem(ModBlocks.GABBRO_FANCY_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get(), blockTexture(ModBlocks.GABBRO_PAVED_BRICKS.get()));
        blockItem(ModBlocks.GABBRO_PAVED_BRICK_STAIRS);
        // Walls
            // Dolomite
        wallBlock((WallBlock) ModBlocks.DOLOMITE_BRICK_WALL.get(), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.DOLOMITE_WALL.get(), blockTexture(ModBlocks.DOLOMITE.get()));
        wallBlock((WallBlock) ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get(), blockTexture(ModBlocks.DOLOMITE_PAVED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.DOLOMITE_POLISHED_WALL.get(), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.DOLOMITE_LAYERED_WALL.get(), blockTexture(ModBlocks.DOLOMITE_LAYERED_BLOCK.get()));
            // Limestone
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get(), blockTexture(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get()));
            // GABBRO
        wallBlock((WallBlock) ModBlocks.GABBRO_BRICK_WALL.get(), blockTexture(ModBlocks.GABBRO_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GABBRO_WALL.get(), blockTexture(ModBlocks.GABBRO.get()));
        wallBlock((WallBlock) ModBlocks.GABBRO_PAVED_BRICK_WALL.get(), blockTexture(ModBlocks.GABBRO_PAVED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GABBRO_POLISHED_WALL.get(), blockTexture(ModBlocks.GABBRO_POLISHED_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.GABBRO_FANCY_BRICK_WALL.get(), blockTexture(ModBlocks.GABBRO_FANCY_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GABBRO_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.GABBRO_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.GABBRO_LAYERED_WALL.get(), blockTexture(ModBlocks.GABBRO_LAYERED_BLOCK.get()));
    }

    private void blockItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("reclaimed_rocks:block/" + BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
