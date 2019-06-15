package me.call911.joincommands.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import me.call911.joincommands.JoinCommands;

public class Commands implements Listener {
	private Plugin plugin = JoinCommands.getPlugin(JoinCommands.class);

	@EventHandler

	public void onJoin(PlayerJoinEvent event) {
		plugin.saveDefaultConfig();
		Player player = event.getPlayer();
		if (!player.hasPlayedBefore()) {
			String cmd1 = plugin.getConfig().getString("first-join-command");

			player.performCommand(cmd1);

		} else {

			String cmd2 = plugin.getConfig().getString("command");

			player.performCommand(cmd2);

		}
	}
}
