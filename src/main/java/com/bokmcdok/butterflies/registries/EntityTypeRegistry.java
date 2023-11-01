package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.world.entity.ambient.Butterfly;
import com.bokmcdok.butterflies.world.entity.ambient.Caterpillar;
import com.bokmcdok.butterflies.world.entity.ambient.Chrysalis;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.level.levelgen.Heightmap;

/**
 * This class registers all the entities we use with Forge's Entity Type Registry
 */
public class EntityTypeRegistry {
	// Register the butterflies.
    public static final EntityType<Butterfly> BUTTERFLY_MORPHO = registerButterfly(Butterfly.MORPHO_NAME, Butterfly::createMorphoButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_FORESTER = registerButterfly(Butterfly.FORESTER_NAME, Butterfly::createForesterButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_COMMON = registerButterfly(Butterfly.COMMON_NAME, Butterfly::createCommonButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_EMPEROR = registerButterfly(Butterfly.EMPEROR_NAME, Butterfly::createEmperorButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_HAIRSTREAK = registerButterfly(Butterfly.HAIRSTREAK_NAME, Butterfly::createHairstreakButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_RAINBOW = registerButterfly(Butterfly.RAINBOW_NAME, Butterfly::createRainbowButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_HEATH = registerButterfly(Butterfly.HEATH_NAME, Butterfly::createHeathButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_GLASSWING = registerButterfly(Butterfly.GLASSWING_NAME, Butterfly::createGlasswingButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_CHALKHILL = registerButterfly(Butterfly.CHALKHILL_NAME, Butterfly::createChalkhillButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_SWALLOWTAIL = registerButterfly(Butterfly.SWALLOWTAIL_NAME, Butterfly::createSwallowtailButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_MONARCH = registerButterfly(Butterfly.MONARCH_NAME, Butterfly::createMonarchButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_CABBAGE = registerButterfly(Butterfly.CABBAGE_NAME, Butterfly::createCabbageButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_ADMIRAL = registerButterfly(Butterfly.ADMIRAL_NAME, Butterfly::createAdmiralButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_LONGWING = registerButterfly(Butterfly.LONGWING_NAME, Butterfly::createLongwingButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_CLIPPER = registerButterfly(Butterfly.CLIPPER_NAME, Butterfly::createClipperButterfly);
    public static final EntityType<Butterfly> BUTTERFLY_BUCKEYE = registerButterfly(Butterfly.BUCKEYE_NAME, Butterfly::createBuckeyeButterfly);

    // Register the caterpillars.
    public static final EntityType<Caterpillar> CATERPILLAR_MORPHO = registerCaterpillar(Caterpillar.MORPHO_NAME, Caterpillar::createMorphoCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_FORESTER = registerCaterpillar(Caterpillar.FORESTER_NAME, Caterpillar::createForesterCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_COMMON = registerCaterpillar(Caterpillar.COMMON_NAME, Caterpillar::createCommonCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_EMPEROR = registerCaterpillar(Caterpillar.EMPEROR_NAME, Caterpillar::createEmperorCaterpillar);
	public static final EntityType<Caterpillar> CATERPILLAR_HAIRSTREAK =registerCaterpillarHairstreak(Caterpillar.HAIRSTREAK_NAME, Caterpillar::createHairstreakCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_RAINBOW = registerCaterpillar(Caterpillar.RAINBOW_NAME, Caterpillar::createRainbowCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_HEATH = registerCaterpillar(Caterpillar.HEATH_NAME, Caterpillar::createHeathCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_GLASSWING = registerCaterpillar(Caterpillar.GLASSWING_NAME, Caterpillar::createGlasswingCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_CHALKHILL = registerCaterpillar(Caterpillar.CHALKHILL_NAME, Caterpillar::createChalkhillCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_SWALLOWTAIL = registerCaterpillar(Caterpillar.SWALLOWTAIL_NAME, Caterpillar::createSwallowtailCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_MONARCH = registerCaterpillar(Caterpillar.MONARCH_NAME, Caterpillar::createMonarchCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_CABBAGE = registerCaterpillar(Caterpillar.CABBAGE_NAME, Caterpillar::createCabbageCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_ADMIRAL = registerCaterpillar(Caterpillar.ADMIRAL_NAME, Caterpillar::createAdmiralCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_LONGWING = registerCaterpillar(Caterpillar.LONGWING_NAME, Caterpillar::createLongwingCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_CLIPPER = registerCaterpillar(Caterpillar.CLIPPER_NAME, Caterpillar::createClipperCaterpillar);
    public static final EntityType<Caterpillar> CATERPILLAR_BUCKEYE = registerCaterpillar(Caterpillar.BUCKEYE_NAME, Caterpillar::createBuckeyeCaterpillar);

    // Register the chrysalises.
    public static final EntityType<Chrysalis> CHRYSALIS_MORPHO = registerChrysalis(Chrysalis.MORPHO_NAME, Chrysalis::createMorpho);
    public static final EntityType<Chrysalis> CHRYSALIS_FORESTER = registerChrysalis(Chrysalis.FORESTER_NAME, Chrysalis::createForester);
    public static final EntityType<Chrysalis> CHRYSALIS_COMMON = registerChrysalis(Chrysalis.COMMON_NAME, Chrysalis::createCommon);
    public static final EntityType<Chrysalis> CHRYSALIS_EMPEROR = registerChrysalis(Chrysalis.EMPEROR_NAME, Chrysalis::createEmperor);
    public static final EntityType<Chrysalis> CHRYSALIS_HAIRSTREAK = registerChrysalis(Chrysalis.HAIRSTREAK_NAME, Chrysalis::createHairstreak);
    public static final EntityType<Chrysalis> CHRYSALIS_RAINBOW = registerChrysalis(Chrysalis.RAINBOW_NAME, Chrysalis::createRainbow);
    public static final EntityType<Chrysalis> CHRYSALIS_HEATH = registerChrysalis(Chrysalis.HEATH_NAME, Chrysalis::createHeath);
    public static final EntityType<Chrysalis> CHRYSALIS_GLASSWING = registerChrysalis(Chrysalis.GLASSWING_NAME, Chrysalis::createGlasswing);
    public static final EntityType<Chrysalis> CHRYSALIS_CHALKHILL = registerChrysalis(Chrysalis.CHALKHILL_NAME, Chrysalis::createChalkhill);
    public static final EntityType<Chrysalis> CHRYSALIS_SWALLOWTAIL = registerChrysalis(Chrysalis.SWALLOWTAIL_NAME, Chrysalis::createSwallowtail);
    public static final EntityType<Chrysalis> CHRYSALIS_MONARCH = registerChrysalis(Chrysalis.MONARCH_NAME, Chrysalis::createMonarch);
    public static final EntityType<Chrysalis> CHRYSALIS_CABBAGE = registerChrysalis(Chrysalis.CABBAGE_NAME, Chrysalis::createCabbage);
    public static final EntityType<Chrysalis> CHRYSALIS_ADMIRAL = registerChrysalis(Chrysalis.ADMIRAL_NAME, Chrysalis::createAdmiral);
    public static final EntityType<Chrysalis> CHRYSALIS_LONGWING = registerChrysalis(Chrysalis.LONGWING_NAME, Chrysalis::createLongwing);
    public static final EntityType<Chrysalis> CHRYSALIS_CLIPPER = registerChrysalis(Chrysalis.CLIPPER_NAME, Chrysalis::createClipper);
    public static final EntityType<Chrysalis> CHRYSALIS_BUCKEYE = registerChrysalis(Chrysalis.BUCKEYE_NAME, Chrysalis::createBuckeye);

	private static EntityType<Butterfly> registerButterfly(String path, EntityType.EntityFactory<Butterfly> factory) {
		return register(
			path,
			FabricEntityTypeBuilder.createMob()
				.spawnGroup(MobCategory.CREATURE)
				.entityFactory(factory)
				.dimensions(new EntityDimensions(0.3f, 0.4f, true))
				.defaultAttributes(Butterfly::createAttributes)
				.spawnRestriction(SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Butterfly::checkButterflySpawnRules)
				.build()
		);
	}

	private static EntityType<Caterpillar> registerCaterpillar(String path, EntityType.EntityFactory<Caterpillar> factory) {
		return register(
			path,
			FabricEntityTypeBuilder.createMob()
				.spawnGroup(MobCategory.CREATURE)
				.entityFactory(factory)
				.dimensions(new EntityDimensions(0.1f, 0.1f, true))
				.defaultAttributes(Caterpillar::createAttributes)
				.spawnRestriction(SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, AmbientCreature::checkMobSpawnRules)
				.build()
		);
	}

	private static EntityType<Caterpillar> registerCaterpillarHairstreak(String path, EntityType.EntityFactory<Caterpillar> factory) {
		return register(
			path,
			FabricEntityTypeBuilder.createMob()
				.spawnGroup(MobCategory.AMBIENT)
				.entityFactory(factory)
				.dimensions(new EntityDimensions(0.1f, 0.1f, true))
				.defaultAttributes(Caterpillar::createAttributes)
				.spawnRestriction(SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, AmbientCreature::checkMobSpawnRules)
				.build()
		);
	}

	private static EntityType<Chrysalis> registerChrysalis(String path, EntityType.EntityFactory<Chrysalis> factory) {
		return register(
			path,
			FabricEntityTypeBuilder.createMob()
				.spawnGroup(MobCategory.AMBIENT)
				.entityFactory(factory)
				.dimensions(new EntityDimensions(0.1f, 0.1f, true))
				.defaultAttributes(Chrysalis::createAttributes)
				.spawnRestriction(SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, AmbientCreature::checkMobSpawnRules)
				.build()
		);
	}

	private static <T extends Entity> EntityType<T> register(String path, EntityType<T> type) {
		Registry.register(BuiltInRegistries.ENTITY_TYPE, ButterfliesMod.id(path), type);
		return type;
	}

    public static void init() {}
}
