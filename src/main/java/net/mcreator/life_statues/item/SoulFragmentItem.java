
package net.mcreator.life_statues.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.life_statues.itemgroup.LifeStatuesTabItemGroup;
import net.mcreator.life_statues.LifeStatuesModElements;

@LifeStatuesModElements.ModElement.Tag
public class SoulFragmentItem extends LifeStatuesModElements.ModElement {
	@ObjectHolder("life_statues:soul_fragment")
	public static final Item block = null;

	public SoulFragmentItem(LifeStatuesModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(LifeStatuesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("soul_fragment");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
