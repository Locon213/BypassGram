plugins { id("com.android.library") version "8.7.0" }

android {
    namespace = "org.bypassgram.dpi"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
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
