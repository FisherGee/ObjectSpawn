package me.fishergee.objectspawn;

import me.fishergee.objectspawn.cmds.OpenInvCmd;
import me.fishergee.objectspawn.cmds.SetSpawnCmd;
import me.fishergee.objectspawn.listeners.PlayerClickListener;
import me.fishergee.objectspawn.object.SpawnInventory;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    /*
    Create a command that opens inv
    */
    @Override
    public void onEnable(){

        registerListeners();
        registerCommands();
        SpawnInventory spawnInventory = new SpawnInventory();
    }

    public void onDisable(){

    }

    private void registerListeners(){
        Bukkit.getPluginManager().registerEvents(new PlayerClickListener(), this);
    }

    private void registerCommands(){
        getCommand("setspawn").setExecutor(new SetSpawnCmd());
        getCommand("openinv").setExecutor(new OpenInvCmd());
    }
}
