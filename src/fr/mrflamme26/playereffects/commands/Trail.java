package fr.mrflamme26.playereffects.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.mrflamme26.playereffects.models.GUI;
import net.md_5.bungee.api.ChatColor;

public class Trail implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("trails")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cImpossible d'exécuter cette action depuis la console !"));
				
				return true;
			}
			else if((sender.hasPermission("playereffects.item") || sender.isOp())) {
				Player player = (Player) sender;
				player.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN, 5, 0);
				GUI menu = new GUI();
				menu.openInventoryAnimations(player);
				
				return true;
			}
			else {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cDeviens &bVIP &cpour débloquer cette fonctionnalité !"));
				
				return true;
			}
		}
		return false;
	}
}
