rootProject.name = "MidJourneyImagesComposeMultiplatform"

include(":androidApp")
include(":desktopApp")
include(":shared")
include(":wearApp")
include(":televisionApp")
include(":automotiveApp")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }

    plugins {
        val kotlinVersion = "1.9.21"
        val agpVersion = "8.2.2"
        val composeVersion = "1.5.11"

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
