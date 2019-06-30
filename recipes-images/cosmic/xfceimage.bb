require headless.bb

DISTRO_EXTRA_RDEPENDS_append = " alsa pulseaudio"
DISTRO_FEATURES_append = "x11 pulseaudio"

IMAGE_INSTALL += " \
	packagegroup-xfce-base \
	packagegroup-gnome-xserver-base \
	packagegroup-core-x11-xserver \
	packagegroup-gnome-fonts \
"

export IMAGE_BASENAME = "XFCE-NetworkManager-image" 



#	angstrom-gdm-autologin-hack angstrom-gdm-xfce-hack gdm \
# 	angstrom-gnome-icon-theme-enable gtk-engine-clearlooks gtk-theme-clearlooks angstrom-clearlooks-theme-enable \
