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
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LogManager.getLogger("coppernuggets");

    public static final Item COPPER_NUGGET = new CopperNugget(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Copper Nuggets mod initialized.");

        Registry.register(Registry.ITEM, new Identifier("coppernuggets", "copper_nugget"), COPPER_NUGGET);
    }
}