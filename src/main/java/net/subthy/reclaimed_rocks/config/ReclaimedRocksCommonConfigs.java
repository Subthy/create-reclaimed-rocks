package net.subthy.reclaimed_rocks.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ReclaimedRocksCommonConfigs {  public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.ConfigValue<Integer> DOLOMITE_SIZE;
    public static final ModConfigSpec.ConfigValue<Integer> WEATHERED_LIMESTONE_SIZE;
    public static final ModConfigSpec.ConfigValue<Integer> GABBRO_SIZE;



    static {
        BUILDER.push("Configs for Reclaimed Rocks Mod");

        DOLOMITE_SIZE = BUILDER.comment("Size of Dolomite vein")
                .defineInRange("Dolomite Vein Size", 40, 0, 200);

        WEATHERED_LIMESTONE_SIZE = BUILDER.comment("Size of Weathered Limestone vein")
                .defineInRange("Weathered Limestone Vein Size", 40, 0, 200);

        GABBRO_SIZE = BUILDER.comment("Size of Gabbro vein")
                .defineInRange("Gobbro Vein Size", 40, 0, 200);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }


}
