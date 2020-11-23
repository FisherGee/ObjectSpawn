package me.fishergee.objectspawn.listeners;

import me.fishergee.objectspawn.object.Spawn;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        Player clicker = (Player) e.getWhoClicked();

        if(e.getClickedInventory().getTitle().equals("Spawn")) {
            if (Spawn.getSpawn() != null){
                clicker.teleport(Spawn.getSpawn());
                return;
            }

            clicker.sendMessage(ChatColor.RED + "Spawn location has not been set -- null.");
        }
    }
}
