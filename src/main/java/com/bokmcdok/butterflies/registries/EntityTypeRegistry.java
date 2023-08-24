package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.model.ButterflyModel;
import com.bokmcdok.butterflies.model.CaterpillarModel;
import com.bokmcdok.butterflies.renderer.entity.ButterflyRenderer;
import com.bokmcdok.butterflies.renderer.entity.CaterpillarRenderer;
import com.bokmcdok.butterflies.world.entity.ambient.Butterfly;
import com.bokmcdok.butterflies.world.entity.ambient.Caterpillar;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


/**
 * This class registers all the entities we use with Forge's Entity Type Registry
 */
@Mod.EventBusSubscriber(modid = ButterfliesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityTypeRegistry {

    // An instance of a deferred registry we use to register our entity types.
    public static final DeferredRegister<EntityType<?>> INSTANCE =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ButterfliesMod.MODID);

    // Register the butterflies.
    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_MORPHO =
            INSTANCE.register(Butterfly.MORPHO_NAME, () -> EntityType.Builder.of(Butterfly::createMorphoButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.MORPHO_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_FORESTER =
            INSTANCE.register(Butterfly.FORESTER_NAME, () -> EntityType.Builder.of(Butterfly::createForesterButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.FORESTER_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_COMMON =
            INSTANCE.register(Butterfly.COMMON_NAME, () -> EntityType.Builder.of(Butterfly::createCommonButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.COMMON_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_EMPEROR =
            INSTANCE.register(Butterfly.EMPEROR_NAME, () -> EntityType.Builder.of(Butterfly::createEmperorButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.EMPEROR_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_HAIRSTREAK =
            INSTANCE.register(Butterfly.HAIRSTREAK_NAME, () -> EntityType.Builder.of(Butterfly::createHairstreakButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.HAIRSTREAK_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_RAINBOW =
            INSTANCE.register(Butterfly.RAINBOW_NAME, () -> EntityType.Builder.of(Butterfly::createRainbowButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.RAINBOW_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_HEATH =
            INSTANCE.register(Butterfly.HEATH_NAME, () -> EntityType.Builder.of(Butterfly::createHeathButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.HEATH_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_GLASSWING =
            INSTANCE.register(Butterfly.GLASSWING_NAME, () -> EntityType.Builder.of(Butterfly::createGlasswingButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.GLASSWING_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_CHALKHILL =
            INSTANCE.register(Butterfly.CHALKHILL_NAME, () -> EntityType.Builder.of(Butterfly::createChalkhillButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.CHALKHILL_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_SWALLOWTAIL =
            INSTANCE.register(Butterfly.SWALLOWTAIL_NAME, () -> EntityType.Builder.of(Butterfly::createSwallowtailButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.SWALLOWTAIL_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_MONARCH =
            INSTANCE.register(Butterfly.MONARCH_NAME, () -> EntityType.Builder.of(Butterfly::createMonarchButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.MONARCH_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_CABBAGE =
            INSTANCE.register(Butterfly.CABBAGE_NAME, () -> EntityType.Builder.of(Butterfly::createCabbageButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.CABBAGE_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_ADMIRAL =
            INSTANCE.register(Butterfly.ADMIRAL_NAME, () -> EntityType.Builder.of(Butterfly::createAdmiralButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.ADMIRAL_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_LONGWING =
            INSTANCE.register(Butterfly.LONGWING_NAME, () -> EntityType.Builder.of(Butterfly::createLongwingButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.LONGWING_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_CLIPPER =
            INSTANCE.register(Butterfly.CLIPPER_NAME, () -> EntityType.Builder.of(Butterfly::createClipperButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.CLIPPER_NAME));

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY_BUCKEYE =
            INSTANCE.register(Butterfly.BUCKEYE_NAME, () -> EntityType.Builder.of(Butterfly::createBuckeyeButterfly, MobCategory.AMBIENT)
                    .sized(0.3f, 0.4f)
                    .build(Butterfly.BUCKEYE_NAME));

    // Register the caterpillars.
    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_MORPHO =
            INSTANCE.register(Caterpillar.MORPHO_NAME, () -> EntityType.Builder.of(Caterpillar::createMorphoCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.MORPHO_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_FORESTER =
            INSTANCE.register(Caterpillar.FORESTER_NAME, () -> EntityType.Builder.of(Caterpillar::createForesterCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.FORESTER_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_COMMON =
            INSTANCE.register(Caterpillar.COMMON_NAME, () -> EntityType.Builder.of(Caterpillar::createCommonCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.COMMON_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_EMPEROR =
            INSTANCE.register(Caterpillar.EMPEROR_NAME, () -> EntityType.Builder.of(Caterpillar::createEmperorCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.EMPEROR_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_HAIRSTREAK =
            INSTANCE.register(Caterpillar.HAIRSTREAK_NAME, () -> EntityType.Builder.of(Caterpillar::createHairstreakCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.HAIRSTREAK_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_RAINBOW =
            INSTANCE.register(Caterpillar.RAINBOW_NAME, () -> EntityType.Builder.of(Caterpillar::createRainbowCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.RAINBOW_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_HEATH =
            INSTANCE.register(Caterpillar.HEATH_NAME, () -> EntityType.Builder.of(Caterpillar::createHeathCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.HEATH_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_GLASSWING =
            INSTANCE.register(Caterpillar.GLASSWING_NAME, () -> EntityType.Builder.of(Caterpillar::createGlasswingCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.GLASSWING_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_CHALKHILL =
            INSTANCE.register(Caterpillar.CHALKHILL_NAME, () -> EntityType.Builder.of(Caterpillar::createChalkhillCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.CHALKHILL_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_SWALLOWTAIL =
            INSTANCE.register(Caterpillar.SWALLOWTAIL_NAME, () -> EntityType.Builder.of(Caterpillar::createSwallowtailCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.SWALLOWTAIL_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_MONARCH =
            INSTANCE.register(Caterpillar.MONARCH_NAME, () -> EntityType.Builder.of(Caterpillar::createMonarchCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.MONARCH_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_CABBAGE =
            INSTANCE.register(Caterpillar.CABBAGE_NAME, () -> EntityType.Builder.of(Caterpillar::createCabbageCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.CABBAGE_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_ADMIRAL =
            INSTANCE.register(Caterpillar.ADMIRAL_NAME, () -> EntityType.Builder.of(Caterpillar::createAdmiralCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.ADMIRAL_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_LONGWING =
            INSTANCE.register(Caterpillar.LONGWING_NAME, () -> EntityType.Builder.of(Caterpillar::createLongwingCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.LONGWING_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_CLIPPER =
            INSTANCE.register(Caterpillar.CLIPPER_NAME, () -> EntityType.Builder.of(Caterpillar::createClipperCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.CLIPPER_NAME));

    public static final RegistryObject<EntityType<Caterpillar>> CATERPILLAR_BUCKEYE =
            INSTANCE.register(Caterpillar.BUCKEYE_NAME, () -> EntityType.Builder.of(Caterpillar::createBuckeyeCaterpillar, MobCategory.AMBIENT)
                    .sized(0.1f, 0.1f)
                    .build(Caterpillar.BUCKEYE_NAME));

    /**
     * Register the renderers for our entities
     * @param event The event information
     */
    @SubscribeEvent
    public static void registerEntityRenders(final EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(BUTTERFLY_MORPHO.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_COMMON.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_FORESTER.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_EMPEROR.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_HAIRSTREAK.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_RAINBOW.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_HEATH.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_GLASSWING.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_CHALKHILL.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_SWALLOWTAIL.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_MONARCH.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_CABBAGE.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_ADMIRAL.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_LONGWING.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_CLIPPER.get(), ButterflyRenderer::new);
        event.registerEntityRenderer(BUTTERFLY_BUCKEYE.get(), ButterflyRenderer::new);

        event.registerEntityRenderer(CATERPILLAR_MORPHO.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_COMMON.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_FORESTER.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_EMPEROR.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_HAIRSTREAK.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_RAINBOW.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_HEATH.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_GLASSWING.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_CHALKHILL.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_SWALLOWTAIL.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_MONARCH.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_CABBAGE.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_ADMIRAL.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_LONGWING.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_CLIPPER.get(), CaterpillarRenderer::new);
        event.registerEntityRenderer(CATERPILLAR_BUCKEYE.get(), CaterpillarRenderer::new);
    }

    /**
     * Register the attributes for living entities
     */
    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(BUTTERFLY_MORPHO.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_COMMON.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_FORESTER.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_EMPEROR.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_HAIRSTREAK.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_RAINBOW.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_HEATH.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_GLASSWING.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_CHALKHILL.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_SWALLOWTAIL.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_MONARCH.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_CABBAGE.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_ADMIRAL.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_LONGWING.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_CLIPPER.get(), Butterfly.createAttributes().build());
        event.put(BUTTERFLY_BUCKEYE.get(), Butterfly.createAttributes().build());

        event.put(CATERPILLAR_MORPHO.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_COMMON.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_FORESTER.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_EMPEROR.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_HAIRSTREAK.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_RAINBOW.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_HEATH.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_GLASSWING.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_CHALKHILL.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_SWALLOWTAIL.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_MONARCH.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_CABBAGE.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_ADMIRAL.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_LONGWING.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_CLIPPER.get(), Caterpillar.createAttributes().build());
        event.put(CATERPILLAR_BUCKEYE.get(), Caterpillar.createAttributes().build());
    }

    /**
     * Register entity spawn placements here
     * @param event The event information
     */
    @SubscribeEvent
    public static void registerEntitySpawnPlacement(SpawnPlacementRegisterEvent event) {
        event.register(BUTTERFLY_MORPHO.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_COMMON.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_FORESTER.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_EMPEROR.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_HAIRSTREAK.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_RAINBOW.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_HEATH.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_GLASSWING.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_CHALKHILL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_SWALLOWTAIL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_MONARCH.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_CABBAGE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_ADMIRAL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_LONGWING.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_CLIPPER.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BUTTERFLY_BUCKEYE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                Butterfly::checkButterflySpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_MORPHO.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_COMMON.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_FORESTER.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_EMPEROR.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_HAIRSTREAK.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_RAINBOW.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_HEATH.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_GLASSWING.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_CHALKHILL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_SWALLOWTAIL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_MONARCH.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_CABBAGE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_ADMIRAL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_LONGWING.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_CLIPPER.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);

        event.register(CATERPILLAR_BUCKEYE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING,
                AmbientCreature::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.AND);
    }

    /**
     * Registers models to be used for rendering
     * @param event The event information
     */
    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ButterflyModel.LAYER_LOCATION, ButterflyModel::createBodyLayer);
        event.registerLayerDefinition(CaterpillarModel.LAYER_LOCATION, CaterpillarModel::createBodyLayer);
    }
}
