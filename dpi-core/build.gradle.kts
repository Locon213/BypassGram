plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.bypassgram.dpi"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
        targetSdk = 35
        ndk { abiFilters += listOf("arm64-v8a", "armeabi-v7a", "x86_64") }
        externalNativeBuild.cmake.cppFlags += "-std=c11 -DANDROID"
    }

    externalNativeBuild.cmake {
        path = file("src/main/cpp/CMakeLists.txt")
        version = "3.28.0"
    }

    publishing {
        singleVariant("release") { withSourcesJar() }
    }
}

kotlin {
    jvmToolchain(21)
}

dependencies { /* none */ }
