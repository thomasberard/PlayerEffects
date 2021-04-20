package fr.mrflamme26.playereffects.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.mrflamme26.playereffects.models.GUI;

public class Trail implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("trails")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Vous ne pouvez pas faire ça !");
				return true;
			}
			Player player = (Player) sender;
			GUI menu = new GUI();
			menu.openInventory(player);
			return true;
		}
		return false;
	}
}
