package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.world.block.BottledButterflyBlock;
import com.bokmcdok.butterflies.world.block.ButterflyCherryLeavesBlock;
import com.bokmcdok.butterflies.world.block.ButterflyLeavesBlock;
import com.bokmcdok.butterflies.world.block.ButterflyMangroveLeavesBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

/**
 * Registers the blocks used by the mod.
 */
public class BlockRegistry {
	// The bottled butterfly block when it is in the world.
	// TODO: registerBlockOnly is ineloquent
    public static final Block BOTTLED_BUTTERFLY_BLOCK =
            registerBlockOnly(BottledButterflyBlock.NAME,
            new BottledButterflyBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .isRedstoneConductor(BlockRegistry::never)
                    .isSuffocating(BlockRegistry::never)
                    .isValidSpawn(BlockRegistry::never)
                    .isViewBlocking(BlockRegistry::never)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .strength(0.3F)));

    // Represent leaves that have butterfly eggs in them.
    public static final Block BUTTERFLY_OAK_LEAVES =
            register("butterfly_oak_leaves", butterflyLeaves(SoundType.GRASS));

    public static final Block BUTTERFLY_SPRUCE_LEAVES =
            register("butterfly_spruce_leaves", butterflyLeaves(SoundType.GRASS));

    public static final Block BUTTERFLY_BIRCH_LEAVES =
            register("butterfly_birch_leaves", butterflyLeaves(SoundType.GRASS));

    public static final Block BUTTERFLY_JUNGLE_LEAVES =
            register("butterfly_jungle_leaves", butterflyLeaves(SoundType.GRASS));

    public static final Block BUTTERFLY_ACACIA_LEAVES =
            register("butterfly_acacia_leaves", butterflyLeaves(SoundType.GRASS));

    public static final Block BUTTERFLY_DARK_OAK_LEAVES =
            register("butterfly_dark_oak_leaves", butterflyLeaves(SoundType.GRASS));

    public static final Block BUTTERFLY_AZALEA_LEAVES =
            register("butterfly_azalea_leaves", butterflyLeaves(SoundType.AZALEA_LEAVES));

    public static final Block BUTTERFLY_FLOWERING_AZALEA_LEAVES =
            register("butterfly_flowering_azalea_leaves", butterflyLeaves(SoundType.AZALEA_LEAVES));

    public static final Block BUTTERFLY_CHERRY_LEAVES =
            register("butterfly_cherry_leaves", new ButterflyCherryLeavesBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.2F)
                    .randomTicks()
                    .sound(SoundType.CHERRY_LEAVES)
                    .noOcclusion()
                    .isValidSpawn(BlockRegistry::ocelotOrParrot)
                    .isSuffocating(BlockRegistry::never)
                    .isViewBlocking(BlockRegistry::never)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor(BlockRegistry::never)));

    public static final Block BUTTERFLY_MANGROVE_LEAVES =
            register("butterfly_mangrove_leaves", new ButterflyMangroveLeavesBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .strength(0.2F)
                    .randomTicks()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn(BlockRegistry::ocelotOrParrot)
                    .isSuffocating(BlockRegistry::never)
                    .isViewBlocking(BlockRegistry::never)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor(BlockRegistry::never)));

    private static ButterflyLeavesBlock butterflyLeaves(SoundType soundType) {
        return new ButterflyLeavesBlock(BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .strength(0.2F)
                .randomTicks()
                .sound(soundType)
                .noOcclusion()
                .isValidSpawn(BlockRegistry::ocelotOrParrot)
                .isSuffocating(BlockRegistry::never)
                .isViewBlocking(BlockRegistry::never)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY)
                .isRedstoneConductor(BlockRegistry::never));
    }

    /**
     * Helper method for the "never" attribute.
     * @param blockState The current block state.
     * @param blockGetter Access to the block.
     * @param blockPos The block's position.
     * @param entityType The entity type trying to spawn.
     * @return Always FALSE.
     */
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    /**
     * Helper method for the "never" attribute.
     * @param blockState The current block state.
     * @param blockGetter Access to the block.
     * @param blockPos The block's position.
     * @return Always FALSE.
     */
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    private static Boolean ocelotOrParrot(BlockState blockState,
                                          BlockGetter blockGetter,
                                          BlockPos position,
                                          EntityType<?> entityType) {
        return entityType == EntityType.OCELOT || entityType == EntityType.PARROT;
    }

	private static Block register(String path, Block block) {
		Registry.register(BuiltInRegistries.BLOCK, ButterfliesMod.id(path), block);
		Registry.register(BuiltInRegistries.ITEM, ButterfliesMod.id(path), new BlockItem(block, new FabricItemSettings()));
		return block;
	}

	// TODO: registerBlockOnly is ineloquent
	private static Block registerBlockOnly(String path, Block block) {
		Registry.register(BuiltInRegistries.BLOCK, ButterfliesMod.id(path), block);
		return block;
	}

	public static void init() {}
}
