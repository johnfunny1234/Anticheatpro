package org.bukkit;

public enum ChatColor {
    DARK_GREEN,
    GRAY,
    GREEN,
    RED,
    WHITE,
    YELLOW;

    @Override
    public String toString() {
        return name();
    }
}
