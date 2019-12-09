FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://json.patch"

SRC_URI_remove = "file://0001-docker-compose-support-newer-minor-version-of-reques.patch"
