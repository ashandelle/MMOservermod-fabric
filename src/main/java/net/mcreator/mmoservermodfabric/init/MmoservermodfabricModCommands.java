
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mmoservermodfabric.init;

import net.mcreator.mmoservermodfabric.command.StatsCommand;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

public class MmoservermodfabricModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
			StatsCommand.register(dispatcher);
		});
	}
}
