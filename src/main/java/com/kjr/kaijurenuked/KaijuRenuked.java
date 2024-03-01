package com.kjr.kaijurenuked;

import com.kjr.kaijurenuked.manager.KJRModManager;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.annotation.Nullable;
import java.util.Locale;

@Mod(KaijuRenuked.MODID)
public class KaijuRenuked {
    public static final String MOD_NAME = "Kaiju Re-Nuked";
    public static final String MODID = "kaijurenuked";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static KaijuRenuked INSTANCE;

    public KaijuRenuked() {
        INSTANCE = this;

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        if (modBus != null && forgeBus != null) KJRModManager.registerAll(modBus, forgeBus);
    }

    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(MODID, path.toLowerCase(Locale.ROOT));
    }

    @Nullable
    public static KaijuRenuked getInstance() {
        return INSTANCE;
    }

    public static boolean isLoaded() {
        return INSTANCE != null;
    }
}
