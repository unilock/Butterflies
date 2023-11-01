package com.bokmcdok.butterflies;

import com.bokmcdok.butterflies.registries.BlockEntityTypeRegistry;
import com.bokmcdok.butterflies.registries.BlockRegistry;
import com.bokmcdok.butterflies.registries.EntityTypeRegistry;
import com.bokmcdok.butterflies.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ButterfliesMod implements ModInitializer
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "butterflies";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    /**
     * Initializer - The main entry point for the mod.
     */
	@Override
    public void onInitialize() {
		// Registries.
		BlockRegistry.init();
        BlockEntityTypeRegistry.init();
		EntityTypeRegistry.init();
		ItemRegistry.init();
    }

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MODID, path);
	}
}
