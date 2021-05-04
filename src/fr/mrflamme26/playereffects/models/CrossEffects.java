package fr.mrflamme26.playereffects.models;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.mrflamme26.playereffects.Main;

public class CrossEffects {
	
	private int taskID;
	private final Player player;
	
	public CrossEffects(Player player) {
		this.player = player;
	}
	
	public void startCrossEffect(Particle particleEffect) {
		player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
			double var = 0;
			Location loc, first, second;
			ParticleData particle = new ParticleData(player.getUniqueId());
			
			@Override
			public void run() {
				if (!particle.hasID()) {
					particle.setID(taskID);
				}
				
				var += Math.PI / 16;
				
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1.5, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1.5, Math.sin(var + Math.PI));
				
				player.getWorld().spawnParticle(particleEffect, first, 0);
				player.getWorld().spawnParticle(particleEffect, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossEffectRedstone() {
		player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
			double var = 0;
			Location loc, first, second;
			ParticleData particle = new ParticleData(player.getUniqueId());
			
			@Override
			public void run() {
				if (!particle.hasID()) {
					particle.setID(taskID);
				}
				
				var += Math.PI / 16;
				
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1.5, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1.5, Math.sin(var + Math.PI));
				
				Particle.DustOptions dust = new Particle.DustOptions(
                        Color.fromRGB((int) 255, (int) 0, (int) 0), 1);
				
				player.getWorld().spawnParticle(Particle.REDSTONE, first, 0, 0, 0, 0, 0, dust);
				player.getWorld().spawnParticle(Particle.REDSTONE, second, 0, 0, 0, 0, 0, dust);
			}
			
		}, 0, 1);
	}
	
	public void startCrossEffectItemCrack(Particle particleEffect, Material materialEffect) {
		player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 5, 0);
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
			double var = 0;
			Location loc, first, second;
			ParticleData particle = new ParticleData(player.getUniqueId());
			
			@Override
			public void run() {
				if (!particle.hasID()) {
					particle.setID(taskID);
				}
				
				var += Math.PI / 16;
				
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1.5, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1.5, Math.sin(var + Math.PI));
				
				ItemStack cookie = new ItemStack(materialEffect);
				
				player.getWorld().spawnParticle(particleEffect, first, 0, 0, 0, 0, 0, cookie);
				player.getWorld().spawnParticle(particleEffect, second, 0, 0, 0, 0, 0, cookie);
			}
			
		}, 0, 1);
	}
}
