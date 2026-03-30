package net.tropicraft.core.common.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.tropicraft.core.common.entity.projectile.EntityDart;

public class ItemDart extends ItemTropicraft{

    private EntityDart EntityDart;

    public EntityDart createDart(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        return EntityDart;
    }
}
