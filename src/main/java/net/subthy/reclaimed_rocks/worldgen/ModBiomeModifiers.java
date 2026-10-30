package net.subthy.reclaimed_rocks.worldgen;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> Add_Dolomite = registerKey("add_dolomite");
    public static final ResourceKey<BiomeModifier> Add_Weathered_Limestone = registerKey("add_weathered_limestone");
    public static final ResourceKey<BiomeModifier> Add_Gabbro = registerKey("add_gabbro");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(Add_Dolomite, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Dolomite_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(Add_Weathered_Limestone, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Weathered_Limestone_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(Add_Gabbro, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Gabbro_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


    }
    private static ResourceKey<BiomeModifier> registerKey (String name){
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(ReclaimedRocksMod.MOD_ID, name));
    }
}
