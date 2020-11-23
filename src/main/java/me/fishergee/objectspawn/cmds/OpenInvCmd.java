package me.fishergee.objectspawn.cmds;

import me.fishergee.objectspawn.object.Spawn;
import me.fishergee.objectspawn.object.SpawnInventory;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenInvCmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
        if(!(sender instanceof Player)) return true;

        Player targetPlayer = (Player) sender;

        targetPlayer.openInventory(SpawnInventory.spawnInv);
        return true;
    }
}
