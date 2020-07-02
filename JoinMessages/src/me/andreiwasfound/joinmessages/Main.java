package me.andreiwasfound.joinmessages;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		
		if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null)
			this.getServer().getPluginManager().registerEvents(new PAPIJoinEvent(), this);
		else
			this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);	

	}
	
	@Override
	public void onDisable() {
		
	}
}
