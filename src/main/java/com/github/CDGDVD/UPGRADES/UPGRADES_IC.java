package com.github.CDGDVD.UPGRADES;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UPGRADES_IC implements ModInitializer {

    public static Item EMERALD_SWORD = new Item(new Item.Settings().group(ItemGroup.COMBAT));

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "upgradesmod";
    public static final String MOD_NAME = "UPGRADES!";

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("upgradesmod", "data/upgradesmod/recipes/emerald_sword.json"), new SwordBase(new ToolMaterialDiamond()));
        log(Level.INFO, "Initializing");
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}
