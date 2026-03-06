package net.tropicraft.core.common.compatibility;

import forestry.api.core.ForestryAPI;
import forestry.api.fuels.FermenterFuel;
import forestry.api.fuels.FuelManager;
import forestry.api.recipes.RecipeManagers;
import forestry.core.fluids.Fluids;
import forestry.core.items.ItemRegistryCore;
import forestry.core.ModuleCore;
import forestry.modules.ForestryModuleUids;
import forestry.modules.ModuleHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import static net.tropicraft.core.registry.ItemRegistry.*;
import static net.tropicraft.core.registry.BlockRegistry.*;

public class Forestry {

    public static void preInit() {}

    public static void init() {

        // Read if forestry's Factory module is enabled and if so run the code below
        if (ModuleHelper.isEnabled(ForestryModuleUids.FACTORY)) {

            ItemRegistryCore coreItems = ModuleCore.getItems();
            //ItemStack mulch = new ItemStack(coreItems.mulch);

            int seedOilMultiplier = ForestryAPI.activeMode.getIntegerSetting("squeezer.liquid.seed");
            int appleMulchAmount = ForestryAPI.activeMode.getIntegerSetting("squeezer.mulch.apple");
            int appleJuiceAmount = ForestryAPI.activeMode.getIntegerSetting("squeezer.liquid.apple");

            Fluid seedOil = Fluids.SEED_OIL.getFluid();
            Fluid juice = Fluids.JUICE.getFluid();

            // Squeezer recipes

            // Add a recipe that turns coffee beans into 10mb of seed oil in a squeezer
            if (seedOil != null) {
                RecipeManagers.squeezerManager.addRecipe(20, new ItemStack(coffeeBeans, 1, 0), new FluidStack(seedOil, seedOilMultiplier));
            }

            // Add recipes to turn tropicraft's fruits (and pineapple) into fruit juice in a squeezer
            if (juice != null) {
                RecipeManagers.squeezerManager.addRecipe(10, new ItemStack(grapefruit), new FluidStack(juice, 2 * appleJuiceAmount), coreItems.mulch.getItemStack(), 10);
                RecipeManagers.squeezerManager.addRecipe(10, new ItemStack(lemon), new FluidStack(juice, 2 * appleJuiceAmount), coreItems.mulch.getItemStack(), 10);
                RecipeManagers.squeezerManager.addRecipe(10, new ItemStack(lime), new FluidStack(juice, 2 * appleJuiceAmount), coreItems.mulch.getItemStack(), 10);
                RecipeManagers.squeezerManager.addRecipe(10, new ItemStack(orange), new FluidStack(juice, 2 * appleJuiceAmount), coreItems.mulch.getItemStack(), 10);
                RecipeManagers.squeezerManager.addRecipe(10, new ItemStack(pineapple), new FluidStack(juice, 2 * appleJuiceAmount), coreItems.mulch.getItemStack(), 10);
                RecipeManagers.squeezerManager.addRecipe(10, new ItemStack(coconutChunk), new FluidStack(juice, 2 * appleJuiceAmount), coreItems.mulch.getItemStack(), 10);
            }

            // Fermenter fuels

            // Add tropical fertilizer as a valid fuel for the fermenter
            FuelManager.fermenterFuel.put(new ItemStack(fertilizer), new FermenterFuel(new ItemStack(fertilizer),
                    ForestryAPI.activeMode.getIntegerSetting("fermenter.value.fertilizer"),
                    ForestryAPI.activeMode.getIntegerSetting("fermenter.cycles.fertilizer")));

            // Arboretum

            // This is where support for tropicraft's trees to be farmed in a forestry arboretum would go, if I could
            // find the code for it!
        }
    }

    public static void postInit() {}
}