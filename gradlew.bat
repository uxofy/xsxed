@echo off
REM Простой gradlew для Windows
REM Для полноценной сборки скачайте официальный gradle wrapper

if exist "%USERPROFILE%\.gradle\wrapper\dists" (
    echo Используется существующий Gradle wrapper
) else (
    echo Gradle не найден. Установите Gradle или используйте IDE.
    echo Скачать: https://gradle.org/install/
    pause
    exit /b 1
)
