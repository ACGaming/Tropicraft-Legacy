package net.tropicraft.core.common.compatibility;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.tileentities.MarketData;
import com.pam.harvestcraft.tileentities.MarketItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static net.tropicraft.core.registry.BlockRegistry.*;

public class Harvestcraft extends MarketItems{

    public static void preInit() {}

    public static void init() {

        // Market

        // Does nothing
        new MarketData(new ItemStack(saplings, 1, 0), new ItemStack(Items.EMERALD), HarvestCraft.config.marketsaplingPrice);

        // Shipping Bin
    }

    public static void postInit() {}
}