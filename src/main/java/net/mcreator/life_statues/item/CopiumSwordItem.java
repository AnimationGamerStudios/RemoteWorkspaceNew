
package net.mcreator.life_statues.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.life_statues.itemgroup.LifeStatuesTabItemGroup;
import net.mcreator.life_statues.LifeStatuesModElements;

@LifeStatuesModElements.ModElement.Tag
public class CopiumSwordItem extends LifeStatuesModElements.ModElement {
	@ObjectHolder("life_statues:copium_sword")
	public static final Item block = null;

	public CopiumSwordItem(LifeStatuesModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopiumIngotItem.block));
			}
		}, 3, -2.4f, new Item.Properties().group(LifeStatuesTabItemGroup.tab)) {
		}.setRegistryName("copium_sword"));
	}
}
