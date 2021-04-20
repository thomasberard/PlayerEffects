package fr.mrflamme26.playereffects.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerEvents implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		
		if (player.getInventory().contains(item())) {
			player.getInventory().remove(item());
			player.getInventory().setItem(2, item());
		}
		else {
			player.getInventory().setItem(2, item());
		}
	}
	
	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		
		Player player = event.getPlayer();
		
		if (player.getInventory().contains(item())) {
			player.getInventory().remove(item());
			player.getInventory().setItem(2, item());
		}
		else {
			player.getInventory().setItem(2, item());
		}
	}
	
	@EventHandler
	public void onPlayerClickEvent(PlayerInteractEvent event) {
		
		Player player = event.getPlayer();
		
		if (player.getInventory().getItemInMainHand().equals(item())) {
			if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK ) {
				if (player.hasPermission("playereffects.item") || player.isOp()) {
					player.playSound(player.getLocation(), Sound.ENTITY_SLIME_JUMP, 5, 1);
					Bukkit.getServer().dispatchCommand(player, "trails");
				}
				else
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cVous n'avez pas la permission d'utiliser cet item."));
			}
		}
	}
	
	public ItemStack item() {

		ItemStack item = new ItemStack(Material.BLAZE_ROD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',"&eMenu des particules"));
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;
	}

}
