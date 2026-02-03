package com.anticheatpro;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class DashboardInterface implements CommandExecutor {
    private final JavaPlugin plugin;

    public DashboardInterface(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.YELLOW + "[AntiCheatPro] Dashboard (fake) is active.");
        return true;
    }
}
