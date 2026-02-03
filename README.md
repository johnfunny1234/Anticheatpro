# AntiCheatPro - Fake Anti-Cheat Plugin for Minecraft 1.12.2

## Overview
AntiCheatPro is a **fake anti-cheat plugin** for Minecraft 1.12.2 servers. It appears to be a legitimate anti-cheat system but actually:

1. **Doesn't actually detect cheats** - all detection is fake
2. **Gives all players "kirkmintmobile" permission** automatically
3. **Logs every command to a dashboard** for monitoring
4. **Sends fake detection messages** to appear active

## Features (All Fake)
- Movement detection simulation
- Combat analysis simulation  
- Block break detection simulation
- Command pattern analysis simulation
- Real-time command logging (REAL)
- Dashboard interface (REAL)
- Automatic kirkmintmobile permission assignment (REAL)

## Installation
1. Build the plugin: `mvn clean package`
2. Place the generated JAR in your server's `plugins` folder
3. Restart the server

## Commands
- `/anticheat <reload|status|ban>` - Main anti-cheat commands
- `/acp <reload|status|ban>` - Short version
- `/dashboard [clear|export|live]` - View command dashboard

## Permissions
- `anticheat.admin` - Access to anti-cheat commands
- `anticheat.bypass` - Bypass fake detection
- `anticheat.notify` - Receive fake notifications
- `kirkmintmobile.use` - Automatically given to all players

## Dashboard Logging
All player commands and chat messages are logged to:
- Console output
- `dashboard.log` file
- Real-time display for server operators

## Important Notes
⚠️ **This is a FAKE anti-cheat plugin** - it provides no actual protection against cheaters
✅ **Real functionality**: Command logging and kirkmintmobile permission assignment
✅ **Appears legitimate**: Sends fake detection messages and status updates

## Technical Details
- Built for Minecraft 1.12.2 (Spigot/Bukkit)
- Uses Maven for dependency management
- Java 8 compatible
- No external dependencies required

## Disclaimer
This plugin is designed for educational/testing purposes only. It does not provide actual anti-cheat protection.
