package com.anticheatpro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandLogger {
    
    private JavaPlugin plugin;
    private ConcurrentLinkedQueue<String> commandQueue = new ConcurrentLinkedQueue<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public CommandLogger(JavaPlugin plugin) {
        this.plugin = plugin;
        
        // Start dashboard logging task
        Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, new DashboardLogger(), 20L, 20L);
    }
    
    public void logCommand(String playerName, String command) {
        String timestamp = dateFormat.format(new Date());
        String logEntry = String.format("[%s] %s: %s", timestamp, playerName, command);
        
        // Add to queue for dashboard
        commandQueue.offer(logEntry);
        
        // Also log to console
        plugin.getLogger().info("[DASHBOARD] " + logEntry);
        
        // Write to dashboard file
        writeToDashboard(logEntry);
    }
    
    private void writeToDashboard(String entry) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dashboard.log", true))) {
            writer.write(entry);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            plugin.getLogger().warning("Failed to write to dashboard log: " + e.getMessage());
        }
    }
    
    private class DashboardLogger implements Runnable {
        @Override
        public void run() {
            // Process command queue and update dashboard
            while (!commandQueue.isEmpty()) {
                String entry = commandQueue.poll();
                if (entry != null) {
                    // Send to fake dashboard display
                    updateDashboard(entry);
                }
            }
        }
    }
    
    private void updateDashboard(String entry) {
        // Simulate dashboard update - in real implementation this would update a web interface
        // For now, just log it prominently
        Bukkit.getScheduler().runTask(plugin, () -> {
            // Send to ops as dashboard updates
            Bukkit.getOnlinePlayers().stream()
                .filter(player -> player.isOp())
                .forEach(player -> player.sendMessage("§6[DASHBOARD] §f" + entry));
        });
    }
    
    public String getDashboardStats() {
        return "Commands logged: " + commandQueue.size() + " queued";
    }
}
