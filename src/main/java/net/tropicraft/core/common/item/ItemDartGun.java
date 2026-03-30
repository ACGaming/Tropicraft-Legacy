package net.tropicraft.core.common.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tropicraft.core.common.entity.projectile.EntityDart;
import net.tropicraft.core.registry.ItemRegistry;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.item.ItemBow.getArrowVelocity;
import static sun.audio.AudioPlayer.player;

public class ItemDartGun extends ItemTropicraft {

    public ItemDartGun()
    {
        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(110);
        this.addPropertyOverride(new ResourceLocation("pull"), (itemStack, world, living) ->
        {
            if (living != null)
            {
                ItemStack gun = living.getActiveItemStack();

                if (living instanceof EntityPlayer)
                {
                    EntityPlayer player = (EntityPlayer) living;

                    if (!gun.isEmpty() && gun.getItem() == ItemRegistry.dartGun)
                    {
                        int i = itemStack.getMaxItemUseDuration() - player.getItemInUseCount();

                        if (i > 12)
                        {
                            return 0.9F;
                        }
                        if (i > 0)
                        {
                            return 0.65F;
                        }
                    }
                }
            }
            return 0.0F;
        });
        this.addPropertyOverride(new ResourceLocation("pulling"), (itemStack, world, living) -> living != null && living.isHandActive() && living.getActiveItemStack() == itemStack ? 1.0F : 0.0F);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack)
    {
        return EnumAction.BOW;
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag flag) {
        super.addInformation(stack, world, tooltip, flag);
        tooltip.add(I18n.format("tropicraft.tooltip.dart_gun"));
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack)
    {
        return 16;
    }

    // Called when the player stops using an Item (stops holding the right mouse button).
/*
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
    {
        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            boolean flag = entityplayer.capabilities.isCreativeMode;
            ItemStack itemstack = this.findDart(entityplayer);

            int i = this.getMaxItemUseDuration(stack) - timeLeft;
            i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, entityplayer, i, !itemstack.isEmpty() || flag);
            if (i < 0) return;

            if (!itemstack.isEmpty() || flag)
            {
                if (itemstack.isEmpty())
                {
                    itemstack = new ItemStack(ItemRegistry.dart);
                }

                float f = getArrowVelocity(i);

                if ((double)f >= 0.1D)
                {
                    boolean flag1 = entityplayer.capabilities.isCreativeMode || (itemstack.getItem() instanceof ItemDart);

                    if (!worldIn.isRemote)
                    {
                        ItemDart itemarrow = (ItemDart)(itemstack.getItem() instanceof ItemArrow ? itemstack.getItem() : ItemRegistry.dart);
                        EntityDart entitydart = itemarrow.createDart(worldIn, itemstack, entityplayer);
                        entitydart.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);

                        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0)
                        {
                            entitydart.setFire(100);
                        }

                        stack.damageItem(1, entityplayer);

                    }

                    worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                    if (!flag1 && !entityplayer.capabilities.isCreativeMode)
                    {
                        itemstack.shrink(1);

                        if (itemstack.isEmpty())
                        {
                            entityplayer.inventory.deleteStack(itemstack);
                        }
                    }

                    entityplayer.addStat(StatList.getObjectUseStats(this));
                }
            }
        }
    }
*/

    @Override
    public ItemStack onItemUseFinish(ItemStack itemStack, World world, EntityLivingBase living)
    {
        if (living instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) living;
            boolean flag = player.capabilities.isCreativeMode;
            ItemStack dartStack = this.findDart(player);

                EntityDart dart = new EntityDart(world, player, 1.0F);
                world.playSound(player, player.getPosition(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 2.0F / (0.4F + 1.2F) + 0.5F);
                int slot = -1;

                if (dartStack.isEmpty())
                {
                    dartStack = new ItemStack(ItemRegistry.dart);
                }
                for (int i = 0; i < player.inventory.mainInventory.size(); ++i)
                {
                    if (!player.inventory.mainInventory.get(i).isEmpty() && player.inventory.mainInventory.get(i).getItem() == dartStack.getItem())
                    {
                        if (dartStack.getItem() == ItemRegistry.dart)
                        {
                            dart.setDartType(EntityDart.DartType.dart);
                        }

                        slot = i;
                        break;
                    }
                }
                if (!world.isRemote)
                {
                    world.spawnEntity(dart);
                }
                itemStack.damageItem(1, player);

                if (!player.capabilities.isCreativeMode)
                {
                    dartStack.shrink(1);

                    if (dartStack.isEmpty())
                    {
                        player.inventory.deleteStack(dartStack);
                    }
                }
        }
        return itemStack;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
    {
        boolean flag = !this.findDart(player).isEmpty();
        ItemStack itemStack = player.getHeldItem(hand);

            if (!player.capabilities.isCreativeMode && !flag)
            {
                return new ActionResult<>(EnumActionResult.FAIL, itemStack);
            }
            else
            {
                player.setActiveHand(hand);
                return new ActionResult<>(EnumActionResult.SUCCESS, itemStack);
            }
    }

    private ItemStack findDart(EntityPlayer player)
    {
        if (this.isdart(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
        else if (this.isdart(player.getHeldItem(EnumHand.MAIN_HAND)))
        {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        }
        else
        {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemStack = player.inventory.getStackInSlot(i);

                if (this.isdart(itemStack))
                {
                    return itemStack;
                }
            }
            return ItemStack.EMPTY;
        }
    }

    private boolean isdart(ItemStack itemStack)
    {
        return !itemStack.isEmpty() && (itemStack.getItem() == ItemRegistry.dart);
    }
}