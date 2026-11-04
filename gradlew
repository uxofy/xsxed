#!/bin/sh

# Простой gradlew wrapper script
# Для полноценной сборки скачайте официальный gradle wrapper

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd "$DIR"

if command -v gradle &> /dev/null; then
    gradle "$@"
else
    echo "Gradle не найден. Установите Gradle или используйте IDE."
    echo "Скачать: https://gradle.org/install/"
    exit 1
fi
