package me.andreiwasfound.joinmessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.clip.placeholderapi.PlaceholderAPI;

public class PAPIJoinEvent implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		String joinText = "%player_name% &ajoined the server!" + " He/she is rank &f%vault_rank%";
		
		joinText = PlaceholderAPI.setPlaceholders(event.getPlayer(), joinText);
		
		event.setJoinMessage(joinText);
	}
}
