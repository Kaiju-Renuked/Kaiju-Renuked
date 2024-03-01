package com.kjr.kaijurenuked.common.registries;

import com.kjr.kaijurenuked.KaijuRenuked;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.levelgen.structure.Structure;

public class KJRTags {
    public static class EntityTypeTags {

        private static TagKey<EntityType<?>> createEntityTag(String tagName) {
            return TagKey.create(Registries.ENTITY_TYPE, KaijuRenuked.prefix(tagName));
        }
    }

    public static class BlockTags {

        private static TagKey<Block> createBlockTag(String tagName) {
            return TagKey.create(Registries.BLOCK, KaijuRenuked.prefix(tagName));
        }
    }

    public static class EffectTags {

        private static TagKey<MobEffect> createMobEffectTag(String tagName) {
            return TagKey.create(Registries.MOB_EFFECT, KaijuRenuked.prefix(tagName));
        }
    }

    public static class ItemTags {

        private static TagKey<Item> createItemTag(String tagName) {
            return TagKey.create(Registries.ITEM, KaijuRenuked.prefix(tagName));
        }
    }

    public static class BiomeTags {

        private static TagKey<Biome> createBiomeTag(String tagName) {
            return TagKey.create(Registries.BIOME, KaijuRenuked.prefix(tagName));
        }
    }

    public static class StructureTags {

        private static TagKey<Structure> createBiomeTag(String tagName) {
            return TagKey.create(Registries.STRUCTURE, KaijuRenuked.prefix(tagName));
        }
    }

    public static class BannerPatternTags {

        private static TagKey<BannerPattern> tag(String tagName) {
            return TagKey.create(Registries.BANNER_PATTERN, KaijuRenuked.prefix(tagName));
        }
    }

    public static void initialize() {};
}
