package com.bokmcdok.butterflies.world.entity.ambient;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class Chrysalis extends DirectionalCreature {

    // The unique IDs that are used to reference a chrysalis entity.
    public static final String MORPHO_NAME = "morpho_chrysalis";
    public static final String FORESTER_NAME = "forester_chrysalis";
    public static final String COMMON_NAME = "common_chrysalis";
    public static final String EMPEROR_NAME = "emperor_chrysalis";
    public static final String HAIRSTREAK_NAME = "hairstreak_chrysalis";
    public static final String RAINBOW_NAME = "rainbow_chrysalis";
    public static final String HEATH_NAME = "heath_chrysalis";
    public static final String GLASSWING_NAME = "glasswing_chrysalis";
    public static final String CHALKHILL_NAME = "chalkhill_chrysalis";
    public static final String SWALLOWTAIL_NAME = "swallowtail_chrysalis";
    public static final String MONARCH_NAME = "monarch_chrysalis";
    public static final String CABBAGE_NAME = "cabbage_chrysalis";
    public static final String ADMIRAL_NAME = "admiral_chrysalis";
    public static final String LONGWING_NAME = "longwing_chrysalis";
    public static final String BUCKEYE_NAME = "buckeye_chrysalis";
    public static final String CLIPPER_NAME = "clipper_chrysalis";

    /**
     * Create a Admiral chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createAdmiral(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_admiral.png", entityType, level);
    }

    /**
     * Create a Buckeye chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createBuckeye(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_buckeye.png", entityType, level);
    }

    /**
     * Create a Cabbage chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createCabbage(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_cabbage.png", entityType, level);
    }

    /**
     * Create a Chalkhill chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createChalkhill(EntityType<? extends Chrysalis> entityType,
                                            Level level) {
        return new Chrysalis("chrysalis_chalkhill.png", entityType, level);
    }

    /**
     * Create a Clipper chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createClipper(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_clipper.png", entityType, level);
    }

    /**
     * Create a Common chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createCommon(EntityType<? extends Chrysalis> entityType,
                                         Level level) {
        return new Chrysalis("chrysalis_common.png", entityType, level);
    }

    /**
     * Create an Emperor chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createEmperor(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_emperor.png", entityType, level);
    }

    /**
     * Create a Forester chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createForester(EntityType<? extends Chrysalis> entityType,
                                           Level level) {
        return new Chrysalis("chrysalis_forester.png", entityType, level);
    }

    /**
     * Create a Glasswing chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createGlasswing(EntityType<? extends Chrysalis> entityType,
                                            Level level) {
        return new Chrysalis("chrysalis_glasswing.png", entityType, level);
    }

    /**
     * Create a Hairstreak chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createHairstreak(EntityType<? extends Chrysalis> entityType,
                                             Level level) {
        return new Chrysalis("chrysalis_hairstreak.png", entityType, level);
    }

    /**
     * Create a Heath chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createHeath(EntityType<? extends Chrysalis> entityType,
                                        Level level) {
        return new Chrysalis("chrysalis_heath.png", entityType, level);
    }

    /**
     * Create a Longwing chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createLongwing(EntityType<? extends Chrysalis> entityType,
                                           Level level) {
        return new Chrysalis("chrysalis_longwing.png", entityType, level);
    }

    /**
     * Create a Monarch chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createMonarch(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_monarch.png", entityType, level);
    }

    /**
     * Create a Morpho chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createMorpho(EntityType<? extends Chrysalis> entityType,
                                         Level level) {
        return new Chrysalis("chrysalis_morpho.png", entityType, level);
    }

    /**
     * Create a Rainbow chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createRainbow(EntityType<? extends Chrysalis> entityType,
                                          Level level) {
        return new Chrysalis("chrysalis_rainbow.png", entityType, level);
    }

    /**
     * Create a Swallowtail chrysalis.
     *
     * @param entityType The type of the entity.
     * @param level      The current level.
     * @return A newly constructed entity.
     */
    @NotNull
    public static Chrysalis createSwallowtail(EntityType<? extends Chrysalis> entityType,
                                              Level level) {
        return new Chrysalis("chrysalis_swallowtail.png", entityType, level);
    }

    /**
     * Spawns a chrysalis into the world.
     * @param level The level to spawn the chrysalis.
     * @param entityId The Entity ID of the chrysalis to spawn.
     * @param spawnBlock The block to spawn the chrysalis on.
     * @param surfaceDirection The direction the chrysalis is facing.
     * @param position The position of the chrysalis.
     * @param yRotation The y-rotation of the chrysalis.
     */
    public static void spawn(ServerLevel level,
                             String entityId,
                             BlockPos spawnBlock,
                             Direction surfaceDirection,
                             Vec3 position,
                             float yRotation) {

        ResourceLocation key = ResourceLocation.tryParse(entityId + "_chrysalis");

		EntityType<?> entityType = BuiltInRegistries.ENTITY_TYPE.get(key);
        if (entityType != null) {
            Entity entity = entityType.create(level);
            if (entity instanceof Chrysalis chrysalis) {

                chrysalis.moveTo(position.x, position.y, position.z, 0.0F, 0.0F);
                chrysalis.setYRot(yRotation);
                chrysalis.setSurfaceDirection(surfaceDirection);
                chrysalis.setSurfaceBlock(spawnBlock);

                chrysalis.finalizeSpawn(level,
                        level.getCurrentDifficultyAt(spawnBlock),
                        MobSpawnType.NATURAL,
                        null,
                        null);

                level.addFreshEntity(chrysalis);
            }
        }
    }

    /**
     * Overrides how an entity handles triggers such as tripwires and pressure
     * plates. Chrysalises aren't heavy enough to trigger either.
     *
     * @return Always TRUE, so caterpillars ignore block triggers.
     */
    @Override
    public boolean isIgnoringBlockTriggers() {
        return true;
    }

    /**
     * Chrysalises ignore gravity.
     */
    @Override
    public boolean isNoGravity() {
        return true;
    }

    /**
     * Override this to control if an entity can be pushed or not. Chrysalises
     * can't be pushed by other entities.
     *
     * @return Always FALSE.
     */
    @Override
    public boolean isPushable() {
        return false;
    }

    /**
     * Construction
     *
     * @param texture    The texture used to render the entity.
     * @param entityType The type of the entity.
     * @param level      The current level.
     */
    protected Chrysalis(String texture,
                        EntityType<? extends Chrysalis> entityType,
                        Level level) {
        super("textures/entity/chrysalis/" + texture, entityType, level);
    }

    /**
     * A custom step for the AI update loop.
     */
    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();

        // If the surface block is destroyed then the chrysalis dies.
        if (this.level().isEmptyBlock(getSurfaceBlock())) {
            kill();
        }

        // Spawn Butterfly.
        if (this.getAge() > 24000 && this.random.nextInt(0, 15) == 0) {
            String encodeId = this.getEncodeId();
            if (encodeId != null) {
                String[] splitEncodeId = encodeId.split("_");
                Butterfly.spawn(this.level(), splitEncodeId[0], this.blockPosition(), false);
                this.remove(RemovalReason.DISCARDED);
            }
        }
    }

    /**
     * Override to change how pushing other entities affects them. Chrysalises
     * don't push other entities.
     * @param otherEntity The other entity pushing/being pushed.
     */
    @Override
    protected void doPush(@NotNull Entity otherEntity) {
        // No-op
    }

    /**
     * Override to control what kind of movement events the entity will emit.
     * Chrysalises will not emit sounds.
     * @return Movement events only.
     */
    @NotNull
    @Override
    protected MovementEmission getMovementEmission() {
        return MovementEmission.NONE;
    }

    /**
     * Reduce the size of the caterpillar - they are small!
     * @return The new size of the caterpillar.
     */
    @Override
    public float getScale() {
        return 0.1f;
    }

    /**
     * Override to control an entity's relative volume. Chrysalises are silent.
     * @return Always zero, so caterpillars are silent.
     */
    @Override
    protected float getSoundVolume() {
        return 0.0f;
    }

    /**
     * Override to set the entity's eye height.
     * @param pose The current pose of the entity.
     * @param dimensions The dimensions of the entity.
     * @return The height of the entity's eyes.
     */
    @Override
    protected float getStandingEyeHeight(@NotNull Pose pose,
                                         EntityDimensions dimensions) {
        return dimensions.height / 2.0f;
    }

    /**
     * Override to change how pushing other entities affects them. Chrysalises
     * don't push other entities.
     */
    @Override
    protected void pushEntities() {
        // No-op
    }
}
