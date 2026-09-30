# 🎬 Kinopoisk Cinema App

Android-приложение для поиска фильмов, просмотра рейтингов, актёрского состава и фильтрации по жанру. Реализовано на Jetpack Compose с чистой архитектурой, DI через Hilt и локальным кэшированием через Room.

## 📱 Функционал

- Поиск фильмов по названию (с поддержкой пагинации)
- Отображение детальной информации: рейтинг, описание, постер, актёрский состав
- Фильтрация по жанру
- Локальное кэширование данных (Room) для офлайн-доступа к ранее просмотренным фильмам
- Чистый UI на Jetpack Compose (Material 3)

## 🛠 Технологии и стек

- **Язык:** Kotlin (JVM target 17)
- **UI:** Jetpack Compose, Material 3
- **Архитектура:** MVVM / Clean Architecture
- **DI:** Hilt
- **Сеть:** Retrofit + OkHttp (с интерцептором)
- **База данных:** Room (локальное кэширование)
- **Асинхронность:** Kotlin Coroutines
- **Навигация:** Navigation Component
- **Пагинация:** Paging 3
- **Сборка:** Gradle Kotlin DSL, Android Gradle Plugin

**Версии SDK:**
- `minSdk`: 24
- `targetSdk`: 34
- `compileSdk`: 35

## 📸 Скриншоты

<img src="https://github.com/user-attachments/assets/44bf9b1c-363d-46ff-ac6b-47f8b00241d1" width="250" />

На странице поиска можно найти интересующие вас фильмы

<img src="https://github.com/user-attachments/assets/332d0448-0a82-461b-8032-fd12aea85af1" width="250" />

Страница профиля предоставляет информацию о просмотренных фильмах и коллекциях

<img src="https://github.com/user-attachments/assets/6452d60a-6184-4367-933d-05ba30047c96" width="250" />

## 📋 Установка и запуск

1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/PavelVolniy/kinopoisk-cinema-app.git
   cd kinopoisk-cinema-app
2. Откройте проект в Android Studio (рекомендуется Arctic Fox или новее).
3. Создайте файл .env в корне проекта (или в папке app) и добавьте API-ключ:
KINOPOISK_API_KEY=ваш_ключ_здесь
4. Соберите и запустите приложение:
    - В Android Studio: выберите устройство/эмулятор и нажмите Run.
    - Через терминал: ./gradlew assembleDebug

🧪 Тесты

Тестов в текущей версии нет.
Для будущего расширения планируются:

    Unit-тесты для репозиториев и view-моделей (JUnit + MockK)
    Instrumentation-тесты для навигации и UI (Espresso / Compose Test)

🤝 Вклад в проект (Contributing)

    Создайте новую ветку: feature/search-improvements или fix/ui-bugs.
    Внесите изменения и оформите коммит с понятным сообщением.
    Отправьте Pull Request с описанием изменений и, при необходимости, скриншотами.
    Убедитесь, что сборка проходит без ошибок (./gradlew build).
