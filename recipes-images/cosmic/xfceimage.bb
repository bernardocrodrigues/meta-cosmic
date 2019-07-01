require headless.bb

#IMAGE_FEATURES += "empty-root-password allow-empty-password"

#PV = "V2.5"
#PR = "r0"

export IMAGE_BASENAME = "teste" 

SYSTEMD_DEFAULT_TARGET = "graphical.target"

#IMAGE_PREPROCESS_COMMAND += "do_delete_gnome_session ; "

#do_delete_gnome_session () {
#	rm -f ${IMAGE_ROOTFS}${datadir}/xsessions/gnome.desktop
#}
do_mkrmscript () {
    echo "for i in ${IMAGE_ROOTFS}/etc/rc0.d ${IMAGE_ROOTFS}/etc/rc1.d ${IMAGE_ROOTFS}/etc/rc2.d ${IMAGE_ROOTFS}/etc/rc3.d ${IMAGE_ROOTFS}/etc/rc4.d ${IMAGE_ROOTFS}/etc/rc5.d ${IMAGE_ROOTFS}/etc/rc6.d ${IMAGE_ROOTFS}/etc/rcS.d ; do" > ${WORKDIR}/rmscript
    echo "    rm -f \$i/*dropbear \$i/*avahi-daemon \$i/*dbus-1 \$i/*lxdm \$i/*ntpd \$i/*syslog \$i/*ofono \$i/*alsa-state \$i/*networking \$i/*udev-late-mount \$i/*sendsigs \$i/*save-rtc.sh \$i/*umountnfs.sh \$i/*portmap \$i/*umountfs \$i/*halt \$i/*rmnologin.sh \$i/*reboot; rm -f \$i/*banner.sh \$i/*sysfs.sh \$i/*checkroot.sh \$i/*alignment.sh \$i/*mountall.sh \$i/*populate-volatile.sh \$i/*devpts.sh \$i/*hostname.sh \$i/*portmap \$i/*mountnfs.sh \$i/*bootmisc.sh" >> ${WORKDIR}/rmscript
    echo "done" >> ${WORKDIR}/rmscript
    chmod +x ${WORKDIR}/rmscript
    readlink -e ${WORKDIR}/rmscript
    cat ${WORKDIR}/rmscript
}
addtask mkrmscript before do_rootfs

IMAGE_INSTALL += " \
    packagegroup-lxde-extended \
    packagegroup-base-extended \
    packagegroup-core-x11-base \
    packagegroup-lxde-base \
    packagegroup-core-x11 \
    \
    openbox \
    openbox-theme-clearlooks \
    openbox-theme-onyx \
    hicolor-icon-theme \
    lxdm \
    ${XSERVER} \
    udev-extra-rules \
    xserver-common \
    xserver-xorg-extension-dbe \
    xserver-xorg-extension-extmod \
    xauth \
    xhost \
    xset \
    xrdb \
    libxres \
    xorg-minimal-fonts xserver-xorg-utils \
    libxdamage libxvmc libxinerama \
    libxcursor \
    libxcomposite \
    xdg-utils \
    xvinfo \
    setxkbmap \
    libgsf \
    kernel-modules \
    gconf \
    gvfs \
    gvfsd-trash \
    libwnck \
    makedevs \
    libpcre \
    libpcreposix \
    alsa-states \
    zeroconf \
    udisks \
    xf86-input-evdev \
    xf86-input-keyboard \
    xf86-input-mouse \
    xserver-xf86-config \
"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"



#	
# 	angstrom-gnome-icon-theme-enable gtk-engine-clearlooks gtk-theme-clearlooks angstrom-clearlooks-theme-enable \
