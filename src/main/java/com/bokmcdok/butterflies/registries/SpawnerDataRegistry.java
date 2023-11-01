package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.world.entity.ambient.Butterfly;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class SpawnerDataRegistry {
	public static final MobSpawnSettings.SpawnerData ADMIRAL = butterflySpawns(EntityTypeRegistry.BUTTERFLY_ADMIRAL);
	public static final MobSpawnSettings.SpawnerData BUCKEYE = butterflySpawns(EntityTypeRegistry.BUTTERFLY_BUCKEYE);
	public static final MobSpawnSettings.SpawnerData CABBAGE = butterflySpawns(EntityTypeRegistry.BUTTERFLY_CABBAGE);
	public static final MobSpawnSettings.SpawnerData CHALKHILL = butterflySpawns(EntityTypeRegistry.BUTTERFLY_CHALKHILL);
	public static final MobSpawnSettings.SpawnerData CLIPPER = butterflySpawns(EntityTypeRegistry.BUTTERFLY_CLIPPER);
	public static final MobSpawnSettings.SpawnerData COMMON = butterflySpawns(EntityTypeRegistry.BUTTERFLY_COMMON);
	public static final MobSpawnSettings.SpawnerData EMPEROR = butterflySpawns(EntityTypeRegistry.BUTTERFLY_EMPEROR);
	public static final MobSpawnSettings.SpawnerData FORESTER = butterflySpawns(EntityTypeRegistry.BUTTERFLY_FORESTER);
	public static final MobSpawnSettings.SpawnerData GLASSWING = butterflySpawns(EntityTypeRegistry.BUTTERFLY_GLASSWING);
	public static final MobSpawnSettings.SpawnerData HAIRSTREAK = butterflySpawns(EntityTypeRegistry.BUTTERFLY_HAIRSTREAK);
	public static final MobSpawnSettings.SpawnerData HEATH = butterflySpawns(EntityTypeRegistry.BUTTERFLY_HEATH);
	public static final MobSpawnSettings.SpawnerData LONGWING = butterflySpawns(EntityTypeRegistry.BUTTERFLY_LONGWING);
	public static final MobSpawnSettings.SpawnerData MONARCH = butterflySpawns(EntityTypeRegistry.BUTTERFLY_MONARCH);
	public static final MobSpawnSettings.SpawnerData MORPHO = butterflySpawns(EntityTypeRegistry.BUTTERFLY_MORPHO);
	public static final MobSpawnSettings.SpawnerData RAINBOW = butterflySpawns(EntityTypeRegistry.BUTTERFLY_RAINBOW);
	public static final MobSpawnSettings.SpawnerData SWALLOWTAIL = butterflySpawns(EntityTypeRegistry.BUTTERFLY_SWALLOWTAIL);

	private static MobSpawnSettings.SpawnerData butterflySpawns(EntityType<Butterfly> type) {
		return new MobSpawnSettings.SpawnerData(type, 10, 3, 5);
	}
}
