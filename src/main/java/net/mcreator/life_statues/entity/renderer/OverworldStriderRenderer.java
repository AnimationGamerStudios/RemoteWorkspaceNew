
package net.mcreator.life_statues.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.PiglinModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.life_statues.entity.OverworldStriderEntity;

@OnlyIn(Dist.CLIENT)
public class OverworldStriderRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(OverworldStriderEntity.entity,
					renderManager -> new MobRenderer(renderManager, new PiglinModel(0, 64, 64), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("life_statues:textures/entities/overworld_strider.png");
						}
					});
		}
	}
}
