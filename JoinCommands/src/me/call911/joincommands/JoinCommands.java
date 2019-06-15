package me.call911.joincommands;

import org.bukkit.plugin.java.JavaPlugin;

import me.call911.joincommands.Events.Commands;
import net.md_5.bungee.api.ChatColor;

public class JoinCommands extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "Made by call911");
		getServer().getPluginManager().registerEvents(new Commands(), this);
		saveDefaultConfig();
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Made by call911");
	}
}