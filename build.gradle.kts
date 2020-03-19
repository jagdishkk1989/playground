buildscript {
  repositories {
    android()
    kotlin()
    trove4j()

    gradlePluginPortal()
    mavenCentral()
  }

  dependencies {
    classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.2.0")

    classpath("com.android.tools.build:gradle:4.0.0-alpha09")
    classpath("com.github.ben-manes:gradle-versions-plugin:0.27.0")
    classpath("com.google.gms:google-services:4.3.3")
    classpath("com.osacky.doctor:doctor-plugin:0.2.0")

    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.70-eap-42")
  }
}

plugins {
  id("androidx.navigation.safeargs.kotlin")
}

subprojects {
  repositories {
    android()
    kotlin()
    trove4j()

    mavenCentral()
    jitpack()
  }
}
