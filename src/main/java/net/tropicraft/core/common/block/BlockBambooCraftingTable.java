package net.tropicraft.core.common.block;

import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
/*
public class BlockBambooCraftingTable extends BlockWorkbench {

    public BlockBambooCraftingTable() {
        super();
        this.setSoundType(SoundType.PLANT);
        this.setHardness(0.5F);
        this.setResistance(0.5F);
    }

    public boolean onBlockActivated(World p_onBlockActivated_1_, BlockPos p_onBlockActivated_2_, IBlockState p_onBlockActivated_3_, EntityPlayer p_onBlockActivated_4_, EnumHand p_onBlockActivated_5_, EnumFacing p_onBlockActivated_6_, float p_onBlockActivated_7_, float p_onBlockActivated_8_, float p_onBlockActivated_9_) {
        if (p_onBlockActivated_1_.isRemote) {
            return true;
        } else {
            p_onBlockActivated_4_.displayGui(new InterfaceCraftingTable(p_onBlockActivated_1_, p_onBlockActivated_2_));
            p_onBlockActivated_4_.addStat(StatList.CRAFTING_TABLE_INTERACTION);
            return true;
        }
    }

    public static class InterfaceCraftingTable implements IInteractionObject {
        private final World world;
        private final BlockPos position;

        public InterfaceCraftingTable(World p_i45730_1_, BlockPos p_i45730_2_) {
            this.world = p_i45730_1_;
            this.position = p_i45730_2_;
        }

        public String getName() {
            return "crafting_table";
        }

        public boolean hasCustomName() {
            return false;
        }

        public ITextComponent getDisplayName() {
            return new TextComponentTranslation(Blocks.CRAFTING_TABLE.getUnlocalizedName() + ".name", new Object[0]);
        }

        public Container createContainer(InventoryPlayer p_createContainer_1_, EntityPlayer p_createContainer_2_) {
            return new ContainerWorkbench(p_createContainer_1_, this.world, this.position);
        }

        public String getGuiID() {
            return "minecraft:crafting_table";
        }
    }
}
 */