package org.bukkit.event.player;

import org.bukkit.entity.Player;

public class PlayerCommandPreprocessEvent {
    private final Player player;
    private final String message;

    public PlayerCommandPreprocessEvent(Player player, String message) {
        this.player = player;
        this.message = message;
    }

    public Player getPlayer() {
        return player;
    }

    public String getMessage() {
        return message;
    }
}
