package fr.mrflamme26.playereffects.models;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class GUI {

	private static Inventory INV;
	
	public void register() {
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.YELLOW + "Particules");
		
		ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN + "Totem");
		item.setItemMeta(meta);
		inv.setItem(0, item);
		
		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW + "Flammes");
		item.setItemMeta(meta);
		inv.setItem(1, item);

		item = new ItemStack(Material.BEETROOT);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "Coeurs");
		item.setItemMeta(meta);
		inv.setItem(2, item);

		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "FLAMME");
		item.setItemMeta(meta);
		inv.setItem(3, item);

		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "FLAMME");
		item.setItemMeta(meta);
		inv.setItem(4, item);

		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "FLAMME");
		item.setItemMeta(meta);
		inv.setItem(5, item);

		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "FLAMME");
		item.setItemMeta(meta);
		inv.setItem(6, item);

		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "FLAMME");
		item.setItemMeta(meta);
		inv.setItem(7, item);

		item = new ItemStack(Material.BLAZE_POWDER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED + "FLAMME");
		item.setItemMeta(meta);
		inv.setItem(8, item);
		
		setInventory(inv);
	}
	
	public Inventory getInventory() {
		return INV;
	}
	
	private void setInventory(Inventory inv) {
		INV = inv;
	}
	
	public void openInventory(Player player) {
		player.openInventory(INV);
	}
}
