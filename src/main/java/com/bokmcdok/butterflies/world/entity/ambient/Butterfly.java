package com.bokmcdok.butterflies.world.entity.ambient;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.world.block.ButterflyLeavesBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The butterfly entity that flies around the world, adding some ambience and
 * fertilising plants.
 */
public class Butterfly extends Animal {

    //  Represents the possible sizes of the butterflies.
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    // The unique IDs that are used to reference a butterfly entity.
    public static final String MORPHO_NAME = "morpho";
    public static final String FORESTER_NAME = "forester";
    public static final String COMMON_NAME = "common";
    public static final String EMPEROR_NAME = "emperor";
    public static final String HAIRSTREAK_NAME = "hairstreak";
    public static final String RAINBOW_NAME = "rainbow";
    public static final String HEATH_NAME = "heath";
    public static final String GLASSWING_NAME = "glasswing";
    public static final String CHALKHILL_NAME = "chalkhill";
    public static final String SWALLOWTAIL_NAME = "swallowtail";
    public static final String MONARCH_NAME = "monarch";
    public static final String CABBAGE_NAME = "cabbage";
    public static final String ADMIRAL_NAME = "admiral";
    public static final String LONGWING_NAME = "longwing";
    public static final String BUCKEYE_NAME = "buckeye";
    public static final String CLIPPER_NAME = "clipper";

    // The number of ticks per flap. Used for event emissions.
    private static final int TICKS_PER_FLAP = Mth.ceil(2.4166098f);

    // Helper constant to modify butterfly speed
    private static final double BUTTERFLY_SPEED = 0.0325d;

    //  The size of the butterfly
    private final Size size;

    //  The location of the texture that the renderer should use.
    private final ResourceLocation texture;

    // The position the butterfly is flying towards. Butterflies can spawn
    // anywhere the light level is above 8.
    @Nullable private BlockPos targetPosition;

    /**
     * Checks custom rules to determine if the entity can spawn.
     * @param entityType (Unused) The type of the entity to spawn.
     * @param level The level/world to spawn the entity into.
     * @param spawnType (Unused) The type of spawn happening.
     * @param position The position to spawn the entity into.
     * @param rng (Unused) The global random number generator.
     * @return TRUE if the butterfly can spawn.
     */
    public static boolean checkButterflySpawnRules(
            @SuppressWarnings("unused") EntityType<Butterfly> entityType,
            ServerLevelAccessor level,
            @SuppressWarnings("unused") MobSpawnType spawnType,
            BlockPos position,
            @SuppressWarnings("unused") RandomSource rng) {
        return level.getRawBrightness(position, 0) > 8;
    }

    /**
     * Supplies attributes for the butterfly, in this case just 3 points of
     * maximum health (1.5 hearts).
     * @return The butterfly attribute supplier.
     */
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 3d);
    }

    /**
     * Create an Admiral butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createAdmiralButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_admiral.png",
                entityType, level);
    }

    /**
     * Create a Buckeye butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createBuckeyeButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_buckeye.png",
                entityType, level);
    }

    /**
     * Create a Cabbage butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createCabbageButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.LARGE,
                "butterfly_cabbage.png",
                entityType, level);
    }

    /**
     * Create a Chalkhill butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createChalkhillButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.SMALL,
                "butterfly_chalkhill.png",
                entityType, level);
    }

    /**
     * Create a Clipper butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createClipperButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.LARGE,
                "butterfly_clipper.png",
                entityType, level);
    }

    /**
     * Create a Common butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createCommonButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_common.png",
                entityType, level);
    }

    /**
     * Create an Emperor butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createEmperorButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.LARGE,
                "butterfly_emperor.png",
                entityType, level);
    }

    /**
     * Create a Forester butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createForesterButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_forester.png",
                entityType, level);
    }

    /**
     * Create a Glasswing butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createGlasswingButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_glasswing.png",
                entityType, level);
    }

    /**
     * Create a Hairstreak butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createHairstreakButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_hairstreak.png",
                entityType, level);
    }

    /**
     * Create a Heath butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createHeathButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.SMALL,
                "butterfly_heath.png",
                entityType, level);
    }

    /**
     * Create a Longwing butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createLongwingButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.SMALL,
                "butterfly_longwing.png",
                entityType, level);
    }

    /**
     * Create a Monarch butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createMonarchButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.MEDIUM,
                "butterfly_monarch.png",
                entityType, level);
    }

    /**
     * Create a Morpho butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createMorphoButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.LARGE,
                "butterfly_morpho.png", entityType, level);
    }

    /**
     * Create a Rainbow butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createRainbowButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.SMALL,
                "butterfly_rainbow.png",
                entityType, level);
    }

    /**
     * Create a Swallowtail butterfly
     * @param entityType The type of the entity.
     * @param level The current level.
     * @return A newly constructed butterfly.
     */
    @NotNull
    public static Butterfly createSwallowtailButterfly(
            EntityType<? extends Butterfly> entityType,
            Level level) {
        return new Butterfly(
                Size.LARGE,
                "butterfly_swallowtail.png",
                entityType, level);
    }

    /**
     * Used to spawn a butterfly into the world.
     * @param level The current level.
     * @param entityId The type of butterfly to release.
     * @param position The current position of the player.
     */
    public static void spawn(Level level,
                             String entityId,
                             BlockPos position,
                             Boolean placed) {
        if (level instanceof ServerLevel) {

            ResourceLocation key = ResourceLocation.tryParse(entityId);
            EntityType<?> entityType = BuiltInRegistries.ENTITY_TYPE.get(key);
            if (entityType != null) {
                Entity entity = entityType.create(level);
                if (entity instanceof Butterfly butterfly) {

                    butterfly.moveTo(position.getX() + 0.45D,
                            position.getY() + 0.2D,
                            position.getZ() + 0.5D,
                            0.0F, 0.0F);

                    butterfly.finalizeSpawn((ServerLevel) level,
                            level.getCurrentDifficultyAt(position),
                            MobSpawnType.NATURAL,
                            null,
                            null);

                    butterfly.setPersistenceRequired();

                    if (placed) {
                        butterfly.setInvulnerable(true);
                    }

                    level.addFreshEntity(butterfly);
                }
            }
        } else {
            level.playSound(null, position.getX(), position.getY(), position.getZ(), SoundEvents.PLAYER_ATTACK_WEAK,
                            SoundSource.NEUTRAL, 1.0f, 1.0f);
        }
    }

    /**
     * The default constructor.
     * @param size The size of the butterfly.
     * @param texture The texture the butterfly should use.
     * @param entityType The type of the entity.
     * @param level The level where the entity exists.
     */
    public Butterfly(Size size,
                     String texture,
                     EntityType<? extends Butterfly> entityType,
                     Level level) {
        super(entityType, level);

        this.size = size;
        this.texture = ButterfliesMod.id("textures/entity/butterfly/" + texture);
    }

    /**
     * Overrides how fall damage is applied to the entity. Butterflies ignore
     * all fall damage.
     * @param fallDistance The distance fallen.
     * @param blockModifier The damage modifier for the block landed on.
     * @param damageSource The source of the damage.
     * @return Always FALSE, as no damage is applied.
     */
    @Override
    public boolean causeFallDamage(float fallDistance,
                                   float blockModifier,
                                   @NotNull DamageSource damageSource) {
        return false;
    }

    /**
     * Butterflies won't produce offspring: they lay eggs instead.
     * @param level The current level
     * @param mob The parent mod
     * @return NULL as there are no offspring
     */
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(@NotNull ServerLevel level,
                                        @NotNull AgeableMob mob) {
        return null;
    }

    /**
     * Controls when a flapping event should be emitted.
     * @return TRUE when a flapping event should be emitted.
     */
    @Override
    protected boolean isFlapping() {
        return this.tickCount % TICKS_PER_FLAP == 0;
    }

    /**
     * Overrides how an entity handles triggers such as tripwires and pressure
     * plates. Butterflies aren't heavy enough to trigger either.
     * @return Always TRUE, so butterflies ignore block triggers.
     */
    @Override
    public boolean isIgnoringBlockTriggers() {
        return true;
    }

    /**
     * Override this to control if an entity can be pushed or not. Butterflies
     * can't be pushed by other entities.
     * @return Always FALSE, so butterflies cannot be pushed.
     */
    @Override
    public boolean isPushable() {
        return false;
    }

    /**
     * The main update loop for the entity.
     */
    @Override
    public void tick() {
        super.tick();

        //  Reduce the vertical movement to keep the butterfly close to the
        //  same height.
        this.setDeltaMovement(
                this.getDeltaMovement().multiply(1.0d, 0.6d, 1.0d));
    }

    /**
     * Override to control how an entity checks for fall damage. In this case
     * butterflies just ignore the check.
     * @param yPos The current height of the entity.
     * @param onGround TRUE if the entity is on the ground.
     * @param blockState The state of the block just below the entity.
     * @param position The entity's current position.
     */
    @Override
    protected void checkFallDamage(double yPos,
                                   boolean onGround,
                                   @NotNull BlockState blockState,
                                   @NotNull BlockPos position) {
        //No-op
    }

    /**
     * A custom step for the AI update loop.
     */
    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();

        Level level = this.level();

        // Check the current move target is still an empty block.
        if (this.targetPosition != null
                && (!level.isEmptyBlock(this.targetPosition)
                || this.targetPosition.getY() <= level.getMinBuildHeight())) {
            this.targetPosition = null;
        }

        // Set a new target position if:
        //  1. We don't have one already
        //  2. After a 1/30 random chance
        //  3. We get too close to the current target position
        if (this.targetPosition == null
                || this.random.nextInt(30) == 0
                || this.targetPosition.closerToCenterThan(
                        this.position(), 2.0d)) {
            this.targetPosition = new BlockPos(
                    (int) this.getX()
                            + this.random.nextInt(7)
                            - this.random.nextInt(7),
                    (int) this.getY()
                            + this.random.nextInt(6)
                            - 2,
                    (int) this.getZ()
                            + this.random.nextInt(7)
                            - this.random.nextInt(7));
        }

        // Calculate an updated movement delta.
        double dx = this.targetPosition.getX() + 0.5d - this.getX();
        double dy = this.targetPosition.getY() + 0.1d - this.getY();
        double dz = this.targetPosition.getZ() + 0.5d - this.getZ();

        Vec3 deltaMovement = this.getDeltaMovement();
        Vec3 updatedDeltaMovement = deltaMovement.add(
                (Math.signum(dx) * 0.5d - deltaMovement.x) * BUTTERFLY_SPEED,
                (Math.signum(dy) * 0.7d - deltaMovement.y) * 0.1d,
                (Math.signum(dz) * 0.5d - deltaMovement.z) * BUTTERFLY_SPEED);
        this.setDeltaMovement(updatedDeltaMovement);

        this.zza = 0.5f;

        // Calculate the rotational velocity.
        double yRot = (Mth.atan2(updatedDeltaMovement.z, updatedDeltaMovement.x)
                * (180.0d / Math.PI)) - 90.0d;
        double yRotDelta = Mth.wrapDegrees(yRot - this.getYRot());
        this.setYRot(this.getYRot() + (float)yRotDelta);

        // Attempt to lay an egg.
        if (this.random.nextInt(320) == 1) {
            BlockPos position = this.blockPosition();
            position = switch (this.random.nextInt(6)) {
                default -> position.above();
                case 1 -> position.below();
                case 2 -> position.north();
                case 3 -> position.east();
                case 4 -> position.south();
                case 5 -> position.west();
            };

            ButterflyLeavesBlock.swapLeavesBlock(
                    level,
                    position,
                    this.getEncodeId());
        }
    }

    /**
     * Override to change how pushing other entities affects them. Butterflies
     * don't push other entities.
     * @param otherEntity The other entity pushing/being pushed.
     */
    @Override
    protected void doPush(@NotNull Entity otherEntity) {
        // No-op
    }

    /**
     * Override to control what kind of movement events the entity will emit.
     * Butterflies will not emit sounds.
     * @return Movement events only.
     */
    @NotNull
    @Override
    protected MovementEmission getMovementEmission() {
        return MovementEmission.EVENTS;
    }

    /**
     * Get the scale to use for the butterfly.
     * @return A scale value based on the butterfly's size.
     */
    public float getScale() {
        switch (size) {
            case SMALL -> { return 0.25f; }
            case LARGE ->{ return 0.45f; }
            default -> { return 0.35f; }
        }
    }

    /**
     * Override to control an entity's relative volume. Butterflies are silent.
     * @return Always zero, so butterflies are silent.
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
     * Get the texture to use for rendering.
     * @return The resource location of the texture.
     */
    public ResourceLocation getTexture() {
        return texture;
    }

    /**
     * Override to change how pushing other entities affects them. Butterflies
     * don't push other entities.
     */
    @Override
    protected void pushEntities() {
        // No-op
    }
}
