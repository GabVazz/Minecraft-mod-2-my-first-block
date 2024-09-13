package com.gab.myfirstblock;

import com.gab.myfirstblock.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyFirstBlock implements ModInitializer {
	public static final String MOD_ID = "my-first-block";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Aggiunto i blocchi delle mods");
		ModBlocks.registraBlocchiMod();
	}
}