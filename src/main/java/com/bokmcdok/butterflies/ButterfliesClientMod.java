package com.bokmcdok.butterflies;

import com.bokmcdok.butterflies.model.ButterflyModel;
import com.bokmcdok.butterflies.model.CaterpillarModel;
import com.bokmcdok.butterflies.model.ChrysalisModel;
import com.bokmcdok.butterflies.registries.BlockRegistry;
import com.bokmcdok.butterflies.registries.EntityTypeRegistry;
import com.bokmcdok.butterflies.renderer.entity.ButterflyRenderer;
import com.bokmcdok.butterflies.renderer.entity.CaterpillarRenderer;
import com.bokmcdok.butterflies.renderer.entity.ChrysalisRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;

public class ButterfliesClientMod implements ClientModInitializer
{
	/**
	 * Client initializer - Additional entry point on the client only.
	 */
	@Override
	public void onInitializeClient() {
		// Register colors for (e.g.) foliage-style blocks.
		ColorProviderRegistry.BLOCK.register(
			(state, tint, position, color) -> FoliageColor.getEvergreenColor(),
			BlockRegistry.BUTTERFLY_SPRUCE_LEAVES
		);
		ColorProviderRegistry.BLOCK.register(
			(state, tint, position, color) -> FoliageColor.getBirchColor(),
			BlockRegistry.BUTTERFLY_BIRCH_LEAVES
		);
		ColorProviderRegistry.BLOCK.register(
			(state, tint, position, color) -> tint != null && position != null ? BiomeColors.getAverageFoliageColor(tint, position) : FoliageColor.getDefaultColor(),
			BlockRegistry.BUTTERFLY_OAK_LEAVES,
			BlockRegistry.BUTTERFLY_JUNGLE_LEAVES,
			BlockRegistry.BUTTERFLY_ACACIA_LEAVES,
			BlockRegistry.BUTTERFLY_DARK_OAK_LEAVES,
			BlockRegistry.BUTTERFLY_MANGROVE_LEAVES
		);

		// Register the renderers for our entities
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_MORPHO, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_COMMON, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_FORESTER, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_EMPEROR, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_HAIRSTREAK, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_RAINBOW, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_HEATH, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_GLASSWING, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_CHALKHILL, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_SWALLOWTAIL, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_MONARCH, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_CABBAGE, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_ADMIRAL, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_LONGWING, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_CLIPPER, ButterflyRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.BUTTERFLY_BUCKEYE, ButterflyRenderer::new);

		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_MORPHO, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_COMMON, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_FORESTER, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_EMPEROR, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_HAIRSTREAK, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_RAINBOW, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_HEATH, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_GLASSWING, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_CHALKHILL, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_SWALLOWTAIL, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_MONARCH, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_CABBAGE, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_ADMIRAL, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_LONGWING, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_CLIPPER, CaterpillarRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CATERPILLAR_BUCKEYE, CaterpillarRenderer::new);

		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_MORPHO, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_COMMON, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_FORESTER, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_EMPEROR, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_HAIRSTREAK, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_RAINBOW, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_HEATH, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_GLASSWING, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_CHALKHILL, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_SWALLOWTAIL, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_MONARCH, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_CABBAGE, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_ADMIRAL, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_LONGWING, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_CLIPPER, ChrysalisRenderer::new);
		EntityRendererRegistry.register(EntityTypeRegistry.CHRYSALIS_BUCKEYE, ChrysalisRenderer::new);

		// Registers models to be used for rendering
		EntityModelLayerRegistry.registerModelLayer(ButterflyModel.LAYER_LOCATION, ButterflyModel::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(CaterpillarModel.LAYER_LOCATION, CaterpillarModel::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(ChrysalisModel.LAYER_LOCATION, ChrysalisModel::createBodyLayer);
	}
}
