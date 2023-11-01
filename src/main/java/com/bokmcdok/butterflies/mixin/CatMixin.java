package com.bokmcdok.butterflies.mixin;

import com.bokmcdok.butterflies.world.entity.ambient.Butterfly;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Cat.class)
public class CatMixin extends Mob {
	protected CatMixin(EntityType<? extends Mob> entityType, Level level) {
		super(entityType, level);
	}

	@Inject(method = "registerGoals", at = @At("TAIL"))
	private void registerGoals(CallbackInfo ci) {
		targetSelector.addGoal(1, new NonTameRandomTargetGoal<>((Cat) (Object) this, Butterfly.class, false, null));
	}
}
