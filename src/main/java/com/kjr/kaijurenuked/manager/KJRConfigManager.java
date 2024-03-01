package com.kjr.kaijurenuked.manager;

import com.kjr.kaijurenuked.KaijuRenuked;
import com.kjr.kaijurenuked.config.client.KJRClientConfig;
import com.kjr.kaijurenuked.config.common.KJRCommonConfig;
import com.kjr.kaijurenuked.util.FileUtil;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.commons.lang3.tuple.Pair;

public final class KJRConfigManager {
    public static final ForgeConfigSpec MAIN_CLIENT_SPEC;
    public static final KJRClientConfig MAIN_CLIENT;

    public static final ForgeConfigSpec MAIN_COMMON_SPEC;
    public static final KJRCommonConfig MAIN_COMMON;

    static {
        final Pair<KJRClientConfig, ForgeConfigSpec> clientSpecPair = new ForgeConfigSpec.Builder().configure(KJRClientConfig::new);
        final Pair<KJRCommonConfig, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(KJRCommonConfig::new);

        MAIN_CLIENT_SPEC = clientSpecPair.getRight();
        MAIN_CLIENT = clientSpecPair.getLeft();

        MAIN_COMMON_SPEC = commonSpecPair.getRight();
        MAIN_COMMON = commonSpecPair.getLeft();
    }

    protected static void registerConfigs() {
        registerConfigFolder();

        registerClientConfig();
        registerCommonConfig();
        registerServerConfig();
    }

    private static void registerClientConfig() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MAIN_CLIENT_SPEC, KaijuRenuked.MODID + "/kaijurenuked-client.toml");
    }

    private static void registerCommonConfig() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MAIN_COMMON_SPEC, KaijuRenuked.MODID + "/kaijurenuked-common.toml");
    }

    private static void registerServerConfig() {
 //     ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, MAIN_SERVER_SPEC);
    }

    private static void registerConfigFolder() {
        FileUtil.getOrCreateDirectory(FMLPaths.CONFIGDIR.get().resolve(KaijuRenuked.MODID), KaijuRenuked.MODID);
    }
}
