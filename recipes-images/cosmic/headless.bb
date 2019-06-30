
DESCRIPTION = "A console-only image with more full-featured Linux system functionality installed."  

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

IMAGE_PREPROCESS_COMMAND = "rootfs_update_timestamp ;"


ROOTFS_PKGMANAGE_PKGS ?= '${@oe.utils.conditional("ONLINE_PACKAGE_MANAGEMENT", "none", "", "${ROOTFS_PKGMANAGE} ${DISTRO_UPDATE_ALTERNATIVES}", d)}'

IMAGE_INSTALL += " \
	angstrom-packagegroup-boot \
	packagegroup-base \
	packagegroup-basic \
    ${ROOTFS_PKGMANAGE_PKGS} \
	timestamp-service \
"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"

export IMAGE_BASENAME = "systemd-image"

inherit image
