package fr.mrflamme26.playereffects.models;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.mrflamme26.playereffects.Main;

public class Effects {
	
	private int taskID;
	private final Player player;
	
	public Effects(Player player) {
		this.player = player;
	}
	
	public void startTotem() {
		player.getWorld().playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 5, 1);
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
				second= loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1.5, Math.sin(var + Math.PI));
				
				player.getWorld().spawnParticle(Particle.TOTEM, first, 0);
				player.getWorld().spawnParticle(Particle.TOTEM, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startFlammes() {
		player.getWorld().playSound(player.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 5, 1);
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
				second= loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1.5, Math.sin(var + Math.PI));
				
				player.getWorld().spawnParticle(Particle.FLAME, first, 0);
				player.getWorld().spawnParticle(Particle.FLAME, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCoeurs() {
		player.getWorld().playSound(player.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 5, 1);
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
				second= loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1.5, Math.sin(var + Math.PI));
				
				player.getWorld().spawnParticle(Particle.HEART, first, 0);
				player.getWorld().spawnParticle(Particle.HEART, second, 0);
			}
			
		}, 0, 1);
	}
}
