package net.tropicraft.core.common.entity.projectile;

import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
/*
public class EntityLeafBall extends EntityThrowable implements IProjectile {

    public EntityLeafBall(World world) {
        super(world);
    }

    public EntityLeafBall(World world, EntityPlayer player) {
        super(world, player);
    }

    @Override
    protected void onImpact(RayTraceResult mop) {
        if (mop.entityHit != null) {
            if (mop.entityHit instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)mop.entityHit;
                player.addPotionEffect(new PotionEffect(MobEffects.POISON, 12 * 20, 0));
                this.setDead();
            }
        }
    }
}
*/