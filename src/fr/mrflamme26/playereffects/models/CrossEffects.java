package fr.mrflamme26.playereffects.models;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.mrflamme26.playereffects.Main;

public class CrossEffects {
	
	private int taskID;
	private final Player player;
	
	public CrossEffects(Player player) {
		this.player = player;
	}
	
	public void startCrossSpellMobAmbient() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SPELL_MOB_AMBIENT, first, 0);
				player.getWorld().spawnParticle(Particle.SPELL_MOB_AMBIENT, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossAngryVillager() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, first, 0);
				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossHappyVillager() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 0);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossBubble() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, first, 0);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossCloud() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.CLOUD, first, 0);
				player.getWorld().spawnParticle(Particle.CLOUD, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossCrit() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.CRIT, first, 0);
				player.getWorld().spawnParticle(Particle.CRIT, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossCritMagic() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, first, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossDragonBreath() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.DRAGON_BREATH, first, 0);
				player.getWorld().spawnParticle(Particle.DRAGON_BREATH, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossRedstone() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
	
	public void startCrossEnchantment() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, first, 0);
				player.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossExplosion() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, first, 0);
				player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossFallingLava() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, first, 0);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossFallingWater() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FALLING_WATER, first, 0);
				player.getWorld().spawnParticle(Particle.FALLING_WATER, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossFallingHoney() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FALLING_HONEY, first, 0);
				player.getWorld().spawnParticle(Particle.FALLING_HONEY, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossFirework() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, first, 0);
				player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossFlame() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FLAME, first, 0);
				player.getWorld().spawnParticle(Particle.FLAME, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossFlash() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.FLASH, first, 0);
				player.getWorld().spawnParticle(Particle.FLASH, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSquidInk() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SQUID_INK, first, 0);
				player.getWorld().spawnParticle(Particle.SQUID_INK, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossHeart() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.HEART, first, 0);
				player.getWorld().spawnParticle(Particle.HEART, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSpellInstant() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SPELL_INSTANT, first, 0);
				player.getWorld().spawnParticle(Particle.SPELL_INSTANT, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossItemCrack() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.ITEM_CRACK, first, 0);
				player.getWorld().spawnParticle(Particle.ITEM_CRACK, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSlime() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SLIME, first, 0);
				player.getWorld().spawnParticle(Particle.SLIME, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSnowball() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SNOWBALL, first, 0);
				player.getWorld().spawnParticle(Particle.SNOWBALL, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSmoke() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SMOKE_NORMAL, first, 0);
				player.getWorld().spawnParticle(Particle.SMOKE_NORMAL, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossLava() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.LAVA, first, 0);
				player.getWorld().spawnParticle(Particle.LAVA, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossNautilus() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.NAUTILUS, first, 0);
				player.getWorld().spawnParticle(Particle.NAUTILUS, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossNote() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.NOTE, first, 0);
				player.getWorld().spawnParticle(Particle.NOTE, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossPortal() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.PORTAL, first, 0);
				player.getWorld().spawnParticle(Particle.PORTAL, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSneeze() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSoul() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SOUL, first, 0);
				player.getWorld().spawnParticle(Particle.SOUL, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSoulFireFlame() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 0);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossTotem() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.TOTEM, first, 0);
				player.getWorld().spawnParticle(Particle.TOTEM, second, 0);
			}
			
		}, 0, 1);
	}
	
	public void startCrossSpellWitch() {
		player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 5, 0);
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
				
				player.getWorld().spawnParticle(Particle.SPELL_WITCH, first, 0);
				player.getWorld().spawnParticle(Particle.SPELL_WITCH, second, 0);
			}
			
		}, 0, 1);
	}
}
