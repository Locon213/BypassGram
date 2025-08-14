

pluginManagement {
    repositories {
        google()            
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "BypassGram"

fun tgRoot() = file("upstream/telegram-android")

include(":TMessagesProj")
project(":TMessagesProj").projectDir = tgRoot()
