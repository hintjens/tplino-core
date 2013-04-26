DESCRIPTION = "Lightweight HTTP(s) and Websockets Server Library"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=aa243523732ab6258fece5095a38dd9f"

SRCREV = "1e5da0fcfde87b7cca48b7698c656d05593db491"
PR = "r0"

SRC_URI = "git://git@git.tpip.net/misultin;protocol=ssh"

S = "${WORKDIR}/git"

inherit tetrapak

python () {
    erlang_def_package("misultin", "misultin*", "ebin priv", "src include test examples", d)
}
