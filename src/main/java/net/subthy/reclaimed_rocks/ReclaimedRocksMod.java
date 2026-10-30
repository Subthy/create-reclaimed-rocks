package net.subthy.reclaimed_rocks;

import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.subthy.reclaimed_rocks.config.ReclaimedRocksCommonConfigs;
import net.subthy.reclaimed_rocks.item.ModCreativeModeTabs;
import net.subthy.reclaimed_rocks.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ReclaimedRocksMod.MOD_ID)
public class ReclaimedRocksMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "reclaimed_rocks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ReclaimedRocksMod(IEventBus modEventBus, ModContainer modContainer) {
        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        // STARTUP configs are loaded as soon as they are registered, so the vein sizes are
        // available to the worldgen bootstrap during data generation.
        modContainer.registerConfig(ModConfig.Type.STARTUP,ReclaimedRocksCommonConfigs.SPEC, "Reclaimed_Rocks-common.toml");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
