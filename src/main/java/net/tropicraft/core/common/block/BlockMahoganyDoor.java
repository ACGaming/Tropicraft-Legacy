package net.tropicraft.core.common.block;

import java.util.Random;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tropicraft.core.registry.ItemRegistry;

public class BlockMahoganyDoor extends BlockDoor {

    public BlockMahoganyDoor() {
        super(Material.PLANTS);
        this.disableStats();
        this.setHardness(2.0F);
        this.setSoundType(SoundType.WOOD);
        this.setHarvestLevel("axe", 0);
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getItem(World world, BlockPos pos, IBlockState state) {
        return new ItemStack(ItemRegistry.mahoganyDoor);
    }

    // BlockDoor.getItem() is private so we need to override this logic entirely
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? null : ItemRegistry.mahoganyDoor;
    }
}
