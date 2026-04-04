package net.tropicraft.core.common.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemDart extends ItemTropicraft {

    // None of this does anything, shocking I know.
    /*
    public static final String[] dartNames = new String[]{"paralyze", "poison", "moveSlowdown", "harm", "confusion", "hunger", "weakness"};
    private static final int[] colors = new int[]{0xFFB5FF, 0x258EA3, 0xCFD7D9, 0xDFE23A, 0x5137FB, 0xE12424, 0x6CC7FF};
    private static final String[] tooltipText = new String[]{"\u00a7d", "\u00a73", "\u00a77", "\u00a76", "\u00a71", "\u00a74", "\u00a79"};

    public ItemDart() {
        this.setHasSubtypes(true);
        setMaxStackSize(64);
    }

    // returns a list of items with the same ID, but different meta (eg: dye returns 16 items)

    public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List par3List) {
        for (int i = 0; i < dartNames.length; ++i) {
            par3List.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return colors[par1ItemStack.getItemDamage()];
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer ent, List list, boolean wat) {
        list.clear();
        list.add(tooltipText[itemstack.getItemDamage()] + list.add(I18n.format("dart.tropicraft:prefix.name", " ", "dart.tropicraft:" + dartNames[itemstack.getItemDamage()] + ".name")));
    }*/
}
