SUMMARY = "AutoLogin to root"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "file://autologin file://autoflash.sh"

S = "${WORKDIR}"

INHIBIT_DEFAULT_DEPS = "1"

do_compile() {
	:
}

do_install() {
	install -d ${D}${base_bindir}
	install -m 0755 ${WORKDIR}/autologin ${D}${base_bindir}/autologin
	install -d ${D}/etc/profile.d/
	install -m 0755 ${WORKDIR}/autoflash.sh ${D}/etc/profile.d/autoflash.sh
}

pkg_postinst_${PN} () {
	;
}