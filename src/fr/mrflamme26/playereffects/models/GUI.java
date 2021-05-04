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
		
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Potions");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(0, item);
		
		item = new ItemStack(Material.LILY_PAD);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Villageois mécontent");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(1, item);
		
		item = new ItemStack(Material.EMERALD);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Villlageois heureux");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(2, item);
		
		item = new ItemStack(Material.TURTLE_HELMET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Bulles");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(3, item);
		
		item = new ItemStack(Material.WHITE_DYE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Nuage");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(4, item);
		
		item = new ItemStack(Material.DEAD_TUBE_CORAL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Crit");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(5, item);
		
		item = new ItemStack(Material.TUBE_CORAL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Crit magique");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(6, item);
		
		item = new ItemStack(Material.DRAGON_HEAD);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Souffle du dragon");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(7, item);
		
		item = new ItemStack(Material.REDSTONE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Poussière de redstone");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(8, item);
		
		item = new ItemStack(Material.ENCHANTING_TABLE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Enchantement");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(9, item);
		
		item = new ItemStack(Material.TNT);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Explosion");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(10, item);
		
		item = new ItemStack(Material.LAVA_BUCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coulée de lave");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(11, item);
		
		item = new ItemStack(Material.WATER_BUCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coulée d'eau");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(12, item);
		
		item = new ItemStack(Material.HONEYCOMB);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coulée de miel");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(13, item);
		
		item = new ItemStack(Material.FIREWORK_ROCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Feu d'artifice");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(14, item);
		
		item = new ItemStack(Material.CAMPFIRE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Feu");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(15, item);
		
		item = new ItemStack(Material.SOUL_CAMPFIRE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Feu de l'âme");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(16, item);
		
		item = new ItemStack(Material.BEACON);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Flash");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(17, item);
		
		item = new ItemStack(Material.INK_SAC);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Encre de seiche");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(18, item);
		
		item = new ItemStack(Material.BEETROOT);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coeurs");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(19, item);
		
		item = new ItemStack(Material.SPLASH_POTION);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Instant magique");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(20, item);
		
		item = new ItemStack(Material.COOKIE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Cookie");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(21, item);
		
		item = new ItemStack(Material.SLIME_BALL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Slime");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(22, item);
		
		item = new ItemStack(Material.SNOWBALL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Boule de neige");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(23, item);
		
		item = new ItemStack(Material.COAL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Fumée");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(24, item);
		
		item = new ItemStack(Material.FLINT_AND_STEEL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Eclaboussure de lave");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(25, item);
		
		item = new ItemStack(Material.NAUTILUS_SHELL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Nautilus");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(26, item);
		
		item = new ItemStack(Material.JUKEBOX);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Note de musique");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(27, item);
		
		item = new ItemStack(Material.CRYING_OBSIDIAN);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Portail du Nether");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(28, item);
		
		item = new ItemStack(Material.SCUTE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Eternuement");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(29, item);
		
		item = new ItemStack(Material.SOUL_SAND);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Âme");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(30, item);
		
		item = new ItemStack(Material.TOTEM_OF_UNDYING);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Totem de l'immortalité");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(31, item);
		
		item = new ItemStack(Material.BEETROOT_SOUP);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Sortilège");
		item.setItemMeta(meta);
		menuCircleEffects.setItem(32, item);
		
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
		meta.setDisplayName(ChatColor.GOLD + "Poussière de redstone");
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
		
		item = new ItemStack(Material.BEACON);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Flash");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(17, item);
		
		item = new ItemStack(Material.INK_SAC);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Encre de seiche");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(18, item);
		
		item = new ItemStack(Material.BEETROOT);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Coeurs");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(19, item);
		
		item = new ItemStack(Material.SPLASH_POTION);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Instant magique");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(20, item);
		
		item = new ItemStack(Material.COOKIE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Cookie");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(21, item);
		
		item = new ItemStack(Material.SLIME_BALL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Slime");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(22, item);
		
		item = new ItemStack(Material.SNOWBALL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Boule de neige");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(23, item);
		
		item = new ItemStack(Material.COAL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Fumée");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(24, item);
		
		item = new ItemStack(Material.FLINT_AND_STEEL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Eclaboussure de lave");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(25, item);
		
		item = new ItemStack(Material.NAUTILUS_SHELL);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Nautilus");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(26, item);
		
		item = new ItemStack(Material.JUKEBOX);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Note de musique");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(27, item);
		
		item = new ItemStack(Material.CRYING_OBSIDIAN);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Portail du Nether");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(28, item);
		
		item = new ItemStack(Material.SCUTE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Eternuement");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(29, item);
		
		item = new ItemStack(Material.SOUL_SAND);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Âme");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(30, item);
		
		item = new ItemStack(Material.TOTEM_OF_UNDYING);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Totem de l'immortalité");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(31, item);
		
		item = new ItemStack(Material.BEETROOT_SOUP);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Sortilège");
		item.setItemMeta(meta);
		menuCrossEffects.setItem(32, item);
		
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
