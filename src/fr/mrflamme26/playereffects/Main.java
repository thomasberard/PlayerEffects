package fr.mrflamme26.playereffects;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.mrflamme26.playereffects.commands.Trail;
import fr.mrflamme26.playereffects.events.ClickEvent;
import fr.mrflamme26.playereffects.events.Movement;
import fr.mrflamme26.playereffects.events.PlayerEvents;
import fr.mrflamme26.playereffects.events.Quit;
import fr.mrflamme26.playereffects.models.GUI;

public class Main extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		
		PluginDescriptionFile pluginFile = this.getDescription();
		
		this.logger.info("§f[§e" + pluginFile.getName() + "§f] §aVersion " + pluginFile.getVersion() + ".");
		this.logger.info("§f[§e" + pluginFile.getName() + "§f] §aChargé avec succès.");
		this.logger.info("§f[§e" + pluginFile.getName() + "§f] §cUn plugin réalisé par MrFlamme26.");
		
		GUI menu = new GUI();
		menu.register();
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ClickEvent(), this);
		pm.registerEvents(new Quit(), this);
		pm.registerEvents(new Movement(), this);
		pm.registerEvents(new PlayerEvents(), this);
		
		this.getCommand("trails").setExecutor(new Trail());
	}
	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pluginFile = this.getDescription();
		
		this.logger.info("§f[§e" + pluginFile.getName() + "§f] §aDéchargé avec succès.");
	}
	
}
