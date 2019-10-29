DESCRIPTION = "Cosmic OS Miscellaneous Utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

PACKAGES = "\
            ${PN}-extended \
            ${PN}-core \
            ${PN}-docker \
            ${PN}-python \
            "

# Core Packages: implement for core functionality
RDEPENDS_${PN}-core =   "\
                        bash \
                        "

# Docker Packages: implement for Docker support
RDEPENDS_${PN}-docker = "\
                        docker-ce \
                        "

# Python Packages: implement for Python support
RDEPENDS_${PN}-python = "\
                        python \
                        python-pip \
                        python3 \
                        python3-pip \
                        "

RDEPENDS_${PN}-extended =  "\
                           ${PN}-core \
                           ${PN}-docker \
                           ${PN}-python \
                           "

