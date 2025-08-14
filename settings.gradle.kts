rootProject.name = "BypassGram"

fun tlg(path: String) = file("upstream/telegram-android/$path")

include(":TMessagesProj")
project(":TMessagesProj").projectDir = tlg("TMessagesProj")

include(":TMessagesProj_AppStandalone")
project(":TMessagesProj_AppStandalone").projectDir = project(":TMessagesProj").projectDir

include(":TMessagesProj_AppNative")
project(":TMessagesProj_AppNative").projectDir = project(":TMessagesProj").projectDir

include(":dpi-core")
