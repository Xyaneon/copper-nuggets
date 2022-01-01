package com.xyaneon.coppernuggets;

import com.xyaneon.coppernuggets.items.CopperNugget;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CopperNuggetsMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("coppernuggets");

    public static final Item COPPER_NUGGET = new CopperNugget(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        LOGGER.info("Copper Nuggets mod initialized.");

        Registry.register(Registry.ITEM, new Identifier("coppernuggets", "copper_nugget"), COPPER_NUGGET);
    }
}
