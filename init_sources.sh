#!/bin/sh
set -e

# Ensure submodules directory exists
mkdir -p upstream

# Add upstream submodules
if [ ! -d "upstream/telegram-android" ]; then
  git submodule add https://github.com/DrKLO/Telegram upstream/telegram-android
fi
if [ ! -d "upstream/goodbyedpi" ]; then
  git submodule add https://github.com/ValdikSS/GoodbyeDPI upstream/goodbyedpi
fi

# Pin submodules to HEAD of their master branches
for dir in telegram-android goodbyedpi; do
  git -C "upstream/$dir" fetch origin master
  git -C "upstream/$dir" checkout "$(git -C "upstream/$dir" rev-parse origin/master)"
  git add "upstream/$dir"
done

# Summary
printf '%s\n' "Submodules added and pinned:" \
  " - telegram-android @ $(git -C upstream/telegram-android rev-parse --short HEAD)" \
  " - goodbyedpi       @ $(git -C upstream/goodbyedpi rev-parse --short HEAD)"

