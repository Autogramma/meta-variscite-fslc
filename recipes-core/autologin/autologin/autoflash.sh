#!/bin/sh

if [[ $FLASH == "true" ]]; then
    LC_ALL=ru_RU.UTF-8
    echo 0 > /sys/class/graphics/fb0/blank
    echo 0 > /sys/class/graphics/fb1/blank
    setfont /usr/share/consolefonts/UniCyrExt_8x16.psf.gz
    install_android.sh;read
else
    touch /tmp/.no-flash
fi