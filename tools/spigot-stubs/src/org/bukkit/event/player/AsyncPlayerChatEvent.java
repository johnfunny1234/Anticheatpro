package org.bukkit.event.player;

import org.bukkit.entity.Player;

public class AsyncPlayerChatEvent {
    private final Player player;
    private final String message;

    public AsyncPlayerChatEvent(Player player, String message) {
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
