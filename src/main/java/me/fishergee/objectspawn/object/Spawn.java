package me.fishergee.objectspawn.object;

import org.bukkit.Location;

public class Spawn {
    private static Location spawn;

    public static void setSpawn(Location location){
        spawn = location;
    }

    public static Location getSpawn(){
        return spawn;
    }

    public static void playEffects(){

    }
}
