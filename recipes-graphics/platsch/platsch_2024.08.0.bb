DESCRIPTION = "Simple splash screen application"
HOMEPAGE = "https://git.pengutronix.de/cgit/platsch"
LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1a4c8b8d288b4fc32c3c4830d7a5e169"

SRC_URI = "git://github.com/pengutronix/platsch;protocol=https;branch=master;tag=v${PV}"
S = "${WORKDIR}/git"


DEPENDS = "libdrm"

inherit pkgconfig meson
