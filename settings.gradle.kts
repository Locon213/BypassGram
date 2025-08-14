rootProject.name = "BypassGram"

fun tgRoot() = file("upstream/telegram-android")

include(":TMessagesProj")
project(":TMessagesProj").projectDir = tgRoot()

// -------------------------------------
// Если когда-нибудь понадобится собрать
// Play-build или Huawei-build, можно
// вернуть alias-модули тем же приёмом:
// project(":TMessagesProj_AppNative").projectDir = project(":TMessagesProj").projectDir
// -------------------------------------
