rootProject.name = "MidJourneyImagesComposeMultiplatform"

include(":androidApp")
include(":desktopApp")
include(":shared")
include(":wearApp")
include(":televisionApp")
include(":automotiveApp")
include(":webApp")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }

    plugins {
        val kotlinVersion = "1.9.22"
        val agpVersion = "8.3.0"
        val composeVersion = "1.6.1"

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        id("com.android.library").version(agpVersion)
        id("org.jetbrains.compose").version(composeVersion)
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
