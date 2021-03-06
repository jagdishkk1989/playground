plugins {
  id("com.android.library")

  id("kotlin-android")
  id("kotlin-kapt")
}

android {
  setCompileSdkVersion(29)

  compileOptions {
    setSourceCompatibility(1.8)
    setTargetCompatibility(1.8)
  }

  defaultConfig {
    setMinSdkVersion(21)
    setTargetSdkVersion(29)
  }

  sourceSets {
    main.srcDirs = setOf("src/main/kotlin")
    test.srcDirs = setOf("src/test/kotlin")
  }
}

dependencies {
  implementation("androidx.annotation:annotation:1.1.0")
  implementation("androidx.coordinatorlayout:coordinatorlayout:1.1.0")
  implementation("androidx.databinding:databinding-runtime:4.1.0-alpha04")
  implementation("androidx.lifecycle:lifecycle-livedata-core:2.2.0")
  implementation("androidx.navigation:navigation-fragment-ktx:2.3.0-alpha04")
  implementation("androidx.room:room-runtime:2.2.5")

  implementation("com.google.android.material:material:1.2.0-alpha05")
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4-M1")

  testImplementation("com.google.truth:truth:1.0.1")
  testImplementation("org.junit.jupiter:junit-jupiter:5.6.1")
}
