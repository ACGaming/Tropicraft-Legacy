package net.tropicraft.core.common.compatibility;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.tropicraft.core.common.config.TropicsConfigs.*;

public class CompatHandler {

    @SubscribeEvent
    public static void preInit() {

        // IF the mod in question is present AND if its respective module is enabled in the configs then also enable its
        // compatibility module.

        if (Loader.isModLoaded("forestry") && enableForestryModule) Forestry.preInit();
        if (Loader.isModLoaded("thermalexpansion") && enableThermalModule) Thermal.preInit();
        //if (Loader.isModLoaded("harvestcraft") && enableHarvestcraftModule) Harvestcraft.preInit();
        //if (Loader.isModLoaded("unlimitedchiselworks") && enableunlimitedchiselworksModule) UnlimitedChiselWorks.preInit();
        if (Loader.isModLoaded("railcraft") && enableRailcraftModule) Railcraft.preInit();
        if (Loader.isModLoaded("immersiveengineering") && enableImmersiveEngineeringModule) ImmersiveEngineering.preInit();

        //if (Loader.isModLoaded("") && enable Module) .preInit();
    }

    public static void init() {
        if (Loader.isModLoaded("forestry") && enableForestryModule) Forestry.init();
        if (Loader.isModLoaded("thermalexpansion") && enableThermalModule) Thermal.init();
        //if (Loader.isModLoaded("harvestcraft") && enableHarvestcraftModule)  Harvestcraft.init();
        //if (Loader.isModLoaded("unlimitedchiselworks") && enableunlimitedchiselworksModule)  UnlimitedChiselWorks.init();
        if (Loader.isModLoaded("railcraft") && enableRailcraftModule)  Railcraft.init();
        if (Loader.isModLoaded("immersiveengineering") && enableImmersiveEngineeringModule)  ImmersiveEngineering.init();

        //if (Loader.isModLoaded("") && enable Module) .initnit();
    }

    public static void postInit() {
        if (Loader.isModLoaded("forestry") && enableForestryModule) Forestry.postInit();
        if (Loader.isModLoaded("thermalexpansion") && enableThermalModule) Thermal.postInit();
        //if (Loader.isModLoaded("harvestcraft") && enableHarvestcraftModule) Harvestcraft.postInit();
        //if (Loader.isModLoaded("unlimitedchiselworks") && enableunlimitedchiselworksModule) UnlimitedChiselWorks.postInit();
        if (Loader.isModLoaded("railcraft") && enableRailcraftModule) Railcraft.postInit();
        if (Loader.isModLoaded("immersiveengineering") && enableImmersiveEngineeringModule) ImmersiveEngineering.postInit();

        //if (Loader.isModLoaded("") && enable Module) .postInit();
    }
}