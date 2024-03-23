package com.atmx.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntity.class)
public class ExampleMixin {
	@Shadow private int explosionRadius;

	@Inject(method = "explode",at = @At("HEAD"))
	private void modExplosion(CallbackInfo info) {
		this.explosionRadius = 100;
	}
}