package org.bukkit.event.player;

import org.bukkit.entity.Player;

public class PlayerMoveEvent {
    private final Player player;

    public PlayerMoveEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
