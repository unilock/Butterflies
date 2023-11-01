package com.bokmcdok.butterflies.mixin;

import com.bokmcdok.butterflies.registries.ItemRegistry;
import com.bokmcdok.butterflies.world.CompoundTagId;
import com.bokmcdok.butterflies.world.item.BottledButterflyItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.ResultSlot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(ResultSlot.class)
public class ResultSlotMixin {
	@Shadow
	@Final
	private CraftingContainer craftSlots;

	@Inject(method = "onTake", at = @At("HEAD"))
	private void onTake(Player player, ItemStack craftingItem, CallbackInfo ci) {
		if (!player.getCommandSenderWorld().isClientSide() && this.craftSlots.getItems().stream().map(ItemStack::getItem).toList().contains(ItemRegistry.BOTTLED_BUTTERFLY)) {
			this.craftSlots.getItems().forEach(recipeItem -> {
				if (Objects.equals(recipeItem.getItem(), ItemRegistry.BUTTERFLY_NET)) {
					CompoundTag tag = recipeItem.copy().getOrCreateTag();
					String entityId = tag.getString(CompoundTagId.ENTITY_ID);
					BottledButterflyItem.setButterfly(craftingItem, entityId);
				}
			});
		}
	}
}
