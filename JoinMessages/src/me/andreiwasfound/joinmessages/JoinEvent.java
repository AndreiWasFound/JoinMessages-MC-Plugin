package me.andreiwasfound.joinmessages;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinEvent implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(ChatColor.AQUA + "Welcome to the server, " + event.getPlayer().getDisplayName());
	}
}
