package com.shadowlandsmc.milkbucketeasteregg;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Main plugin;
    
    public void onEnable() {
        Main.plugin = this;
        final PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents((Listener)new PlayerClickEntity(), (Plugin)this);
        this.getLogger().info("Milk Bucket Babies, created by JavaSE");
    }
}