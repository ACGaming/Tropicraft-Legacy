package net.tropicraft.core.client.entity.render;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tropicraft.core.common.entity.projectile.EntityDart;

@SideOnly(Side.CLIENT)
public class RenderDart extends RenderArrow<EntityDart> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("tropicraft:textures/entity/dart.png");

    public RenderDart(RenderManager manager) {
        super(manager);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityDart entity) {
        return RenderDart.TEXTURE;
    }
}
