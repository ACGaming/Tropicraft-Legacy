package net.tropicraft.core.common.block;

import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tropicraft.Tropicraft;

public class BlockBambooCraftingTable extends BlockWorkbench {

    public BlockBambooCraftingTable() {
        super();
        this.setSoundType(SoundType.PLANT);
        this.setHardness(0.5F);
        this.setResistance(0.5F);
    }
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            playerIn.openGui(Tropicraft.instance, 0, worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
    }
}