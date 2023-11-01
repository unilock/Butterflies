package com.bokmcdok.butterflies.registries;

import com.bokmcdok.butterflies.ButterfliesMod;
import com.bokmcdok.butterflies.world.entity.ambient.Butterfly;
import com.bokmcdok.butterflies.world.entity.ambient.Caterpillar;
import com.bokmcdok.butterflies.world.item.BottledButterflyItem;
import com.bokmcdok.butterflies.world.item.ButterflyEggItem;
import com.bokmcdok.butterflies.world.item.ButterflyNetItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

/**
 * This class registers items with Forge's Item Registry
 */
public class ItemRegistry {
    //  Butterfly net - Used to catch butterflies
    public static final Item BUTTERFLY_NET = register(ButterflyNetItem.NAME, new ButterflyNetItem(new FabricItemSettings().stacksTo(1)));

    // Bottled butterfly - A butterfly trapped in a bottle.
    public static final Item BOTTLED_BUTTERFLY = register(BottledButterflyItem.NAME, new BottledButterflyItem(new FabricItemSettings().stacksTo(1)));

    // Butterfly Eggs - Eggs that will eventually hatch into a caterpillar.
    public static final Item ADMIRAL_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.ADMIRAL_NAME, Butterfly.ADMIRAL_NAME);
    public static final Item BUCKEYE_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.BUCKEYE_NAME, Butterfly.BUCKEYE_NAME);
    public static final Item CABBAGE_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.CABBAGE_NAME, Butterfly.CABBAGE_NAME);
    public static final Item CHALKHILL_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.CHALKHILL_NAME, Butterfly.CHALKHILL_NAME);
    public static final Item CLIPPER_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.CLIPPER_NAME, Butterfly.CLIPPER_NAME);
    public static final Item COMMON_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.COMMON_NAME, Butterfly.COMMON_NAME);
    public static final Item EMPEROR_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.EMPEROR_NAME, Butterfly.EMPEROR_NAME);
    public static final Item FORESTER_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.FORESTER_NAME, Butterfly.FORESTER_NAME);
    public static final Item GLASSWING_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.GLASSWING_NAME, Butterfly.GLASSWING_NAME);
    public static final Item HAIRSTREAK_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.HAIRSTREAK_NAME, Butterfly.HAIRSTREAK_NAME);
    public static final Item HEATH_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.HEATH_NAME, Butterfly.HEATH_NAME);
    public static final Item LONGWING_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.LONGWING_NAME, Butterfly.LONGWING_NAME);
    public static final Item MONARCH_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.MONARCH_NAME, Butterfly.MONARCH_NAME);
    public static final Item MORPHO_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.MORPHO_NAME, Butterfly.MORPHO_NAME);
    public static final Item RAINBOW_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.RAINBOW_NAME, Butterfly.RAINBOW_NAME);
    public static final Item SWALLOWTAIL_BUTTERFLY_EGG = registerButterflyEgg(ButterflyEggItem.SWALLOWTAIL_NAME, Butterfly.SWALLOWTAIL_NAME);

	// Butterfly spawn eggs
    private static final Item BUTTERFLY_MORPHO_EGG = registerSpawnEgg(Butterfly.MORPHO_NAME, EntityTypeRegistry.BUTTERFLY_MORPHO, 0x0000aa, 0x0088ff);
    private static final Item BUTTERFLY_FORESTER_EGG = registerSpawnEgg(Butterfly.FORESTER_NAME, EntityTypeRegistry.BUTTERFLY_FORESTER, 0xeeee77, 0xff7777);
    private static final Item BUTTERFLY_COMMON_EGG = registerSpawnEgg(Butterfly.COMMON_NAME, EntityTypeRegistry.BUTTERFLY_COMMON, 0xaaff66, 0xeeee77);
    private static final Item BUTTERFLY_EMPEROR_EGG = registerSpawnEgg(Butterfly.EMPEROR_NAME, EntityTypeRegistry.BUTTERFLY_EMPEROR, 0xcc44cc, 0xffffff);
    private static final Item BUTTERFLY_HAIRSTREAK_EGG = registerSpawnEgg(Butterfly.HAIRSTREAK_NAME, EntityTypeRegistry.BUTTERFLY_HAIRSTREAK, 0xcc44cc, 0x880000);
    private static final Item BUTTERFLY_RAINBOW_EGG = registerSpawnEgg(Butterfly.RAINBOW_NAME, EntityTypeRegistry.BUTTERFLY_RAINBOW, 0xff7777, 0x0088ff);
    private static final Item BUTTERFLY_HEATH_EGG = registerSpawnEgg(Butterfly.HEATH_NAME, EntityTypeRegistry.BUTTERFLY_HEATH, 0x880000, 0x000000);
    private static final Item BUTTERFLY_GLASSWING_EGG = registerSpawnEgg(Butterfly.GLASSWING_NAME, EntityTypeRegistry.BUTTERFLY_GLASSWING, 0x880000, 0xffffff);
    private static final Item BUTTERFLY_CHALKHILL_EGG = registerSpawnEgg(Butterfly.CHALKHILL_NAME, EntityTypeRegistry.BUTTERFLY_CHALKHILL, 0x0088ff, 0x00cc55);
    private static final Item BUTTERFLY_SWALLOWTAIL_EGG = registerSpawnEgg(Butterfly.SWALLOWTAIL_NAME, EntityTypeRegistry.BUTTERFLY_SWALLOWTAIL, 0xffffff, 0xeeee77);
    private static final Item BUTTERFLY_MONARCH_EGG = registerSpawnEgg(Butterfly.MONARCH_NAME, EntityTypeRegistry.BUTTERFLY_MONARCH, 0xdd8855, 0x000000);
    private static final Item BUTTERFLY_CABBAGE_EGG = registerSpawnEgg(Butterfly.CABBAGE_NAME, EntityTypeRegistry.BUTTERFLY_CABBAGE, 0xeeee77, 0xffffff);
    private static final Item BUTTERFLY_ADMIRAL_EGG = registerSpawnEgg(Butterfly.ADMIRAL_NAME, EntityTypeRegistry.BUTTERFLY_ADMIRAL, 0x880000, 0x0088ff);
    private static final Item BUTTERFLY_LONGWING_EGG = registerSpawnEgg(Butterfly.LONGWING_NAME, EntityTypeRegistry.BUTTERFLY_LONGWING, 0x000000, 0xffffff);
    private static final Item BUTTERFLY_CLIPPER_EGG = registerSpawnEgg(Butterfly.CLIPPER_NAME, EntityTypeRegistry.BUTTERFLY_CLIPPER, 0x0044aa, 0x004488);
    private static final Item BUTTERFLY_BUCKEYE_EGG = registerSpawnEgg(Butterfly.BUCKEYE_NAME, EntityTypeRegistry.BUTTERFLY_BUCKEYE, 0xcccc88, 0x8888cc);

	// Caterpillar spawn eggs
    private static final Item CATERPILLAR_MORPHO_EGG = registerSpawnEgg(Caterpillar.MORPHO_NAME, EntityTypeRegistry.CATERPILLAR_MORPHO, 0x0000aa, 0x0088ff);
    private static final Item CATERPILLAR_FORESTER_EGG = registerSpawnEgg(Caterpillar.FORESTER_NAME, EntityTypeRegistry.CATERPILLAR_FORESTER, 0xeeee77, 0xff7777);
    private static final Item CATERPILLAR_COMMON_EGG = registerSpawnEgg(Caterpillar.COMMON_NAME, EntityTypeRegistry.CATERPILLAR_COMMON, 0xaaff66, 0xeeee77);
    private static final Item CATERPILLAR_EMPEROR_EGG = registerSpawnEgg(Caterpillar.EMPEROR_NAME, EntityTypeRegistry.CATERPILLAR_EMPEROR, 0xcc44cc, 0xffffff);
    private static final Item CATERPILLAR_HAIRSTREAK_EGG = registerSpawnEgg(Caterpillar.HAIRSTREAK_NAME, EntityTypeRegistry.CATERPILLAR_HAIRSTREAK, 0xcc44cc, 0x880000);
    private static final Item CATERPILLAR_RAINBOW_EGG = registerSpawnEgg(Caterpillar.RAINBOW_NAME, EntityTypeRegistry.CATERPILLAR_RAINBOW, 0xff7777, 0x0088ff);
    private static final Item CATERPILLAR_HEATH_EGG = registerSpawnEgg(Caterpillar.HEATH_NAME, EntityTypeRegistry.CATERPILLAR_HEATH, 0x880000, 0x000000);
    private static final Item CATERPILLAR_GLASSWING_EGG = registerSpawnEgg(Caterpillar.GLASSWING_NAME, EntityTypeRegistry.CATERPILLAR_GLASSWING, 0x880000, 0xffffff);
    private static final Item CATERPILLAR_CHALKHILL_EGG = registerSpawnEgg(Caterpillar.CHALKHILL_NAME, EntityTypeRegistry.CATERPILLAR_CHALKHILL, 0x0088ff, 0x00cc55);
    private static final Item CATERPILLAR_SWALLOWTAIL_EGG = registerSpawnEgg(Caterpillar.SWALLOWTAIL_NAME, EntityTypeRegistry.CATERPILLAR_SWALLOWTAIL, 0xffffff, 0xeeee77);
    private static final Item CATERPILLAR_MONARCH_EGG = registerSpawnEgg(Caterpillar.MONARCH_NAME, EntityTypeRegistry.CATERPILLAR_MONARCH, 0xdd8855, 0x000000);
    private static final Item CATERPILLAR_CABBAGE_EGG = registerSpawnEgg(Caterpillar.CABBAGE_NAME, EntityTypeRegistry.CATERPILLAR_CABBAGE, 0xeeee77, 0xffffff);
    private static final Item CATERPILLAR_ADMIRAL_EGG = registerSpawnEgg(Caterpillar.ADMIRAL_NAME, EntityTypeRegistry.CATERPILLAR_ADMIRAL, 0x880000, 0x0088ff);
    private static final Item CATERPILLAR_LONGWING_EGG = registerSpawnEgg(Caterpillar.LONGWING_NAME, EntityTypeRegistry.CATERPILLAR_LONGWING, 0x000000, 0xffffff);
    private static final Item CATERPILLAR_CLIPPER_EGG = registerSpawnEgg(Caterpillar.CLIPPER_NAME, EntityTypeRegistry.CATERPILLAR_CLIPPER, 0x0044aa, 0x004488);
    private static final Item CATERPILLAR_BUCKEYE_EGG = registerSpawnEgg(Caterpillar.BUCKEYE_NAME, EntityTypeRegistry.CATERPILLAR_BUCKEYE, 0xcccc88, 0x8888cc);

	private static Item registerButterflyEgg(String path, String name) {
		Item item = register(path, new ButterflyEggItem(name, new FabricItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(entries -> entries.accept(item));
		return item;
	}

	private static Item registerSpawnEgg(String path, EntityType<? extends Mob> type, int i, int j) {
		Item item = register(path, new SpawnEggItem(type, i, j, new FabricItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(entries -> entries.accept(item));
		return item;
	}

	private static Item register(String path, Item item) {
		Registry.register(BuiltInRegistries.ITEM, ButterfliesMod.id(path), item);
		return item;
	}

	public static void init() {
		// Registers additional items with the relevant creative tab
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> entries.accept(BOTTLED_BUTTERFLY));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> entries.accept(BUTTERFLY_NET));
	}
}
