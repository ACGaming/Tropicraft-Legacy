package net.tropicraft.core.common.block;

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
import net.minecraft.block.BlockTrapDoor;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockThatchTrapdoor extends BlockTrapDoor {

    public BlockThatchTrapdoor() {
        super(Material.PLANTS);
        this.disableStats();
        this.setSoundType(SoundType.PLANT);
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getItem(World world, BlockPos pos, IBlockState state) {
        return new ItemStack(ItemRegistry.thatchTrapdoor);
    }
    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemRegistry.thatchTrapdoor;
    }
}