
package net.mcreator.life_statues.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.life_statues.LifeStatuesModElements;

import java.util.List;
import java.util.Collections;

@LifeStatuesModElements.ModElement.Tag
public class TSDPortalBlockBlock extends LifeStatuesModElements.ModElement {
	@ObjectHolder("life_statues:tsd_portal_block")
	public static final Block block = null;

	public TSDPortalBlockBlock(LifeStatuesModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
	}

	public static class CustomBlock extends PaneBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.PORTAL).sound(SoundType.SLIME).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("tsd_portal_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
