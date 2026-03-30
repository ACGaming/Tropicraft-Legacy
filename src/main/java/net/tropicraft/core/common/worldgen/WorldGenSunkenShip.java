package net.tropicraft.core.common.worldgen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tropicraft.Info;
import net.tropicraft.core.common.block.tileentity.TileEntityBambooChest;
import net.tropicraft.core.common.enums.TropicraftPlanks;
import net.tropicraft.core.registry.BlockRegistry;
import net.tropicraft.core.registry.LootRegistry;

public class WorldGenSunkenShip extends TCDirectionalGen {

	private static final IBlockState PLANK_STATE = BlockRegistry.planks.defaultForVariant(TropicraftPlanks.MAHOGANY);

	public WorldGenSunkenShip(World world, Random random) {
		super(world, random, random.nextInt(4));
	}

	@Override
	public boolean generate(BlockPos pos) {
		int i = pos.getX(); int j = pos.getY(); int k = pos.getZ();
		this.setOrigin(i, k);

		if (TCGenUtils.getBlock(worldObj, i, j + 4, k) != BlockRegistry.tropicsWater) { // Must be water 4 blocks above the sea floor
			return false;
		}

		j += 1; // Move the "origin" up

		final int length = this.rand.nextInt(25) + 25;

		int y = j;

		while (true) { // Acting y loop
			boolean hasGenned = false;

			int fib = 2;
			int lastFib = 1;
			int width = y - j;
			for (int x = 0; x < length; x++) {
				if (x == fib && x <= (length / 3D)) {
					width++;
					fib += lastFib;
					lastFib = fib - lastFib;
				}

				if (x > length - 3) {
					width--;
				}

				if (width >= 0) {
					for (int z = -width; z <= width; z++) {
						if (rand.nextInt(5) < 3) {
							if (y == j || x == length - 1) {
								this.placeBlockWithDir(x, y, z, PLANK_STATE);
								if (z == -width || z == width || x == length - 1) {
									this.placeBlockWithDir(x, y + 1, z, PLANK_STATE);								
								}

								if (x == length / 2 && z == 0) {
									this.placeBlockWithDir(x, y + 1, z, PLANK_STATE);		
									this.placeBlockWithDir(x, y + 2, z, PLANK_STATE);		
									this.placeBlockWithDir(x, y + 3, z, PLANK_STATE);		
								}
							} else if (x == length / 2 && z == 0 && y == j - 2) {
								this.placeBlockWithDir(x, y, z, BlockRegistry.bambooChest.getDefaultState());	
								BlockPos pos2 = new BlockPos(x, y, z);
								TileEntityBambooChest chest = (TileEntityBambooChest)this.getTEWithDir(pos2);

								if(chest != null) {
									chest.setLootTable(LootRegistry.sunkenShip, rand.nextLong());
								}
							} else if (z == -width || z == width) {
								this.placeBlockWithDir(x, y, z, PLANK_STATE);						
							} else {
								this.placeBlockWithDir(x, y, z, Blocks.AIR.getDefaultState());	
							}
						}
					}
					hasGenned = true;
				}
			}

			if (!hasGenned) {
				break;
			}

			y--;
		}

		return false;
	}
}