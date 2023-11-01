package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.ButterfliesMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class TagKeyRegistry {
	public static class SpawnBiomes {
		public static final TagKey<Biome> ADMIRAL = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/admiral"));
		public static final TagKey<Biome> BUCKEYE = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/buckeye"));
		public static final TagKey<Biome> CABBAGE = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/cabbage"));
		public static final TagKey<Biome> CHALKHILL = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/chalkhill"));
		public static final TagKey<Biome> CLIPPER = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/clipper"));
		public static final TagKey<Biome> COMMON = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/common"));
		public static final TagKey<Biome> EMPEROR = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/emperor"));
		public static final TagKey<Biome> FORESTER = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/forester"));
		public static final TagKey<Biome> GLASSWING = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/glasswing"));
		public static final TagKey<Biome> HAIRSTREAK = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/hairstreak"));
		public static final TagKey<Biome> HEATH = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/heath"));
		public static final TagKey<Biome> LONGWING = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/longwing"));
		public static final TagKey<Biome> MONARCH = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/monarch"));
		public static final TagKey<Biome> MORPHO = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/morpho"));
		public static final TagKey<Biome> RAINBOW = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/rainbow"));
		public static final TagKey<Biome> SWALLOWTAIL = TagKey.create(Registries.BIOME, ButterfliesMod.id("spawns_butterfly/swallowtail"));
	}
}
