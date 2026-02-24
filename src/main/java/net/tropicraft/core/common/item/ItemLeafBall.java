package net.tropicraft.core.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
/*
import net.tropicraft.core.common.entity.projectile.EntityLeafBall;

public class ItemLeafBall extends ItemTropicraft {

    public ItemLeafBall() {
        super();
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        if (!itemstack.isEmpty()) {
            itemstack.shrink(1);
        }
        world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 1f * 0.5F);
        if (!world.isRemote) {
                world.spawnEntity(new EntityLeafBall(world, player));
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
    }
}
*/