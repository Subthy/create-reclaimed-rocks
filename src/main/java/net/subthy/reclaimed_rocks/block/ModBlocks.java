package net.subthy.reclaimed_rocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ReclaimedRocksMod.MOD_ID);

    // Blocks
        // Dolomite
    public static final DeferredBlock<Block> DOLOMITE = registerBlock("dolomite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_LAYERED_BLOCK = registerBlock("dolomite_layered_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_POLISHED_BLOCK = registerBlock("dolomite_polished_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_BRICKS = registerBlock("dolomite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> DOLOMITE_PAVED_BRICKS = registerBlock("dolomite_paved_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> DOLOMITE_PILLAR = registerBlock("dolomite_pillar",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> DOLOMITE_FANCY_BRICKS = registerBlock("dolomite_fancy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> DOLOMITE_COBBLESTONE = registerBlock("dolomite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)));
    public static final DeferredBlock<Block> DOLOMITE_CHISELED_BRICKS = registerBlock("dolomite_chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
        // WEATHERED_LIMESTONE
        public static final DeferredBlock<Block> WEATHERED_LIMESTONE = registerBlock("weathered_limestone",
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_COBBLESTONE = registerBlock("weathered_limestone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_POLISHED_BLOCK = registerBlock("weathered_limestone_polished_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_BRICKS = registerBlock("weathered_limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_FANCY_BRICKS = registerBlock("weathered_limestone_fancy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_PILLAR = registerBlock("weathered_limestone_pillar",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_PAVED_BRICKS = registerBlock("weathered_limestone_paved_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_LAYERED_BLOCK = registerBlock("weathered_limestone_layered_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_CHISELED_BRICKS = registerBlock("weathered_limestone_chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
        // Gabbro
        public static final DeferredBlock<Block> GABBRO = registerBlock("gabbro",
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_COBBLESTONE = registerBlock("gabbro_cobblestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_POLISHED_BLOCK = registerBlock("gabbro_polished_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_BRICKS = registerBlock("gabbro_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_FANCY_BRICKS = registerBlock("gabbro_fancy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_PILLAR = registerBlock("gabbro_pillar",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_PAVED_BRICKS = registerBlock("gabbro_paved_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_LAYERED_BLOCK = registerBlock("gabbro_layered_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> GABBRO_CHISELED_BRICKS = registerBlock("gabbro_chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));



    // Slabs
        // Dolomite
    public static final DeferredBlock<Block> DOLOMITE_SLAB = registerBlock("dolomite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DOLOMITE_PAVED_BRICK_SLAB = registerBlock("dolomite_paved_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_COBBLESTONE_SLAB = registerBlock("dolomite_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_POLISHED_SLAB = registerBlock("dolomite_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_BRICK_SLAB = registerBlock("dolomite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_FANCY_BRICK_SLAB = registerBlock("dolomite_fancy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_LAYERED_SLAB = registerBlock("dolomite_layered_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
        //WEATHERED_LIMESTONE
        public static final DeferredBlock<Block> WEATHERED_LIMESTONE_SLAB = registerBlock("weathered_limestone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_PAVED_BRICK_SLAB = registerBlock("weathered_limestone_paved_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_COBBLESTONE_SLAB = registerBlock("weathered_limestone_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_POLISHED_SLAB = registerBlock("weathered_limestone_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_BRICK_SLAB = registerBlock("weathered_limestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_FANCY_BRICK_SLAB = registerBlock("weathered_limestone_fancy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_LAYERED_SLAB = registerBlock("weathered_limestone_layered_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
        // GABBRO
        public static final DeferredBlock<Block> GABBRO_SLAB = registerBlock("gabbro_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_PAVED_BRICK_SLAB = registerBlock("gabbro_paved_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_COBBLESTONE_SLAB = registerBlock("gabbro_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_POLISHED_SLAB = registerBlock("gabbro_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_BRICK_SLAB = registerBlock("gabbro_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_FANCY_BRICK_SLAB = registerBlock("gabbro_fancy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_LAYERED_SLAB = registerBlock("gabbro_layered_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));

    // Stairs
        // DOLOMITE
    public static final DeferredBlock<Block> DOLOMITE_STAIRS = registerBlock("dolomite_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DOLOMITE_LAYERED_STAIRS = registerBlock("dolomite_layered_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_BRICK_STAIRS = registerBlock("dolomite_brick_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_FANCY_BRICK_STAIRS = registerBlock("dolomite_fancy_brick_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_PAVED_BRICK_STAIRS = registerBlock("dolomite_paved_brick_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_COBBLESTONE_STAIRS = registerBlock("dolomite_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOLOMITE_POLISHED_STAIRS = registerBlock("dolomite_polished_stairs",
            () -> new StairBlock(ModBlocks.DOLOMITE_POLISHED_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
        // WEATHERED_LIMESTONE
        public static final DeferredBlock<Block> WEATHERED_LIMESTONE_STAIRS = registerBlock("weathered_limestone_stairs",
                () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE.get().defaultBlockState(),
                        BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_LAYERED_STAIRS = registerBlock("weathered_limestone_layered_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_BRICK_STAIRS = registerBlock("weathered_limestone_brick_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS = registerBlock("weathered_limestone_fancy_brick_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS = registerBlock("weathered_limestone_paved_brick_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_COBBLESTONE_STAIRS = registerBlock("weathered_limestone_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_POLISHED_STAIRS = registerBlock("weathered_limestone_polished_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    // GABBRO
    public static final DeferredBlock<Block> GABBRO_STAIRS = registerBlock("gabbro_stairs",
            () -> new StairBlock(ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_LAYERED_STAIRS = registerBlock("gabbro_layered_stairs",
            () -> new StairBlock(ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_BRICK_STAIRS = registerBlock("gabbro_brick_stairs",
            () -> new StairBlock(ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_FANCY_BRICK_STAIRS = registerBlock("gabbro_fancy_brick_stairs",
            () -> new StairBlock(ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_PAVED_BRICK_STAIRS = registerBlock("gabbro_paved_brick_stairs",
            () -> new StairBlock(ModBlocks.GABBRO.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_COBBLESTONE_STAIRS = registerBlock("gabbro_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GABBRO_POLISHED_STAIRS = registerBlock("gabbro_polished_stairs",
            () -> new StairBlock(ModBlocks.GABBRO_POLISHED_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));

    // Walls
        // DOLOMITE
    public static final DeferredBlock<Block> DOLOMITE_BRICK_WALL = registerBlock("dolomite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> DOLOMITE_LAYERED_WALL = registerBlock("dolomite_layered_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> DOLOMITE_WALL = registerBlock("dolomite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> DOLOMITE_COBBLESTONE_WALL = registerBlock("dolomite_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> DOLOMITE_POLISHED_WALL = registerBlock("dolomite_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> DOLOMITE_FANCY_BRICK_WALL = registerBlock("dolomite_fancy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> DOLOMITE_PAVED_BRICK_WALL = registerBlock("dolomite_paved_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
        // WEATHERED_LIMESTONE
        public static final DeferredBlock<Block> WEATHERED_LIMESTONE_BRICK_WALL = registerBlock("weathered_limestone_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_LAYERED_WALL = registerBlock("weathered_limestone_layered_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_COBBLESTONE_WALL = registerBlock("weathered_limestone_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_POLISHED_WALL = registerBlock("weathered_limestone_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_FANCY_BRICK_WALL = registerBlock("weathered_limestone_fancy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_PAVED_BRICK_WALL = registerBlock("weathered_limestone_paved_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> WEATHERED_LIMESTONE_WALL = registerBlock("weathered_limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    // GABBRO
    public static final DeferredBlock<Block> GABBRO_BRICK_WALL = registerBlock("gabbro_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> GABBRO_LAYERED_WALL = registerBlock("gabbro_layered_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> GABBRO_COBBLESTONE_WALL = registerBlock("gabbro_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> GABBRO_POLISHED_WALL = registerBlock("gabbro_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> GABBRO_FANCY_BRICK_WALL = registerBlock("gabbro_fancy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> GABBRO_PAVED_BRICK_WALL = registerBlock("gabbro_paved_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final DeferredBlock<Block> GABBRO_WALL = registerBlock("gabbro_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
