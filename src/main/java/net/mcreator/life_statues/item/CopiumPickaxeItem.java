
package net.mcreator.life_statues.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.life_statues.itemgroup.LifeStatuesTabItemGroup;
import net.mcreator.life_statues.LifeStatuesModElements;

@LifeStatuesModElements.ModElement.Tag
public class CopiumPickaxeItem extends LifeStatuesModElements.ModElement {
	@ObjectHolder("life_statues:copium_pickaxe")
	public static final Item block = null;

	public CopiumPickaxeItem(LifeStatuesModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 1, -3f, new Item.Properties().group(LifeStatuesTabItemGroup.tab)) {
		}.setRegistryName("copium_pickaxe"));
	}
}
