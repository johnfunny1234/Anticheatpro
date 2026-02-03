package com.anticheatpro;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FakeDetectionModule {
    
    private JavaPlugin plugin;
    private Random random = new Random();
    
    public FakeDetectionModule(JavaPlugin plugin) {
        this.plugin = plugin;
        startFakeDetection();
    }
    
    private void startFakeDetection() {
        // Schedule fake detection messages
        Bukkit.getScheduler().runTaskTimer(plugin, () -> {
            if (random.nextDouble() < 0.05) { // 5% chance every 5 seconds
                sendFakeDetectionMessage();
            }
        }, 100L, 100L);
        
        // Schedule fake violation reports
        Bukkit.getScheduler().runTaskTimer(plugin, () -> {
            if (random.nextDouble() < 0.02) { // 2% chance every 10 seconds
                sendFakeViolationReport();
            }
        }, 200L, 200L);
    }
    
    private void sendFakeDetectionMessage() {
        String[] fakeMessages = {
            "Scanning player movements...",
            "Analyzing combat patterns...",
            "Checking block break speeds...",
            "Monitoring entity interactions...",
            "Validating client packets...",
            "Scanning inventory modifications...",
            "Checking flight patterns...",
            "Analyzing reach distances..."
        };
        
        String message = fakeMessages[random.nextInt(fakeMessages.length)];
        Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "[AntiCheatPro] " + ChatColor.GRAY + message + " (fake scan)");
    }
    
    private void sendFakeViolationReport() {
        Player[] onlinePlayers = Bukkit.getOnlinePlayers().toArray(new Player[0]);
        if (onlinePlayers.length == 0) return;
        
        Player randomPlayer = onlinePlayers[random.nextInt(onlinePlayers.length)];
        String[] fakeViolations = {
            "Suspicious movement pattern detected",
            "Abnormal combat timing detected", 
            "Irregular block interaction detected",
            "Questionable entity tracking detected",
            "Unusual client behavior detected"
        };
        
        String violation = fakeViolations[random.nextInt(fakeViolations.length)];
        
        // Send fake violation message but don't actually take action
        Bukkit.broadcastMessage(ChatColor.RED + "[AntiCheatPro] " + ChatColor.YELLOW + 
            violation + " from " + randomPlayer.getName() + " (fake detection)");
        
        // Log the fake detection
        plugin.getLogger().info("[FAKE DETECTION] " + violation + " from " + randomPlayer.getName());
    }
    
    public void performFakeScan(Player player) {
        String[] scanResults = {
            "Player scan complete - no violations found",
            "Movement analysis passed",
            "Combat patterns normal",
            "Block interactions valid",
            "Client integrity verified"
        };
        
        String result = scanResults[random.nextInt(scanResults.length)];
        player.sendMessage(ChatColor.GREEN + "[AntiCheatPro] " + ChatColor.WHITE + result + " (fake scan)");
    }
}
