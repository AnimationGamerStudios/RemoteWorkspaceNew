package net.mcreator.life_statues.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.life_statues.block.CopiumCrystalOreBlockBlock;
import net.mcreator.life_statues.LifeStatuesMod;

import java.util.Map;

public class CopiumOreBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LifeStatuesMod.LOGGER.warn("Failed to load dependency world for procedure CopiumOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LifeStatuesMod.LOGGER.warn("Failed to load dependency x for procedure CopiumOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LifeStatuesMod.LOGGER.warn("Failed to load dependency y for procedure CopiumOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LifeStatuesMod.LOGGER.warn("Failed to load dependency z for procedure CopiumOreBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.3) {
			world.setBlockState(new BlockPos(x, y, z), CopiumCrystalOreBlockBlock.block.getDefaultState(), 3);
		}
	}
}
