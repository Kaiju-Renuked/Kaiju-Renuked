package com.kjr.kaijurenuked.manager;

import com.kjr.kaijurenuked.common.registries.KJRBlocks;
import com.kjr.kaijurenuked.common.registries.KJRCreativeModeTabs;
import com.kjr.kaijurenuked.common.registries.KJRItems;
import com.kjr.kaijurenuked.common.registries.KJRTags;
import net.minecraftforge.eventbus.api.IEventBus;

public final class KJRRegistryManager {

    static void registerRegistries(IEventBus modBus) {
        KJRTags.initialize();

        KJRCreativeModeTabs.CREATIVE_MODE_TABS.register(modBus);
        KJRBlocks.ITEM_BLOCKS.register(modBus);
        KJRBlocks.BLOCKS.register(modBus);
        KJRItems.ITEMS.register(modBus);
    }
}
