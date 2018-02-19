package com.github.stratokrat.gunenchentments;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class Recipes extends JavaPlugin {
	
	// ItemStacks definieren
	ItemStack eisenPatroneItemStack = new ItemStack();
	
	// Rezepte definieren
	ShapedRecipe eisenPatroneRecipe = new ShapedRecipe(eisenPatroneItemStack);
	
}
