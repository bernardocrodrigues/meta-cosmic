
# DESCRIPTION = "A console-only image with more full-featured Linux system functionality installed."  

# LICENSE = "MIT"
# LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# IMAGE_PREPROCESS_COMMAND = "rootfs_update_timestamp ;"


# ROOTFS_PKGMANAGE_PKGS ?= '${@oe.utils.conditional("ONLINE_PACKAGE_MANAGEMENT", "none", "", "${ROOTFS_PKGMANAGE} ${DISTRO_UPDATE_ALTERNATIVES}", d)}'

# IMAGE_INSTALL += " \
# 	angstrom-packagegroup-boot \
# 	packagegroup-base \
# 	packagegroup-basic \
#     ${ROOTFS_PKGMANAGE_PKGS} \
# 	timestamp-service \
# "

# IMAGE_DEV_MANAGER   = "udev"
# IMAGE_INIT_MANAGER  = "systemd"
# IMAGE_INITSCRIPTS   = " "
# IMAGE_LOGIN_MANAGER = "busybox shadow"

# export IMAGE_BASENAME = "systemd-image"

# inherit image


# SUMMARY = "A small image just capable of allowing a device to boot."

# # TODO : Check if docker-contrib is really necessary
# # TODO : Check if networkmanager can be exchanged by connman, connman-client 
# IMAGE_INSTALL = " \
# 					packagegroup-core-boot \
# 					angstrom-packagegroup-boot \
# 					packagegroup-basic \
# 					${ROOTFS_PKGMANAGE_PKGS} \
#                  	${CORE_IMAGE_EXTRA_INSTALL} \
#                  "
        
# LICENSE = "MIT"

# inherit core-image

# IMAGE_ROOTFS_SIZE ?= "8192"
# IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"


# # TODO: Maybe put this in the distro core package?
# IMAGE_INSTALL_append = " \
#     kernel-modules \
# "


#Angstrom bootstrap image
require recipes-images/angstrom/console-base-image.bb

DEPENDS += "packagegroup-base-extended "

IMAGE_INSTALL += "packagegroup-base-extended "

IMAGE_INSTALL_remove = "connman-systemd angstrom-libc-fixup-hack"

# export IMAGE_BASENAME = "console-image"
