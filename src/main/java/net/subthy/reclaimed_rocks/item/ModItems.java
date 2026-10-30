package net.subthy.reclaimed_rocks.item;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;



public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ReclaimedRocksMod.MOD_ID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
