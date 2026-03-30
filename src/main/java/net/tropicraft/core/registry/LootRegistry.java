package net.tropicraft.core.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.tropicraft.Info;

public class LootRegistry extends TropicraftRegistry {

    public static ResourceLocation buriedTreasure;
    public static ResourceLocation sifterRegular;
    public static ResourceLocation sifterHeated;
    public static ResourceLocation sifterRare;

    public static void postInit() {
        buriedTreasure = LootTableList.register(new ResourceLocation(Info.MODID, "buried_treasure"));
        sifterRegular = LootTableList.register(new ResourceLocation(Info.MODID, "sifter_regular"));
        sifterHeated = LootTableList.register(new ResourceLocation(Info.MODID, "sifter_heated"));
        sifterRare = LootTableList.register(new ResourceLocation(Info.MODID, "sifter_rare"));
    }
}
