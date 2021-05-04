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

public class CircleEffects {
	
	private int taskID;
	private final Player player;
	
	public CircleEffects(Player player) {
		this.player = player;
	}
	
	public void startCircleEffect(Particle particleEffect) {
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
				first = loc.clone().add(Math.cos(var) * 0.5, 2.25, Math.sin(var) * 0.5);
				second = loc.clone().add(Math.cos(var + Math.PI) * 0.5, 2.25, Math.sin(var + Math.PI) * 0.5);
				
				player.getWorld().spawnParticle(particleEffect, first, 0);
				player.getWorld().spawnParticle(particleEffect, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCircleEffectRedstone() {
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
				first = loc.clone().add(Math.cos(var) * 0.5, 2.25, Math.sin(var) * 0.5);
				second = loc.clone().add(Math.cos(var + Math.PI) * 0.5, 2.25, Math.sin(var + Math.PI) * 0.5);
				
				Particle.DustOptions dust = new Particle.DustOptions(
                        Color.fromRGB((int) 255, (int) 0, (int) 0), 1);
				
				player.getWorld().spawnParticle(Particle.REDSTONE, first, 0, 0, 0, 0, 0, dust);
				player.getWorld().spawnParticle(Particle.REDSTONE, second, 0, 0, 0, 0, 0, dust);
			}
			
		}, 0, 1);
	}
	
	public void startCircleEffectItemCrack(Particle particleEffect, Material materialEffect) {
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
				first = loc.clone().add(Math.cos(var) * 0.5, 2.25, Math.sin(var) * 0.5);
				second = loc.clone().add(Math.cos(var + Math.PI) * 0.5, 2.25, Math.sin(var + Math.PI) * 0.5);
				
ItemStack cookie = new ItemStack(materialEffect);
				
				player.getWorld().spawnParticle(particleEffect, first, 0, 0, 0, 0, 0, cookie);
				player.getWorld().spawnParticle(particleEffect, second, 0, 0, 0, 0, 0, cookie);
			}
			
		}, 0, 1);
	}
}
