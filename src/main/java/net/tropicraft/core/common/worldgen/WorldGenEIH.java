package net.tropicraft.core.common.worldgen;

import static net.tropicraft.core.common.worldgen.TCGenUtils.setBlock;

import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.tropicraft.core.common.config.TropicsConfigs;
import org.apache.commons.lang3.ArrayUtils;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tropicraft.core.registry.BlockRegistry;

public class WorldGenEIH extends TCGenBase {
	
	private static final int CHUNK_SIZE_Y = 256;
	private static final Block EIH_BLOCK = BlockRegistry.chunk;
	private static final Material[] VALID_MATERIALS_FOR_PLACEMENT = new Material[] {Material.GROUND, Material.GRASS, Material.ROCK, Material.PLANTS};

	public WorldGenEIH(World world, Random random) {
		super(world, random);
	}

    /**
     * Generate the EIH statue with cool eyes and lava inside!
     * @param pos Block position
     */
    @Override
    public boolean generate(BlockPos pos) {
        byte height = 5;
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();

        if (j < 1 || j + height + 1 > CHUNK_SIZE_Y) {
            return false;
        }

        Material matDown = worldObj.getBlockState(pos.down()).getMaterial();

        if (ArrayUtils.contains(VALID_MATERIALS_FOR_PLACEMENT, matDown) && TCGenUtils.isAirBlock(worldObj, i, j, k)) {
            j++;
            setBlock(worldObj, i + 0, j + 0, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 0, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 0, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 0, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 0, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 0, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 1, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 1, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 1, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 1, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 1, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 1, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 2, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 2, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 2, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 3, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 3, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 3, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 3, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 4, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 3, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 3, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 2, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 4, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 4, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 4, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 5, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 5, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 5, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 5, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 3, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 4, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 6, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 6, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 6, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 6, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 6, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 1, j + 5, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 1, j + 5, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 1, j + 4, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 1, j + 4, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 2, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 0, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 0, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 6, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 5, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 4, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 5, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 3, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 4, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 3, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 2, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 3, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 2, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + 1, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 3, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 3, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 2, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 1, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 1, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 0, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 0, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 0, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 0, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 1, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 2, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 3, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 4, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 5, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 6, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 6, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 6, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 5, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 5, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 4, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 4, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 5, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 4, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 3, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 4, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 3, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 2, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 3, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 2, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 1, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -3, j + 0, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 0, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 0, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 0, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 1, k + 4, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 1, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 2, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 1, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 2, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 2, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 3, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 4, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 3, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 3, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 3, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 4, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 5, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 6, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 6, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + 6, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -4, j + 5, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -4, j + 4, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -4, j + 4, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + 4, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + 0, j + 4, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -3, j + 4, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -3, j + 4, k + 1, Blocks.LAVA);
            setBlock(worldObj, i + -3, j + 5, k + 0, Blocks.LAVA);
            setBlock(worldObj, i + -4, j + 5, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 1, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 1, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + 0, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 0, k + -1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + -1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + -1, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -1, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -1, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + -1, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + -1, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -1, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -1, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + -2, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -2, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -2, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + -2, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -2, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -2, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + -2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + -2, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + -3, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -3, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + 0, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + 0, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + -1, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + -1, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + -2, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -1, j + -2, k + 2, Blocks.LAVA);
            setBlock(worldObj, i + -2, j + -3, k + 3, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -3, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -3, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + -3, k + 2, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -3, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -3, k + 1, EIH_BLOCK);
            setBlock(worldObj, i + -3, j + -3, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -2, j + -3, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + -1, j + -3, k + 0, EIH_BLOCK);
            setBlock(worldObj, i + 0, j + -3, k + 0, EIH_BLOCK);
            
            // Coords of the first eye
            int eyeOneX = i;
            int eyeOneY = j + 5;
            int eyeOneZ = k + 1;
            
            // Coords of the second eye
            int eyeTwoX = i - 3;
            int eyeTwoY = j + 5;
            int eyeTwoZ = k + 1;
            
            // Place eyes
            placeEye(eyeOneX, eyeOneY, eyeOneZ);
            placeEye(eyeTwoX, eyeTwoY, eyeTwoZ);
        }
        return true;
    }
    
    /**
     * Place an eye on the head
     * @param x xCoord
     * @param y yCoord
     * @param z zCoord
     */
    private void placeEye(int x, int y, int z) {
        IBlockState blockstate = parseBlockState(TropicsConfigs.genEIHEyes[rand.nextInt(TropicsConfigs.genEIHEyes.length)]);
        TCGenUtils.setBlockState(worldObj, x, y, z, blockstate, blockGenNotifyFlag);
    }

    /**
     * Parse config entry string for blockstate
     * @param config block string
     * @return blockstate
     */
    private IBlockState parseBlockState(String config) {
        if (config == null || config.trim().isEmpty()) {
            return Blocks.GLOWSTONE.getDefaultState();
        }
        String[] parts = config.trim().split(":");
        ResourceLocation loc = new ResourceLocation(parts[0], parts[1]);
        int meta = 0;
        if (parts.length == 3) { // meta specified
            meta = Integer.parseInt(parts[2]);
        }
        Block block = ForgeRegistries.BLOCKS.getValue(loc);
        if (block == null) {
            return Blocks.GLOWSTONE.getDefaultState();
        }
        return block.getStateFromMeta(meta);
    }
}
