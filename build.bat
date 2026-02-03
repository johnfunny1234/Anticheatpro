@echo off
echo Building AntiCheatPro plugin...
echo.

REM Check if Maven is installed
where mvn >nul 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo Maven is not installed or not in PATH
    echo Please install Maven from https://maven.apache.org/download.cgi
    echo.
    pause
    exit /b 1
)

echo Maven found. Building plugin...
mvn clean package

if %ERRORLEVEL% EQU 0 (
    echo.
    echo Build successful!
    echo Plugin JAR is located in target/anticheatpro-1.0.0.jar
    echo.
    echo To install: Copy the JAR to your server's plugins folder
) else (
    echo.
    echo Build failed! Check the error messages above.
)

echo.
pause
