
package net.mcreator.life_statues.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.life_statues.item.CopiumSwordItem;
import net.mcreator.life_statues.LifeStatuesModElements;

@LifeStatuesModElements.ModElement.Tag
public class StonetouchEnchantment extends LifeStatuesModElements.ModElement {
	@ObjectHolder("life_statues:stonetouch")
	public static final Enchantment enchantment = null;

	public StonetouchEnchantment(LifeStatuesModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("stonetouch"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 5;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 1;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench == Enchantments.SHARPNESS)
				return true;
			if (ench == Enchantments.SMITE)
				return true;
			if (ench == Enchantments.SWEEPING)
				return true;
			if (ench == Enchantments.LOOTING)
				return true;
			if (ench == Enchantments.KNOCKBACK)
				return true;
			return false;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == Items.STONE_SWORD)
				return true;
			if (stack.getItem() == CopiumSwordItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return false;
		}
	}
}
