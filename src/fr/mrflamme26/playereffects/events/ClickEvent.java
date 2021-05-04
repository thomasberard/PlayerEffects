package fr.mrflamme26.playereffects.events;

import org.bukkit.Material;
import org.bukkit.Particle;
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
					player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
					menu.openInventoryCrossEffects(player);
					break;
				case 1:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
					menu.openInventoryCircleEffects(player);
					break;
				case 8:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
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
				trails.startCircleEffect(Particle.SPELL_MOB_AMBIENT);
				player.closeInventory();
				player.updateInventory();
				break;
			case 1:
				trails.startCircleEffect(Particle.VILLAGER_ANGRY);
				player.closeInventory();
				player.updateInventory();
				break;
			case 2:
				trails.startCircleEffect(Particle.VILLAGER_HAPPY);
				player.closeInventory();
				player.updateInventory();
				break;
			case 3:
				trails.startCircleEffect(Particle.BUBBLE_POP);
				player.closeInventory();
				player.updateInventory();
				break;
			case 4:
				trails.startCircleEffect(Particle.CLOUD);
				player.closeInventory();
				player.updateInventory();
				break;
			case 5:
				trails.startCircleEffect(Particle.CRIT);
				player.closeInventory();
				player.updateInventory();
				break;
			case 6:
				trails.startCircleEffect(Particle.CRIT_MAGIC);
				player.closeInventory();
				player.updateInventory();
				break;
			case 7:
				trails.startCircleEffect(Particle.DRAGON_BREATH);
				player.closeInventory();
				player.updateInventory();
				break;
			case 8:
				trails.startCircleEffectRedstone();
				player.closeInventory();
				player.updateInventory();
				break;
			case 9:
				trails.startCircleEffect(Particle.ENCHANTMENT_TABLE);
				player.closeInventory();
				player.updateInventory();
				break;
			case 10:
				trails.startCircleEffect(Particle.EXPLOSION_NORMAL);
				player.closeInventory();
				player.updateInventory();
				break;
			case 11:
				trails.startCircleEffect(Particle.FALLING_LAVA);
				player.closeInventory();
				player.updateInventory();
				break;
			case 12:
				trails.startCircleEffect(Particle.FALLING_WATER);
				player.closeInventory();
				player.updateInventory();
				break;
			case 13:
				trails.startCircleEffect(Particle.FALLING_HONEY);
				player.closeInventory();
				player.updateInventory();
				break;
			case 14:
				trails.startCircleEffect(Particle.FIREWORKS_SPARK);
				player.closeInventory();
				player.updateInventory();
				break;
			case 15:
				trails.startCircleEffect(Particle.FLAME);
				player.closeInventory();
				player.updateInventory();
				break;
			case 16:
				trails.startCircleEffect(Particle.SOUL_FIRE_FLAME);
				player.closeInventory();
				player.updateInventory();
				break;
			case 17:
				trails.startCircleEffect(Particle.FLASH);
				player.closeInventory();
				player.updateInventory();
				break;
			case 18:
				trails.startCircleEffect(Particle.SQUID_INK);
				player.closeInventory();
				player.updateInventory();
				break;
			case 19:
				trails.startCircleEffect(Particle.HEART);
				player.closeInventory();
				player.updateInventory();
				break;
			case 20:
				trails.startCircleEffect(Particle.SPELL_INSTANT);
				player.closeInventory();
				player.updateInventory();
				break;
			case 21:
				trails.startCircleEffectItemCrack(Particle.ITEM_CRACK, Material.COOKIE);
				player.closeInventory();
				player.updateInventory();
				break;
			case 22:
				trails.startCircleEffect(Particle.SLIME);
				player.closeInventory();
				player.updateInventory();
				break;
			case 23:
				trails.startCircleEffect(Particle.SNOWBALL);
				player.closeInventory();
				player.updateInventory();
				break;
			case 24:
				trails.startCircleEffect(Particle.SMOKE_NORMAL);
				player.closeInventory();
				player.updateInventory();
				break;
			case 25:
				trails.startCircleEffect(Particle.LAVA);
				player.closeInventory();
				player.updateInventory();
				break;
			case 26:
				trails.startCircleEffect(Particle.NAUTILUS);
				player.closeInventory();
				player.updateInventory();
				break;
			case 27:
				trails.startCircleEffect(Particle.NOTE);
				player.closeInventory();
				player.updateInventory();
				break;
			case 28:
				trails.startCircleEffect(Particle.PORTAL);
				player.closeInventory();
				player.updateInventory();
				break;
			case 29:
				trails.startCircleEffect(Particle.SNEEZE);
				player.closeInventory();
				player.updateInventory();
				break;
			case 30:
				trails.startCircleEffect(Particle.SOUL);
				player.closeInventory();
				player.updateInventory();
				break;
			case 31:
				trails.startCircleEffect(Particle.TOTEM);
				player.closeInventory();
				player.updateInventory();
				break;
			case 32:
				trails.startCircleEffect(Particle.SPELL_WITCH);
				player.closeInventory();
				player.updateInventory();
				break;
			case 53:
				player.closeInventory();
				player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
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
					trails.startCrossEffect(Particle.SPELL_MOB_AMBIENT);
					player.closeInventory();
					player.updateInventory();
					break;
				case 1:
					trails.startCrossEffect(Particle.VILLAGER_ANGRY);
					player.closeInventory();
					player.updateInventory();
					break;
				case 2:
					trails.startCrossEffect(Particle.VILLAGER_HAPPY);
					player.closeInventory();
					player.updateInventory();
					break;
				case 3:
					trails.startCrossEffect(Particle.BUBBLE_POP);
					player.closeInventory();
					player.updateInventory();
					break;
				case 4:
					trails.startCrossEffect(Particle.CLOUD);
					player.closeInventory();
					player.updateInventory();
					break;
				case 5:
					trails.startCrossEffect(Particle.CRIT);
					player.closeInventory();
					player.updateInventory();
					break;
				case 6:
					trails.startCrossEffect(Particle.CRIT_MAGIC);
					player.closeInventory();
					player.updateInventory();
					break;
				case 7:
					trails.startCrossEffect(Particle.DRAGON_BREATH);
					player.closeInventory();
					player.updateInventory();
					break;
				case 8:
					trails.startCrossEffectRedstone();
					player.closeInventory();
					player.updateInventory();
					break;
				case 9:
					trails.startCrossEffect(Particle.ENCHANTMENT_TABLE);
					player.closeInventory();
					player.updateInventory();
					break;
				case 10:
					trails.startCrossEffect(Particle.EXPLOSION_NORMAL);
					player.closeInventory();
					player.updateInventory();
					break;
				case 11:
					trails.startCrossEffect(Particle.FALLING_LAVA);
					player.closeInventory();
					player.updateInventory();
					break;
				case 12:
					trails.startCrossEffect(Particle.FALLING_WATER);
					player.closeInventory();
					player.updateInventory();
					break;
				case 13:
					trails.startCrossEffect(Particle.FALLING_HONEY);
					player.closeInventory();
					player.updateInventory();
					break;
				case 14:
					trails.startCrossEffect(Particle.FIREWORKS_SPARK);
					player.closeInventory();
					player.updateInventory();
					break;
				case 15:
					trails.startCrossEffect(Particle.FLAME);
					player.closeInventory();
					player.updateInventory();
					break;
				case 16:
					trails.startCrossEffect(Particle.SOUL_FIRE_FLAME);
					player.closeInventory();
					player.updateInventory();
					break;
				case 17:
					trails.startCrossEffect(Particle.FLASH);
					player.closeInventory();
					player.updateInventory();
					break;
				case 18:
					trails.startCrossEffect(Particle.SQUID_INK);
					player.closeInventory();
					player.updateInventory();
					break;
				case 19:
					trails.startCrossEffect(Particle.HEART);
					player.closeInventory();
					player.updateInventory();
					break;
				case 20:
					trails.startCrossEffect(Particle.SPELL_INSTANT);
					player.closeInventory();
					player.updateInventory();
					break;
				case 21:
					trails.startCrossEffectItemCrack(Particle.ITEM_CRACK, Material.COOKIE);
					player.closeInventory();
					player.updateInventory();
					break;
				case 22:
					trails.startCrossEffect(Particle.SLIME);
					player.closeInventory();
					player.updateInventory();
					break;
				case 23:
					trails.startCrossEffect(Particle.SNOWBALL);
					player.closeInventory();
					player.updateInventory();
					break;
				case 24:
					trails.startCrossEffect(Particle.SMOKE_NORMAL);
					player.closeInventory();
					player.updateInventory();
					break;
				case 25:
					trails.startCrossEffect(Particle.LAVA);
					player.closeInventory();
					player.updateInventory();
					break;
				case 26:
					trails.startCrossEffect(Particle.NAUTILUS);
					player.closeInventory();
					player.updateInventory();
					break;
				case 27:
					trails.startCrossEffect(Particle.NOTE);
					player.closeInventory();
					player.updateInventory();
					break;
				case 28:
					trails.startCrossEffect(Particle.PORTAL);
					player.closeInventory();
					player.updateInventory();
					break;
				case 29:
					trails.startCrossEffect(Particle.SNEEZE);
					player.closeInventory();
					player.updateInventory();
					break;
				case 30:
					trails.startCrossEffect(Particle.SOUL);
					player.closeInventory();
					player.updateInventory();
					break;
				case 31:
					trails.startCrossEffect(Particle.TOTEM);
					player.closeInventory();
					player.updateInventory();
					break;
				case 32:
					trails.startCrossEffect(Particle.SPELL_WITCH);
					player.closeInventory();
					player.updateInventory();
					break;
				case 53:
					player.closeInventory();
					player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
					player.updateInventory();
					break;
				default:
					break;
			}
		}
	}
}
