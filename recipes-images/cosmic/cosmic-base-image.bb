
IMAGE_NAME = "${DISTRO_NAME}-${DISTRO_VERSION}-${MACHINE}"

#IMAGE_INSTALL += "\ 
#                    packagegroup-cosmic-extended \
#                    "
# packagegroup-base


SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-base \
                 packagegroup-core-ssh-openssh \
                 packagegroup-cosmic-extended"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
