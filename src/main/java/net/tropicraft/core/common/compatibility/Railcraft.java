package net.tropicraft.core.common.compatibility;

import mods.railcraft.api.crafting.Crafters;
import mods.railcraft.common.fluids.Fluids;
import mods.railcraft.common.util.crafting.Ingredients;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static net.tropicraft.core.registry.BlockRegistry.bundles;

public class Railcraft {

    public static void preInit() {}

    public static void init() {

        ItemStack BambooBundle = new ItemStack(bundles, 1, 1);
        ItemStack Charcoal = new ItemStack(Items.COAL, 1, 1);

        Crafters.cokeOven().newRecipe(Ingredients.from(BambooBundle))
                .name("tropicraft:bamboo_bundle")
                .output(Charcoal)
                .fluid(Fluids.CREOSOTE.get(50))
                .register();
    }

    public static void postInit() {}
}
