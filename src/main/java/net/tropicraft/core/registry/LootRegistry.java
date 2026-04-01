package net.tropicraft.core.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.tropicraft.Info;

public class LootRegistry extends TropicraftRegistry {

    // Chests

    public static ResourceLocation buriedTreasure;
    public static ResourceLocation sunkenShip;
    public static ResourceLocation teleporterChest;
    public static ResourceLocation homeTree;

    // Sifter

    public static ResourceLocation sifterRegular;
    public static ResourceLocation sifterHeated;
    public static ResourceLocation sifterRare;

    // Mobs

    public static ResourceLocation eih;
    public static ResourceLocation iguana;
    public static ResourceLocation tropiSpider;

    public static ResourceLocation treeFrogGreen;
    public static ResourceLocation treeFrogRed;
    public static ResourceLocation treeFrogBlue;
    public static ResourceLocation treeFrogYellow;

    //public static ResourceLocation ;

    public static void postInit() {

        // Chests

        buriedTreasure = LootTableList.register(new ResourceLocation(Info.MODID, "chests/buried_treasure"));
        sunkenShip = LootTableList.register(new ResourceLocation(Info.MODID, "chests/sunken_ship"));
        teleporterChest = LootTableList.register(new ResourceLocation(Info.MODID, "chests/teleporter_chest"));
        homeTree = LootTableList.register(new ResourceLocation(Info.MODID, "chests/home_tree"));

        // Sifter

        sifterRegular = LootTableList.register(new ResourceLocation(Info.MODID, "sifter/sifter_regular"));
        sifterHeated = LootTableList.register(new ResourceLocation(Info.MODID, "sifter/sifter_heated"));
        sifterRare = LootTableList.register(new ResourceLocation(Info.MODID, "sifter/sifter_rare"));

        // Mobs

        eih = LootTableList.register(new ResourceLocation(Info.MODID, "entities/eih"));
        iguana = LootTableList.register(new ResourceLocation(Info.MODID, "entities/iguana"));
        tropiSpider = LootTableList.register(new ResourceLocation(Info.MODID, "entities/tropi_spider"));

        treeFrogGreen = LootTableList.register(new ResourceLocation(Info.MODID, "entities/tree_frog_green"));
        treeFrogRed = LootTableList.register(new ResourceLocation(Info.MODID, "entities/tree_frog_red"));
        treeFrogBlue = LootTableList.register(new ResourceLocation(Info.MODID, "entities/tree_frog_blue"));
        treeFrogYellow = LootTableList.register(new ResourceLocation(Info.MODID, "entities/tree_frog_yellow"));

        // = LootTableList.register(new ResourceLocation(Info.MODID, "entities/"));
    }
}
