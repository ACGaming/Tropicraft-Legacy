package net.tropicraft.core.common.item;

import org.apache.commons.lang3.ArrayUtils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.tropicraft.core.common.config.TropicsConfigs;
import net.tropicraft.core.common.entity.projectile.EntityCoconutGrenade;

public class ItemCoconutBomb extends ItemTropicraft {

    public ItemCoconutBomb() {
        super();
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        if (!player.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }
        world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 0.5F);
        if (!world.isRemote) {
            if (ArrayUtils.contains(TropicsConfigs.coconutBombWhitelist, player.getGameProfile().getName())) {
                EntityCoconutGrenade grenade = new EntityCoconutGrenade(world, player);
                grenade.shoot(player, player.rotationPitch, player.rotationYaw, -20.0F, 0.5F, 1.0F);
                world.spawnEntity(grenade);
            } else {
                player.sendMessage(new TextComponentTranslation(I18n.translateToLocal("tropicraft.coconutBombWarning")));
            }
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
    }
}
