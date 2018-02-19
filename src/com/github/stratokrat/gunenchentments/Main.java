/**
 * 
 */
package com.github.stratokrat.gunenchentments;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.*;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * @author Sven
 *
 */
public class Main extends JavaPlugin implements Listener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {
		saveConfig();
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onCraft(PrepareItemCraftEvent e) {
		String activeRecipe = e.getRecipe().toString();
		
		// check recipe
		switch(activeRecipe) {
		case "":
			return;
		}
		
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onEnchant(PrepareItemEnchantEvent e) {
		
	}
	// Ammunition
	

}
