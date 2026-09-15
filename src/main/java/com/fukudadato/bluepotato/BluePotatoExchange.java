package com.fukudadato.bluepotato;

import org.bukkit.plugin.java.JavaPlugin;


public class BluePotatoExchange extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BluePotatoExchange has been enabled!");
        getLogger().info("hello!! KajiPlugin is Open!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BluePotatoExchange has been disabled!");
    }
}
