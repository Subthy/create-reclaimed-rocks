package net.subthy.reclaimed_rocks.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    // Lists
    private static final List<ItemLike> DOLOMITE_SMELTABLES = List.of(ModBlocks.DOLOMITE_COBBLESTONE.get());
    private static final List<ItemLike> WEATHERED_LIMESTONE_SMELTABLES = List.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get());
    private static final List<ItemLike> GOBBRO_SMELTABLES = List.of(ModBlocks.GABBRO_COBBLESTONE.get());

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pWriter) {
        // Shapped Recipess
            // Dolomite Stairs stair
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_LAYERED_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_LAYERED_BLOCK.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_LAYERED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_layered_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_COBBLESTONE.get())
                .unlockedBy("has_dolomite_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_cobblestone_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite_fancy_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_fancy_brick_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_PAVED_BRICKS.get())
                .unlockedBy("has_dolomite_paved_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_PAVED_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_paved_brick_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_dolomite_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_brick_stairs");

            //Gabbro stair
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO.get())
                .unlockedBy("has_gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_LAYERED_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_LAYERED_BLOCK.get())
                .unlockedBy("has_gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_LAYERED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_layered_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_COBBLESTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_COBBLESTONE.get())
                .unlockedBy("has_gabbro_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_cobblestone_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_FANCY_BRICKS.get())
                .unlockedBy("has_gabbro_fancy_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_fancy_brick_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_PAVED_BRICKS.get())
                .unlockedBy("has_gabbro_paved_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_PAVED_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_paved_brick_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_BRICKS.get())
                .unlockedBy("has_gabbro_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_brick_stairs");

            // Weathered Limestone stair
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE.get())
                .unlockedBy("has_weathered_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_LAYERED_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get())
                .unlockedBy("has_weathered_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_layered_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get())
                .unlockedBy("has_weathered_limestone_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_cobblestone_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get())
                .unlockedBy("has_weathered_limestone_fancy_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_fancy_brick_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get())
                .unlockedBy("has_weathered_limestone_paved_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_paved_brick_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_BRICKS.get())
                .unlockedBy("has_weathered_limestone_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_brick_stairs");

        // Dolomite Stairs slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.DOLOMITE.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_LAYERED_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.DOLOMITE_LAYERED_BLOCK.get())
                .unlockedBy("has_Dolomite_layered", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_LAYERED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_layered_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.DOLOMITE_COBBLESTONE.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_cobblestone_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_PAVED_BRICK_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_Dolomite_fancy_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_fancy_brick_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_BRICK_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_Dolomite_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_bricks_slab");

        // GABBRO Stairs slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.GABBRO.get())
                .unlockedBy("has_gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_LAYERED_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.GABBRO_LAYERED_BLOCK.get())
                .unlockedBy("has_Gabbro_layered", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_LAYERED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_layered_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_COBBLESTONE_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.GABBRO_COBBLESTONE.get())
                .unlockedBy("has_gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_cobblestone_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_PAVED_BRICKS.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.GABBRO_FANCY_BRICKS.get())
                .unlockedBy("has_gabbro_fancy_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_fancy_brick_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_BRICK_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.GABBRO_BRICKS.get())
                .unlockedBy("has_gabbro_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_bricks_slab");

        // WEATHERED_LIMESTONE Stairs slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE.get())
                .unlockedBy("has_weathered_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get())
                .unlockedBy("has_weathered_limestone_layered", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_layered_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get())
                .unlockedBy("has_weathered_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_cobblestone_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get())
                .unlockedBy("has_weathered_limestone_fancy_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_fancy_brick_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get(),2)
                .pattern("AA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_BRICKS.get())
                .unlockedBy("has_weathered_limestone_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_bricks_slab");

        // Dolomite Walls

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_COBBLESTONE.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_cobblestone_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_LAYERED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_LAYERED_BLOCK.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_LAYERED_WALL.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_layered_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_fancy_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_PAVED_BRICKS.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_PAVED_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_paved_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_POLISHED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_Dolomite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_dolomite_polished_wall");

        // Weathered Limestone Walls

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_cobblestone_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_layered_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_fancy_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_BRICKS.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_paved_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get())
                .unlockedBy("has_Weathered_Limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_weathered_limestone_polished_wall");

        // Gabbro Walls

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_COBBLESTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_COBBLESTONE.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_COBBLESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_cobblestone_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_LAYERED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_LAYERED_BLOCK.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_LAYERED_WALL.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_layered_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_FANCY_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_FANCY_BRICKS.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_FANCY_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_fancy_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_BRICKS.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_PAVED_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_PAVED_BRICKS.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_PAVED_BRICKS.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_paved_brick_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_POLISHED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GABBRO_POLISHED_BLOCK.get())
                .unlockedBy("has_Gabbro", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GABBRO_POLISHED_BLOCK.get()).build()))
                .save(pWriter, "reclaimed_rocks:craftingtable_gabbro_polished_wall");


        // Smelting Recipes
        oreSmelting(pWriter, DOLOMITE_SMELTABLES, RecipeCategory.MISC, ModBlocks.DOLOMITE.get(), 0.25f, 200, "dolomite");
        oreSmelting(pWriter, WEATHERED_LIMESTONE_SMELTABLES, RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE.get(), 0.25f, 200, "weathered_limestone");
        oreSmelting(pWriter, GOBBRO_SMELTABLES, RecipeCategory.MISC, ModBlocks.GABBRO.get(), 0.25f, 200, "gabbro");

        // Stonecutting Recipes
            // Dolomite
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_LAYERED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PILLAR.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_CHISELED_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICK_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_LAYERED_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_LAYERED_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_LAYERED_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter, "reclaimed_rocks:stonecutter_dolomite_layered_slab");

        // LIMESTONE

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PILLAR.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter, "reclaimed_rocks:stonecutter_weathered_limestone_layered_slab");

        // GABBRO

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_LAYERED_BLOCK.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICK_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_BLOCK.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PILLAR.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_CHISELED_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICK_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICK_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_LAYERED_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GABBRO_COBBLESTONE_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICK_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GABBRO_COBBLESTONE_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICK_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICK_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICK_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GABBRO_COBBLESTONE_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_LAYERED_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_LAYERED_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter, "reclaimed_rocks:stonecutter_gabbro_layered_slab");
    }






    protected static void oreSmelting(RecipeOutput pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pFinishedRecipeConsumer, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> pFactory,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer, pFactory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, ReclaimedRocksMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
