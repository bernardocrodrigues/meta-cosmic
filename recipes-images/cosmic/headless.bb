#DESCRIPTION = "A console-only image with more full-featured Linux system functionality installed."  
# customize IMAGE_FEATURES as follows  
#IMAGE_FEATURES += "splash"  
      
#dev-pkgs tools-sdk tools-debug tools-profile tools-testapps debug-tweaks package-management
# packagegroup-core-tools-profile will build and install tracing and profiling tools to the target image.  
# packagegroup-core-buildessential will build and install autotools, gcc, etc. to the target image.  
# kernel-modules for install of the kernel modules.  
# kernel-devsrc for building out of tree modules.  
# IMAGE_ROOTFS_EXTRA_SPACE_append for adding extra space to the target rootfs image.  
#"packagegroup-core-boot packagegroup-core-full-cmdline kernel-modules ${CORE_IMAGE_EXTRA_INSTALL} "  
      
      
# Include modules in rootfs
#IMAGE_INSTALL += " \
#   angstrom-packagegroup-boot \
#    packagegroup-base \
#    openssh \
#    kernel-modules \
#    "

#inherit core-image  




LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

IMAGE_PREPROCESS_COMMAND = "rootfs_update_timestamp ;"

DISTRO_UPDATE_ALTERNATIVES ??= ""
ROOTFS_PKGMANAGE_PKGS ?= '${@oe.utils.conditional("ONLINE_PACKAGE_MANAGEMENT", "none", "", "${ROOTFS_PKGMANAGE} ${DISTRO_UPDATE_ALTERNATIVES}", d)}'

CONMANPKGS ?= "connman connman-client connman-angstrom-settings connman-plugin-loopback connman-plugin-ethernet connman-plugin-wifi connman-systemd"
CONMANPKGS_libc-uclibc = ""

IMAGE_INSTALL += " \
	angstrom-packagegroup-boot \
	packagegroup-base \
	packagegroup-basic \
	${CONMANPKGS} \
	${ROOTFS_PKGMANAGE_PKGS} \
	timestamp-service \
"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"

export IMAGE_BASENAME = "systemd-image"

inherit image
