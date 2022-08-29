
package net.mcreator.life_statues.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.life_statues.entity.HandsyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HandsyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HandsyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("life_statues:textures/entities/handsytexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer arm0;
		private final ModelRenderer arm1_r1;
		private final ModelRenderer leg1;
		private final ModelRenderer leg0;
		private final ModelRenderer arm5;
		private final ModelRenderer arm4_r1;
		private final ModelRenderer arm3;
		private final ModelRenderer arm3_r1;
		private final ModelRenderer arm4;
		private final ModelRenderer arm3_r2;
		private final ModelRenderer arm1;
		private final ModelRenderer arm2_r1;
		private final ModelRenderer arm2;
		private final ModelRenderer arm2_r2;
		private final ModelRenderer head;

		public Modelcustom_model() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -7.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-9.0F, -2.0F, -5.0F, 18.0F, 17.0F, 10.0F, 0.0F, false);
			arm0 = new ModelRenderer(this);
			arm0.setRotationPoint(-9.0F, -7.0F, 0.0F);
			setRotationAngle(arm0, 0.0F, 0.0F, 0.48F);
			arm1_r1 = new ModelRenderer(this);
			arm1_r1.setRotationPoint(8.0561F, 31.3158F, 0.0F);
			arm0.addChild(arm1_r1);
			setRotationAngle(arm1_r1, 0.0F, 0.0F, 0.8727F);
			arm1_r1.setTextureOffset(14, 62).addBox(-32.0F, -1.5F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			arm1_r1.setTextureOffset(78, 8).addBox(-31.0F, -14.5F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(5.0F, 11.0F, 0.0F);
			leg1.setTextureOffset(30, 27).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(-4.0F, 11.0F, 0.0F);
			leg0.setTextureOffset(0, 44).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			arm5 = new ModelRenderer(this);
			arm5.setRotationPoint(8.0F, 4.0F, 0.0F);
			setRotationAngle(arm5, 0.0F, 0.0F, 0.2182F);
			arm4_r1 = new ModelRenderer(this);
			arm4_r1.setRotationPoint(-8.2432F, 30.7789F, 0.0F);
			arm5.addChild(arm4_r1);
			setRotationAngle(arm4_r1, 0.0F, 0.0F, -0.8727F);
			arm4_r1.setTextureOffset(44, 40).addBox(26.0F, -1.5F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			arm4_r1.setTextureOffset(64, 62).addBox(27.0F, -14.5F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			arm3 = new ModelRenderer(this);
			arm3.setRotationPoint(-8.0F, 4.0F, 0.0F);
			setRotationAngle(arm3, 0.0F, 0.0F, -0.2182F);
			arm3_r1 = new ModelRenderer(this);
			arm3_r1.setRotationPoint(8.2432F, 30.7789F, 0.0F);
			arm3.addChild(arm3_r1);
			setRotationAngle(arm3_r1, 0.0F, 0.0F, 0.8727F);
			arm3_r1.setTextureOffset(42, 54).addBox(-32.0F, -1.5F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			arm3_r1.setTextureOffset(72, 33).addBox(-31.0F, -14.5F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			arm4 = new ModelRenderer(this);
			arm4.setRotationPoint(8.0F, -2.0F, 0.0F);
			setRotationAngle(arm4, 0.0F, 0.0F, -0.1745F);
			arm3_r2 = new ModelRenderer(this);
			arm3_r2.setRotationPoint(-8.0521F, 30.5956F, 0.0F);
			arm4.addChild(arm3_r2);
			setRotationAngle(arm3_r2, 0.0F, 0.0F, -0.8727F);
			arm3_r2.setTextureOffset(22, 48).addBox(26.0F, -1.5F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			arm3_r2.setTextureOffset(42, 68).addBox(27.0F, -14.5F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(9.0F, -7.0F, 0.0F);
			setRotationAngle(arm1, 0.0F, 0.0F, -0.48F);
			arm2_r1 = new ModelRenderer(this);
			arm2_r1.setRotationPoint(-8.0561F, 31.3158F, 0.0F);
			arm1.addChild(arm2_r1);
			setRotationAngle(arm2_r1, 0.0F, 0.0F, -0.8727F);
			arm2_r1.setTextureOffset(52, 19).addBox(26.0F, -1.5F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			arm2_r1.setTextureOffset(0, 70).addBox(27.0F, -14.5F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(-9.0F, -2.0F, 0.0F);
			setRotationAngle(arm2, 0.0F, 0.0F, 0.1745F);
			arm2_r2 = new ModelRenderer(this);
			arm2_r2.setRotationPoint(9.0369F, 30.422F, 0.0F);
			arm2.addChild(arm2_r2);
			setRotationAngle(arm2_r2, 0.0F, 0.0F, 0.8727F);
			arm2_r2.setTextureOffset(56, 0).addBox(-32.0F, -1.5F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
			arm2_r2.setTextureOffset(20, 76).addBox(-31.0F, -14.5F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.0F, -2.0F);
			head.setTextureOffset(0, 27).addBox(-4.0F, -12.0F, -1.5F, 8.0F, 10.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arm0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arm5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arm3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arm4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arm1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arm2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.arm5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.arm4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.arm0.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.arm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
