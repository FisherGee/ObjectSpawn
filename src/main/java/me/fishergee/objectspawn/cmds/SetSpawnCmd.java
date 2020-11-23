package me.fishergee.objectspawn.cmds;

import me.fishergee.objectspawn.object.Spawn;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
        if(!(sender instanceof Player)) return true;

        Player targetPlayer = (Player) sender;

        Location targetLocation = targetPlayer.getLocation();

        Spawn.setSpawn(targetLocation);

        targetPlayer.sendMessage(ChatColor.BLUE + "Set spawn location!");
        return true;
    }
}
