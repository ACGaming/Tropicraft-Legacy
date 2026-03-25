package net.tropicraft.core.client.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelDart extends ModelBase
{
    private final ModelRenderer dart;

    public ModelDart()
    {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.dart = new ModelRenderer(this, 0, 0);
        this.dart.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dart.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
    }

    public void renderDart()
    {
        this.dart.render(0.0625F);
    }
}