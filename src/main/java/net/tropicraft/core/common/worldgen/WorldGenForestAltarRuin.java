package net.tropicraft.core.common.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class WorldGenForestAltarRuin extends TCGenBase {

    public WorldGenForestAltarRuin(World world, Random random) {
        super(world, random);
    }

    @Override
    public boolean generate(BlockPos pos) {
        return true;
    }
}