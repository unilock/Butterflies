package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.world.block.entity.ButterflyBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

/**
 * Registers any block entity types used by the mod.
 */
public class BlockEntityTypeRegistry {
	// The block entity for a bottled butterfly.
    @SuppressWarnings("ConstantConditions")
    public static final BlockEntityType<ButterflyBlockEntity> BOTTLED_BUTTERFLY_BLOCK =
            register(ButterflyBlockEntity.NAME,
				FabricBlockEntityTypeBuilder.create(ButterflyBlockEntity::CreateBottledButterflyBlockEntity,
					BlockRegistry.BOTTLED_BUTTERFLY_BLOCK).build()
			);

	private static <T extends BlockEntity> BlockEntityType<T> register(String path, BlockEntityType<T> type) {
		Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ButterfliesMod.id(path), type);
		return type;
	}

	public static void init() {}
}
