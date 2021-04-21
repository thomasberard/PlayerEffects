package fr.mrflamme26.playereffects.models;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.mrflamme26.playereffects.Main;

public class CircleEffects {
	
	private int taskID;
	private final Player player;
	
	public CircleEffects(Player player) {
		this.player = player;
	}
	
	public void startCircleFlammes() {
		player.playSound(player.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FLAME, first, 0);
				player.getWorld().spawnParticle(Particle.FLAME, second, 0);
			}
			
		}, 0, 1);
	}
}
