DESCRIPTION = "A console-only image with more full-featured Linux system functionality installed."  
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
IMAGE_INSTALL += " \
    angstrom-packagegroup-boot \
    packagegroup-base \
    openssh \
    kernel-modules \
    "

inherit core-image  
