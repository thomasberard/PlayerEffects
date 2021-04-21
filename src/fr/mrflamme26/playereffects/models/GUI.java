package fr.mrflamme26.playereffects.models;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class GUI {

	private static Inventory INVAnimations;
	private static Inventory INVCircleEffects;
	private static Inventory INVCrossEffects;
	
	public void register() {
		Inventory menuCircleEffects = Bukkit.createInventory(null, 54, ChatColor.YELLOW + "Particules");
		
		ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN + "Totem");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(0, item);
		
		// Fermer le menu
		item = new ItemStack(Material.BARRIER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "N/A");
		meta.setLore(Arrays.asList(ChatColor.YELLOW + "Désactiver l'effet en cours.", ChatColor.RED + "Fermer le menu des particules."));
		item.setItemMeta(meta);
		menuCircleEffects.setItem(53, item);
		
		setInventoryCircleEffects(menuCircleEffects);
		
		Inventory menuCrossEffects = Bukkit.createInventory(null, 54, ChatColor.YELLOW + "Particules");
		
		item = new ItemStack(Material.BREWING_STAND);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Potions");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(0, item);
		
		item = new ItemStack(Material.LILY_PAD);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Villageois mécontent");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(1, item);
		
		item = new ItemStack(Material.EMERALD);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Villlageois heureux");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(2, item);
		
		item = new ItemStack(Material.TURTLE_HELMET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Bulles");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(3, item);
		
		item = new ItemStack(Material.WHITE_DYE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Nuage");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(4, item);
		
		item = new ItemStack(Material.DEAD_TUBE_CORAL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Crit");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(5, item);
		
		item = new ItemStack(Material.TUBE_CORAL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Crit magique");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(6, item);
		
		item = new ItemStack(Material.DRAGON_HEAD);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Souffle du dragon");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(7, item);
		
		item = new ItemStack(Material.REDSTONE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Redstone");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(8, item);
		
		item = new ItemStack(Material.ENCHANTING_TABLE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Enchantement");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(9, item);
		
		item = new ItemStack(Material.TNT);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Explosion");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(10, item);
		
		item = new ItemStack(Material.LAVA_BUCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coulée de lave");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(11, item);
		
		item = new ItemStack(Material.WATER_BUCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coulée d'eau");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(12, item);
		
		item = new ItemStack(Material.HONEYCOMB);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coulée de miel");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(13, item);
		
		item = new ItemStack(Material.FIREWORK_ROCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Feu d'artifice");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(14, item);
		
		item = new ItemStack(Material.CAMPFIRE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Feu");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(15, item);
		
		item = new ItemStack(Material.SOUL_CAMPFIRE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Feu de l'âme");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(16, item);
		
		// Fermer le menu
		item = new ItemStack(Material.BARRIER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "N/A");
		meta.setLore(Arrays.asList(ChatColor.YELLOW + "Désactiver l'effet en cours.", ChatColor.RED + "Fermer le menu des particules."));
		item.setItemMeta(meta);
		menuCrossEffects.setItem(53, item);
		
		setInventoryCrossEffects(menuCrossEffects);
		
		Inventory menuAnimations = Bukkit.createInventory(null, 9, ChatColor.YELLOW + "Animations");
		
		item = new ItemStack(Material.MELON);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW + "Animation: " + ChatColor.RED + "Croix");
		item.setItemMeta(meta);
		menuAnimations.setItem(0, item);
		
		item = new ItemStack(Material.PUMPKIN);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW + "Animation: " + ChatColor.RED + "Cercle");
		item.setItemMeta(meta);
		menuAnimations.setItem(1, item);
		
		// Fermer le menu
		item = new ItemStack(Material.BARRIER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "N/A");
		meta.setLore(Arrays.asList(ChatColor.YELLOW + "Désactiver l'effet en cours.", ChatColor.RED + "Fermer le menu des particules."));
		item.setItemMeta(meta);
		menuAnimations.setItem(8, item);
		
		setInventoryAnimations(menuAnimations);
	}
	
	public Inventory getInventoryAnimations() {
		return INVAnimations;
	}
	
	public Inventory getInventoryCrossEffects() {
		return INVCrossEffects;
	}
	
	public Inventory getInventoryCircleEffects() {
		return INVCircleEffects;
	}
	
	private void setInventoryCrossEffects(Inventory menuCrossEffects) {
		INVCrossEffects = menuCrossEffects;
	}
	
	private void setInventoryCircleEffects(Inventory menuCircleEffects) {
		INVCircleEffects = menuCircleEffects;
	}
	
	private void setInventoryAnimations(Inventory menuAnimations) {
		INVAnimations = menuAnimations;
	}
	
	public void openInventoryAnimations(Player player) {
		player.openInventory(INVAnimations);
	}
	
	public void openInventoryCrossEffects(Player player) {
		player.openInventory(INVCrossEffects);
	}
	
	public void openInventoryCircleEffects(Player player) {
		player.openInventory(INVCircleEffects);
	}
}
