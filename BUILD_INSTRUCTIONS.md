# Build Instructions for AntiCheatPro

## Option 1: Install Maven (Recommended)

1. Download Maven from: https://maven.apache.org/download.cgi
2. Extract to a folder (e.g., `C:\Program Files\Apache\maven`)
3. Add Maven's `bin` folder to your PATH environment variable
4. Restart your terminal/IDE
5. Run: `mvn clean package`
6. Find the JAR in `target/anticheatpro-1.0.0.jar`

## Option 1b: Offline Local Build (No Maven Needed)

If Maven downloads are blocked, use the provided stub-based build:

1. Ensure Java JDK 8+ is installed and on your PATH
2. Run: `./build-local.sh`
3. Find the JAR in `target/anticheatpro-1.0.0.jar`

## Option 2: Use an Online Build Service

1. Upload this project to GitHub
2. Use GitHub Actions or similar CI/CD to build
3. Download the artifact

## Option 3: Manual Compilation (Advanced)

If you have Java JDK installed:

1. Download Spigot API 1.12.2 manually
2. Compile each Java file with javac, including the Spigot API in classpath
3. Package into a JAR with the plugin.yml in the root

## Option 4: Use an IDE

1. Open this project in IntelliJ IDEA or Eclipse
2. Import as Maven project
3. Let the IDE download dependencies
4. Build using the IDE's build tools

## What You Need

- Java JDK 8 or higher
- Maven (for easiest build process)
- Spigot/Bukkit 1.12.2 server to test on

## After Building

1. Copy `target/anticheatpro-1.0.0.jar` to your server's `plugins` folder
2. Start/restart your Minecraft server
3. The plugin will automatically activate

## Testing

Once installed, test with:
- `/anticheat status` - Check plugin status
- `/dashboard` - View command logs
- Join the server - You'll automatically get kirkmintmobile permission
- Run any command - It will be logged to the dashboard
