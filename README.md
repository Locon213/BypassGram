<p align="center">
  <img src="docs/assets/bypassgram_icon.png" width="192" alt="BypassGram logo"/>
</p>

# BypassGram

**BypassGram** — форк Telegram-Android, который автоматически включает
обход DPI-блокировок (ядро GoodByeDPI) **только во время звонков**.
Никаких постоянных VPN-туннелей — экономим батарею и не затрагиваем
другие приложения.

[![Build](https://github.com/Locon213/BypassGram/actions/workflows/android.yml/badge.svg)](https://github.com/Locon213/BypassGram/actions)
[![Release](https://img.shields.io/github/v/release/Locon213/BypassGram?label=latest)](https://github.com/Locon213/BypassGram/releases/latest)

<p align="center"> 
  <a href="https://github.com/Locon213/BypassGram/releases/latest"> <img src="https://img.shields.io/badge/Download-APK-blue?logo=android&style=for-the-badge" alt="Download APK"/> 
  </a> 
</p>

## ✨ Возможности
* 🔐 GoodByeDPI внутри: фрагментация TLS, obfs SNI, split TCP.  
* 📴 Туннель активен **только** во время звонка *Established*.  
* ⚙️ Auto / Always / Off + плановые self-tests.  
* 💤 Авто-off, если звонок > 30 мин и loss < 1 %.  
* 🛠️ Nightly APK-сборки на Linux-runner (GitHub Actions).

## 🚀 Установка
1. Скачать APK из [Releases].  
2. Разрешить установку.  
3. В **Settings → Calls → DPI Bypass** выбрать *Auto*.

[Releases]: https://github.com/Locon213/BypassGram/releases

## 🧑‍💻 Сборка
```bash
git clone https://github.com/Locon213/BypassGram
cd BypassGram
./gradlew :app:assembleRelease      # Linux only
```
## 🔬 Self-tests

Настройка: Settings → DPI Bypass → Self-test.
Проверяются RTT и loss, сохраняется лучшая MTU.

## 📄 Лицензия
* Компонент	Лицензия
* Telegram-Android	GPL-3.0
* GoodByeDPI	Apache-2.0
* Tun2Socks-lite	MIT
* Наш код	GPL-3.0-or-later

Полный текст — в LICENSE.

Author / Maintainer: Locon213
