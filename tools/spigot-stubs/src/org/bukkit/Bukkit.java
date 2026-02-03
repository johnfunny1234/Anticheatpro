package org.bukkit;

import java.util.Collections;
import java.util.Set;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public final class Bukkit {
    private static final BukkitScheduler SCHEDULER = new BukkitScheduler();
    private static final PluginManager PLUGIN_MANAGER = new PluginManager();

    private Bukkit() {
    }

    public static PluginManager getPluginManager() {
        return PLUGIN_MANAGER;
    }

    public static BukkitScheduler getScheduler() {
        return SCHEDULER;
    }

    public static CommandSender getConsoleSender() {
        return new CommandSender();
    }

    public static void dispatchCommand(CommandSender sender, String command) {
    }

    public static void broadcastMessage(String message) {
    }

    public static Set<Player> getOnlinePlayers() {
        return Collections.emptySet();
    }

    public static Player getPlayer(String name) {
        return null;
    }
}
