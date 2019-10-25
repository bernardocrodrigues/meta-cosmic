DESCRIPTION = "Cosmic OS Miscellaneous Utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
                    python \
                    python3 \
                    apt \
                    dpkg \
                    bash \
                 "
