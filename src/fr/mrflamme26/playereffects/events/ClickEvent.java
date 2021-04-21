package fr.mrflamme26.playereffects.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import fr.mrflamme26.playereffects.models.CircleEffects;
import fr.mrflamme26.playereffects.models.CrossEffects;
import fr.mrflamme26.playereffects.models.GUI;
import fr.mrflamme26.playereffects.models.ParticleData;

public class ClickEvent implements Listener {

	private GUI menu;
	public ClickEvent() {
		menu = new GUI();
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if (event.getInventory().equals(menu.getInventoryAnimations())) {
			
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
			
			switch(event.getSlot()) {
				case 0:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
					menu.openInventoryCrossEffects(player);
					break;
				case 1:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
					menu.openInventoryCircleEffects(player);
					break;
				case 8:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 0);
					player.updateInventory();
					break;
				default:
					break;
			}
		}
		else if (event.getInventory().equals(menu.getInventoryCircleEffects())) {
			
			Player player = (Player) event.getWhoClicked();
			event.setCancelled(true);
			
			if (event.getView().getType() == InventoryType.PLAYER) {
				return;
			}
			
			if (!player.hasPermission("playereffects.circle")) {
				return;
			}
			
			ParticleData particle = new ParticleData(player.getUniqueId());
			
			if (particle.hasID()) {
				particle.endTask();
				particle.removeID();
			}
			
			CircleEffects trails = new CircleEffects(player);
			
			switch(event.getSlot()) {
				case 0:
					trails.startCircleFlammes();
					player.closeInventory();
					player.updateInventory();
					break;
				case 53:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 0);
					player.updateInventory();
					break;
				default:
					break;
			}
		}
		else if (event.getInventory().equals(menu.getInventoryCrossEffects())) {
			
			Player player = (Player) event.getWhoClicked();
			event.setCancelled(true);
			
			if (event.getView().getType() == InventoryType.PLAYER) {
				return;
			}
			
			if (!player.hasPermission("playereffects.cross")) {
				return;
			}
			
			ParticleData particle = new ParticleData(player.getUniqueId());
			
			if (particle.hasID()) {
				particle.endTask();
				particle.removeID();
			}
			
			CrossEffects trails = new CrossEffects(player);
			
			switch(event.getSlot()) {
				case 0:
					trails.startCrossSpellMobAmbient();
					player.closeInventory();
					player.updateInventory();
					break;
				case 1:
					trails.startCrossAngryVillager();
					player.closeInventory();
					player.updateInventory();
					break;
				case 2:
					trails.startCrossHappyVillager();
					player.closeInventory();
					player.updateInventory();
					break;
				case 3:
					trails.startCrossBubble();
					player.closeInventory();
					player.updateInventory();
					break;
				case 4:
					trails.startCrossCloud();
					player.closeInventory();
					player.updateInventory();
					break;
				case 5:
					trails.startCrossCrit();
					player.closeInventory();
					player.updateInventory();
					break;
				case 6:
					trails.startCrossCritMagic();
					player.closeInventory();
					player.updateInventory();
					break;
				case 7:
					trails.startCrossDragonBreath();
					player.closeInventory();
					player.updateInventory();
					break;
				case 8:
					trails.startCrossRedstone();
					player.closeInventory();
					player.updateInventory();
					break;
				case 9:
					trails.startCrossEnchantment();
					player.closeInventory();
					player.updateInventory();
					break;
				case 10:
					trails.startCrossExplosion();
					player.closeInventory();
					player.updateInventory();
					break;
				case 11:
					trails.startCrossFallingLava();
					player.closeInventory();
					player.updateInventory();
					break;
				case 12:
					trails.startCrossFallingWater();
					player.closeInventory();
					player.updateInventory();
					break;
				case 13:
					trails.startCrossFallingHoney();
					player.closeInventory();
					player.updateInventory();
					break;
				case 14:
					trails.startCrossFirework();
					player.closeInventory();
					player.updateInventory();
					break;
				case 15:
					trails.startCrossFlame();
					player.closeInventory();
					player.updateInventory();
					break;
				case 16:
					trails.startCrossSoulFireFlame();
					player.closeInventory();
					player.updateInventory();
					break;
				case 53:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 0);
					player.updateInventory();
					break;
				default:
					break;
			}
		}
	}
}
