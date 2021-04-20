package fr.mrflamme26.playereffects.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import fr.mrflamme26.playereffects.models.Effects;
import fr.mrflamme26.playereffects.models.GUI;
import fr.mrflamme26.playereffects.models.ParticleData;

public class ClickEvent implements Listener {

	private GUI menu;
	public ClickEvent() {
		menu = new GUI();
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if (!event.getInventory().equals(menu.getInventory())) {
			return;
		}
		
		Player player = (Player) event.getWhoClicked();
		event.setCancelled(true);
		
		if (event.getView().getType() == InventoryType.PLAYER) {
			return;
		}
		
		ParticleData particle = new ParticleData(player.getUniqueId());
		
		if (particle.hasID()) {
			particle.endTask();
			particle.removeID();
		}
		
		Effects trails = new Effects(player);
		
		switch(event.getSlot()) {
		case 0:
			trails.startTotem();
			player.closeInventory();
			player.updateInventory();
			break;
		case 1:
			if (player.hasPermission("playereffects.effect.flammes")) {
				trails.startFlammes();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 2:
			if (player.hasPermission("playereffects.effect.coeurs")) {
				trails.startCoeurs();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 3:
			if (player.hasPermission("playereffects.effect.totem")) {
				trails.startTotem();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 4:
			if (player.hasPermission("playereffects.effect.totem")) {
				trails.startTotem();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 5:
			if (player.hasPermission("playereffects.effect.totem")) {
				trails.startTotem();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 6:
			if (player.hasPermission("playereffects.effect.totem")) {
				trails.startTotem();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 7:
			if (player.hasPermission("playereffects.effect.totem")) {
				trails.startTotem();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		case 8:
			if (player.hasPermission("playereffects.effect.totem")) {
				trails.startTotem();
				player.closeInventory();
				player.updateInventory();
			}
			else {
				player.closeInventory();
				player.updateInventory();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
			}
			break;
		default:
			break;
		}
	}
}
