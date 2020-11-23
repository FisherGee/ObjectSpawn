package me.fishergee.objectspawn.object;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SpawnInventory {

    public static Inventory spawnInv;

    public SpawnInventory(){
        spawnInv = Bukkit.createInventory(null, 27, "Spawn");

        setSpawnItem();
        setBackgroundItems();
    }

    private void setBackgroundItems(){
        for(int i = 0; i < spawnInv.getSize(); i++){
            if(spawnInv.getItem(i) == null)
                spawnInv.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE));
        }
    }

    private void setSpawnItem(){
        ItemStack spawnItem = new ItemStack(Material.ENDER_PEARL);
        ItemMeta spawnItemMeta = spawnItem.getItemMeta();

        spawnItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lTELEPORT TO SPAWN"));

        List<String> spawnItemLore = new ArrayList<String>();
        spawnItemLore.add("Click this item to");
        spawnItemLore.add("teleport to spawn!");

        spawnItemMeta.setLore(spawnItemLore);

        spawnItem.setItemMeta(spawnItemMeta);

        spawnInv.setItem(13, spawnItem);
    }

}
