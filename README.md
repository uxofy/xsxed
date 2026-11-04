# Eat Animation

Мод для Minecraft Fabric 1.21.1, который добавляет плавную анимацию еды и очищает меню управления от лишних настроек.

## Особенности

- 🍔 **Плавная анимация еды** — еда плавно поднимается к рту без резких движений
- 🧹 **Скрытие MACECORE** — убирает настройки чит-клиента MACECORE из меню управления
- 🎨 **Чистый интерфейс** — только нужные клавиши, никакого мусора
- ⚡ **Лёгкий** — не нагружает игру

## Установка

1. Установите [Fabric Loader](https://fabricmc.net/use/) 1.21.1
2. Скачайте последнюю версию мода из [Releases](https://github.com/YourName/eat-animation/releases)
3. Поместите `.jar` файл в папку `mods`
4. Запустите игру!

## Сборка из исходников

```bash
# Клонируйте репозиторий
git clone https://github.com/YourName/eat-animation.git
cd eat-animation

# Соберите мод
./gradlew build

# Готовый мод будет в build/libs/
```

## Требования

- Minecraft 1.21.1
- Fabric Loader >= 0.16.9
- Fabric API
- Java 21

## Скрываемые настройки

Мод автоматически скрывает следующие настройки MACECORE:
- Backend
- Drop Stack
- Equip Elytra
- Pearl Catch
- Reset Target
- SmartR
- Toggle Swapping

## Лицензия

MIT License — делайте что хотите! 😊
