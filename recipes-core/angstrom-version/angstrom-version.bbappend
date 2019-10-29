
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_install() {
	install -d ${D}${sysconfdir}
	echo "Cosmic OS ${DISTRO_VERSION} " > ${D}${sysconfdir}/cosmic-version
	echo "Built from branch: ${METADATA_BRANCH}" >> ${D}${sysconfdir}/cosmic-version
	echo "Revision: ${METADATA_REVISION}" >> ${D}${sysconfdir}/cosmic-version
	echo "Target system: ${TARGET_SYS}" >> ${D}${sysconfdir}/cosmic-version

	echo "${@get_layers(bb, d)}" > ${D}${sysconfdir}/cosmic-build-info

	echo "VERSION=\"${DISTRO_VERSION}\"" > ${D}${sysconfdir}/os-release
	echo "VERSION_ID=\"${DISTRO_VERSION}\"" > ${D}${sysconfdir}/os-release
	echo "NAME=\"Cosmic\"" >> ${D}${sysconfdir}/os-release
	echo "ID=\"cosmic\"" >> ${D}${sysconfdir}/os-release
	echo "PRETTY_NAME=\"Cosmic OS ${DISTRO_VERSION}\"" >> ${D}${sysconfdir}/os-release
	echo "ANSI_COLOR=\"1;35\"" >> ${D}${sysconfdir}/os-release
	echo "HOME_URL=\"http://www.bernardorodrigues.org\"" >> ${D}${sysconfdir}/os-release

	install -d ${D}${bindir}
	install -m 0755 ${WORKDIR}/lsb_release ${D}${bindir}/
}