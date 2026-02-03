package org.bukkit.plugin.java;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;

public class JavaPlugin {
    private final Logger logger = Logger.getLogger("JavaPlugin");

    public Logger getLogger() {
        return logger;
    }

    public PluginCommand getCommand(String name) {
        return new PluginCommand();
    }

    public void onEnable() {
    }

    public void onDisable() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
