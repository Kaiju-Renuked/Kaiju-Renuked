package com.kjr.kaijurenuked.manager;

import com.kjr.kaijurenuked.client.events.KJRClientMiscEvents;
import com.kjr.kaijurenuked.client.events.KJRClientSetupEvents;
import com.kjr.kaijurenuked.common.events.KJRCommonMiscEvents;
import com.kjr.kaijurenuked.common.events.KJRCommonSetupEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.loading.FMLEnvironment;

public final class KJREventManager {

    static void registerEvents(IEventBus modBus, IEventBus forgeBus) {
        registerClientEvents(modBus, forgeBus);
        registerCommonEvents(modBus, forgeBus);
        registerServerEvents(modBus, forgeBus);
    }

    private static void registerClientEvents(IEventBus modBus, IEventBus forgeBus) {
        if (FMLEnvironment.dist.isClient()) {
            modBus.register(KJRClientSetupEvents.class);

            forgeBus.register(KJRClientMiscEvents.class);
        }
    }

    private static void registerCommonEvents(IEventBus modBus, IEventBus forgeBus) {
        modBus.register(KJRCommonSetupEvents.ModSetupEvents.class);
        modBus.addListener(KJRNetworkManager::registerPackets);

        forgeBus.register(KJRCommonSetupEvents.ForgeSetupEvents.class);
        forgeBus.register(KJRCommonMiscEvents.class);
    }

    private static void registerServerEvents(IEventBus modBus, IEventBus forgeBus) {
        if (FMLEnvironment.dist.isDedicatedServer()) {

        }
    }
}
