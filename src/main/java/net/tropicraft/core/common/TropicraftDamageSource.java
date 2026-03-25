package net.tropicraft.core.common;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.tropicraft.core.common.entity.projectile.EntityDart;

public class TropicraftDamageSource extends DamageSource
{
    public TropicraftDamageSource(String damageType)
    {
        super(damageType);
    }
    public static DamageSource causeDartDamage(EntityDart dart, Entity indirectEntity)
    {
        return new EntityDamageSourceIndirect("dart", dart, indirectEntity).setProjectile();
    }
}