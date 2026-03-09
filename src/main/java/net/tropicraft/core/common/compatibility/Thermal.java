package net.tropicraft.core.common.compatibility;

import cofh.core.util.helpers.ItemHelper;
import cofh.thermalexpansion.util.managers.machine.InsolatorManager;
import cofh.thermalexpansion.util.managers.machine.ExtruderManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

import static net.tropicraft.core.registry.BlockRegistry.*;
import static net.tropicraft.core.registry.ItemRegistry.*;

public class Thermal {

    public static void preInit() {}

    public static void init() {
        {
            // Phytogenic Insolator

            ItemStack Pineapple = new ItemStack(pineapple);
            ItemStack Iris = new ItemStack(iris);
            ItemStack Bamboo = new ItemStack(bambooShoot);
            ItemStack Coconut = new ItemStack(coconut);

            InsolatorManager.addDefaultRecipe(Pineapple, ItemHelper.cloneStack(Pineapple, 2), ItemStack.EMPTY, 0);
            InsolatorManager.addDefaultRecipe(Iris, ItemHelper.cloneStack(Iris, 2), ItemStack.EMPTY, 0);
            InsolatorManager.addDefaultRecipe(Coconut, ItemHelper.cloneStack(Coconut, 2), ItemStack.EMPTY, 0);

            // Only load the recipe below IF thermal expansion is present but not harvestcraft as it conflicts with its bamboo shoots.
            if (!Loader.isModLoaded("harvestcraft")) {
                InsolatorManager.addDefaultRecipe(Bamboo, ItemHelper.cloneStack(Bamboo, 2), ItemStack.EMPTY, 0);
            }

            // Phytogenic Insolator tree augment

            ItemStack PalmSapling = new ItemStack(saplings,1, 0);
            ItemStack MahoganySapling = new ItemStack(saplings, 1, 1);
            ItemStack GrapefruitSapling= new ItemStack(saplings, 1, 2);
            ItemStack LemonSapling= new ItemStack(saplings, 1, 3);
            ItemStack LimeSapling= new ItemStack(saplings, 1, 4);
            ItemStack OrangeSapling= new ItemStack(saplings, 1, 5);

            ItemStack PalmLog = new ItemStack(logs, 1, 1);
            ItemStack MahoganyLog = new ItemStack(logs, 1, 0);

            InsolatorManager.addDefaultTreeRecipe(4800, PalmSapling, ItemHelper.cloneStack(PalmLog, 6), PalmSapling, 100);
            InsolatorManager.addDefaultTreeRecipe(4800, MahoganySapling, ItemHelper.cloneStack(MahoganyLog, 6), MahoganySapling, 100);

            InsolatorManager.addDefaultTreeRecipe(4800, GrapefruitSapling, new ItemStack(grapefruit, 4), GrapefruitSapling, 100);
            InsolatorManager.addDefaultTreeRecipe(4800, LemonSapling, new ItemStack(lemon, 4), LemonSapling, 100);
            InsolatorManager.addDefaultTreeRecipe(4800, LimeSapling, new ItemStack(lime, 4), LimeSapling, 100);
            InsolatorManager.addDefaultTreeRecipe(4800, OrangeSapling, new ItemStack(orange, 4), OrangeSapling, 100);

            // Igneous Extruder
            ExtruderManager.addRecipeIgneous(800, new ItemStack(chunk), new FluidStack(FluidRegistry.LAVA, 0), new FluidStack(FluidRegistry.WATER, Fluid.BUCKET_VOLUME));

            // Igneous Extruder sedimentary
            ExtruderManager.addRecipeSedimentary(3200, new ItemStack(sands, 1, 0), new FluidStack(FluidRegistry.LAVA, 0), new FluidStack(FluidRegistry.WATER, 1500));
            ExtruderManager.addRecipeSedimentary(3200, new ItemStack(sands, 1, 1), new FluidStack(FluidRegistry.LAVA, 0), new FluidStack(FluidRegistry.WATER, 1500));
            ExtruderManager.addRecipeSedimentary(3200, new ItemStack(sands, 1, 2), new FluidStack(FluidRegistry.LAVA, 0), new FluidStack(FluidRegistry.WATER, 1500));
            ExtruderManager.addRecipeSedimentary(3200, new ItemStack(sands, 1, 3), new FluidStack(FluidRegistry.LAVA, 0), new FluidStack(FluidRegistry.WATER, 1500));
        }
    }

    public static void postInit() {}
}