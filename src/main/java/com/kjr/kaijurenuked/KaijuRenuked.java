package com.kjr.kaijurenuked;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(KaijuRenuked.MODID)
public class KaijuRenuked {
    public static final String MODID = "kaijurenuked";
    public static final Logger LOGGER = LogUtils.getLogger();

    public KaijuRenuked() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
    }
}
