plugins { id("com.android.library") version "9.0.0-alpha12" }

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

dependencies { /* none */ }
