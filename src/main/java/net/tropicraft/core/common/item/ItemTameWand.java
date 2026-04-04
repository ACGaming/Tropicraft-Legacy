package net.tropicraft.core.common.item;

/*
public class ItemTameWand  extends ItemTropicraft{

    public ItemTameWand() {
        super();
        maxStackSize = 1;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        if (!entityplayer.capabilities.isCreativeMode)
        {
            itemstack.damageItem(1, entityplayer);
            entityplayer.swingArm(EnumHand.MAIN_HAND);
        }
        world.playSound(entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!world.isRemote)
        {
            world.spawnEntity(new EntityTameBall(world, entityplayer));
        }
        return itemstack;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        if (!player.world.isRemote) {
            if (player.isSneaking()) {
                if (!(entity instanceof EntityPlayer)) {
                    if (entity.getRidingEntity() != null) {
                        entity.mountEntity(null);
                    } else {
                        entity.mountEntity(player);
                    }
                }
            } else {
                if (player.getRidingEntity() != null) {
                    player.mountEntity(null);
                } else {
                    player.mountEntity(entity);
                }
            }
        }
        return true;
    }
}*/
