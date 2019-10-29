
#Angstrom bootstrap image
require recipes-images/angstrom/console-base-image.bb

IMAGE_NAME = "${DISTRO_NAME}-${DISTRO_VERSION}-${MACHINE}"

IMAGE_INSTALL += "\ 
                    packagegroup-cosmic-extended \
                    "
