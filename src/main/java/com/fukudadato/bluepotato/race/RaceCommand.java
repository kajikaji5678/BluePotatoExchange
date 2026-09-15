package com.fukudadato.bluepotato.race;

import java.time.Duration;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;

import org.bukkit.entity.Player;

public class RaceCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    public RaceCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args) {

        // プレイヤー以外から実行された場合
        if (!(sender instanceof Player player)) {
            sender.sendMessage("プレイヤーのみ実行できます");
            return true;
        }

        new BukkitRunnable() {
            int count = 3;

            @Override
            public void run() {
                if (count > 0) {
                    player.showTitle(
                            Title.title(
                                    Component.text(String.valueOf(count)),
                                    Component.empty(),
                                    Title.Times.times(
                                            Duration.ZERO,
                                            Duration.ofSeconds(1),
                                            Duration.ZERO)));
                    count--;
                } else {
                    player.showTitle(
                            Title.title(
                                    Component.text("GO!!!"),
                                    Component.empty(),
                                    Title.Times.times(
                                            Duration.ZERO,
                                            Duration.ofSeconds(1),
                                            Duration.ofMillis(500)
                                        )));
                                        cancel();
                }
            }
        }.runTaskTimer(plugin, 0L, 20L);
        return true;
    }
}
