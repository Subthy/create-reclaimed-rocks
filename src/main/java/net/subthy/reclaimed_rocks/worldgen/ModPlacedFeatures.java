package net.subthy.reclaimed_rocks.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> Dolomite_Placed_Key = registerKey("dolomite_placed");
    public static final ResourceKey<PlacedFeature> Weathered_Limestone_Placed_Key = registerKey("weathered_limestone_placed");
    public static final ResourceKey<PlacedFeature> Gabbro_Placed_Key = registerKey("gabbro_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeature = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, Dolomite_Placed_Key, configuredFeature.getOrThrow(ModConfiguredFeatures.Dolomite_Key),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100))));

        register(context, Weathered_Limestone_Placed_Key, configuredFeature.getOrThrow(ModConfiguredFeatures.Weathered_Limestone_Key),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100))));

        register(context, Gabbro_Placed_Key, configuredFeature.getOrThrow(ModConfiguredFeatures.Gabbro_Key),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ReclaimedRocksMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
