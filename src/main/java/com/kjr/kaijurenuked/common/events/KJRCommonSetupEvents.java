package com.kjr.kaijurenuked.common.events;

import com.kjr.kaijurenuked.datagen.provider.KJRLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KJRCommonSetupEvents {

    public static class ModSetupEvents {

        @SubscribeEvent
        public static void onGatherDataEvent(GatherDataEvent event) {
            DataGenerator datagen = event.getGenerator();
            PackOutput datagenPackOutput = datagen.getPackOutput();
            final ExistingFileHelper curFileHelper = event.getExistingFileHelper();

            datagen.addProvider(event.includeClient(), new KJRLanguageProvider(datagenPackOutput));
        }
    }

    public static class ForgeSetupEvents {

    }
}
