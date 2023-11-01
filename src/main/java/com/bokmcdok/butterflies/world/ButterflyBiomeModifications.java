package com.bokmcdok.butterflies.world;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.registries.SpawnerDataRegistry;
import com.bokmcdok.butterflies.registries.TagKeyRegistry;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class ButterflyBiomeModifications {
	private static final BiomeModification BIOME_MODIFICATION = BiomeModifications.create(ButterfliesMod.id("biome_modification"));

	private static BiomeModification addSpawnToTag(MobSpawnSettings.SpawnerData spawner, TagKey<Biome> tag) {
		return BIOME_MODIFICATION.add(
			ModificationPhase.ADDITIONS,
			selectionCtx -> selectionCtx.hasTag(tag),
			modificationCtx -> modificationCtx.getSpawnSettings().addSpawn(MobCategory.CREATURE, spawner)
		);
	}

	// TODO: enum with Butterfly IDs, SpawnerData, TagKeys, ...
	public static void register() {
		addSpawnToTag(SpawnerDataRegistry.ADMIRAL, TagKeyRegistry.SpawnBiomes.ADMIRAL);
		addSpawnToTag(SpawnerDataRegistry.BUCKEYE, TagKeyRegistry.SpawnBiomes.BUCKEYE);
		addSpawnToTag(SpawnerDataRegistry.CABBAGE, TagKeyRegistry.SpawnBiomes.CABBAGE);
		addSpawnToTag(SpawnerDataRegistry.CHALKHILL, TagKeyRegistry.SpawnBiomes.CHALKHILL);
		addSpawnToTag(SpawnerDataRegistry.CLIPPER, TagKeyRegistry.SpawnBiomes.CLIPPER);
		addSpawnToTag(SpawnerDataRegistry.COMMON, TagKeyRegistry.SpawnBiomes.COMMON);
		addSpawnToTag(SpawnerDataRegistry.EMPEROR, TagKeyRegistry.SpawnBiomes.EMPEROR);
		addSpawnToTag(SpawnerDataRegistry.FORESTER, TagKeyRegistry.SpawnBiomes.FORESTER);
		addSpawnToTag(SpawnerDataRegistry.GLASSWING, TagKeyRegistry.SpawnBiomes.GLASSWING);
		addSpawnToTag(SpawnerDataRegistry.HAIRSTREAK, TagKeyRegistry.SpawnBiomes.HAIRSTREAK);
		addSpawnToTag(SpawnerDataRegistry.HEATH, TagKeyRegistry.SpawnBiomes.HEATH);
		addSpawnToTag(SpawnerDataRegistry.LONGWING, TagKeyRegistry.SpawnBiomes.LONGWING);
		addSpawnToTag(SpawnerDataRegistry.MONARCH, TagKeyRegistry.SpawnBiomes.MONARCH);
		addSpawnToTag(SpawnerDataRegistry.MORPHO, TagKeyRegistry.SpawnBiomes.MORPHO);
		addSpawnToTag(SpawnerDataRegistry.RAINBOW, TagKeyRegistry.SpawnBiomes.RAINBOW);
		addSpawnToTag(SpawnerDataRegistry.SWALLOWTAIL, TagKeyRegistry.SpawnBiomes.SWALLOWTAIL);
	}
}
