DESCRIPTION = "iris"
SECTION = "net"
LICENSE = "CLOSED & MIT"
LIC_FILES_CHKSUM = "file://src/iris_esme.erl;beginline=1;endline=28;md5=9ce15051e0553845ff2a71e49388ffcb"

SRCREV= "e36b2d99c574fc3ab6b3831d70a7080afe1223b6"
PR = "r1"

SRC_URI = "git://git@git.tpip.net/iris.git;protocol=ssh"

S = "${WORKDIR}/git"

inherit tetrapak

DEPENDS = "erlang-oserl"
RDEPENDS_${PN} = "erlang-oserl erlang-edoc"

python () {
    erlang_def_package("iris", "iris*", "ebin priv", "NEWS.md .arcconfig src", d)
}
