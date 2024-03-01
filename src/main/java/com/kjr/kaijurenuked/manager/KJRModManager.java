package com.kjr.kaijurenuked.manager;

import net.minecraftforge.eventbus.api.IEventBus;

public final class KJRModManager {

    public static void registerAll(IEventBus modBus, IEventBus forgeBus) {
        KJRConfigManager.registerConfigs();
        KJREventManager.registerEvents(modBus, forgeBus);
        KJRRegistryManager.registerRegistries(modBus);
    }
}
