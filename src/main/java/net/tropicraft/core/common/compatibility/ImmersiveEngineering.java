package net.tropicraft.core.common.compatibility;

import blusunrize.immersiveengineering.api.crafting.CokeOvenRecipe;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static net.tropicraft.core.registry.BlockRegistry.bundles;

public class ImmersiveEngineering {

    public static void preInit() {}

    public static void init() {

        ItemStack BambooBundle = new ItemStack(bundles, 1, 1);
        ItemStack Charcoal = new ItemStack(Items.COAL, 1, 1);

        CokeOvenRecipe.addRecipe(Charcoal, BambooBundle, 380, 50);
    }

    public static void postInit() {}

}
