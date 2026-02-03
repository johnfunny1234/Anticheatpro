package org.bukkit.entity;

import java.util.UUID;

public class Player {
    public UUID getUniqueId() {
        return UUID.randomUUID();
    }

    public String getName() {
        return "Player";
    }

    public boolean hasPermission(String permission) {
        return true;
    }

    public void sendMessage(String message) {
    }

    public boolean isOp() {
        return true;
    }
}
