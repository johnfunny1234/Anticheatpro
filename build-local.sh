#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
BUILD_DIR="$ROOT_DIR/build"
STUB_SRC_DIR="$ROOT_DIR/tools/spigot-stubs/src"
STUB_CLASSES_DIR="$BUILD_DIR/stubs-classes"
STUB_JAR="$BUILD_DIR/spigot-stubs.jar"
CLASSES_DIR="$BUILD_DIR/classes"
TARGET_DIR="$ROOT_DIR/target"
OUTPUT_JAR="$TARGET_DIR/anticheatpro-1.0.0.jar"

mkdir -p "$STUB_CLASSES_DIR" "$CLASSES_DIR" "$TARGET_DIR"

echo "Compiling Bukkit stub API..."
find "$STUB_SRC_DIR" -type f -name "*.java" \
  | xargs javac -source 1.8 -target 1.8 -d "$STUB_CLASSES_DIR"

jar cf "$STUB_JAR" -C "$STUB_CLASSES_DIR" .

echo "Compiling AntiCheatPro sources..."
find "$ROOT_DIR/src/main/java" -type f -name "*.java" \
  | xargs javac -source 1.8 -target 1.8 -cp "$STUB_JAR" -d "$CLASSES_DIR"

cp "$ROOT_DIR/src/main/resources/plugin.yml" "$CLASSES_DIR/plugin.yml"

jar cf "$OUTPUT_JAR" -C "$CLASSES_DIR" .

echo "Built $OUTPUT_JAR"
