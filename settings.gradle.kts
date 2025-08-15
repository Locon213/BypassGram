

pluginManagement {
    repositories {
        google()            
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "BypassGram"

fun tgRoot() = file("upstream/telegram-android")

include(":TMessagesProj")
project(":TMessagesProj").projectDir = tgRoot()
include(":TMessagesProj_AppStandalone")
project(":TMessagesProj_AppStandalone").projectDir = project(":TMessagesProj").projectDir
