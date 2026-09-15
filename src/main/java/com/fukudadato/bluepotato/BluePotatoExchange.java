package com.fukudadato.bluepotato;

import org.bukkit.plugin.java.JavaPlugin;
import com.fukudadato.bluepotato.race.RaceCommand;


public class BluePotatoExchange extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("hello!! KajiPlugin is Open!!");
        getCommand("race").setExecutor(new RaceCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("BluePotatoExchange has been disabled!");
    }
}
