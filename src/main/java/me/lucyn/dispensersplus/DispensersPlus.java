package me.lucyn.dispensersplus;

import org.bukkit.plugin.java.JavaPlugin;

public final class DispensersPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new DispenseListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
