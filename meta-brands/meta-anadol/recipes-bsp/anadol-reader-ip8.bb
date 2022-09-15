SUMMARY = "libreader for Anadol Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "libsdl"

COMPATIBLE_MACHINE = "^(ip8)$"

SRCDATE = "20220212"

PV = "${SRCDATE}"
PR = "r0"

SRC_URI = "https://source.mynonpublic.com/anadol/${MACHINE}-libreader-${SRCDATE}.tar.gz"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/libreader ${D}/${bindir}
}

do_package_qa() {
}

FILES:${PN}  = "${bindir}/libreader"

SRC_URI[md5sum] = "a753963a889d93a2cf6d9cfd8e9bbf96"
SRC_URI[sha256sum] = "8511db482d7067a3ab4dd2eb795031b6294fdccc4c08be2a099c410dca0278c2"

INSANE_SKIP:${PN} += "already-stripped"
