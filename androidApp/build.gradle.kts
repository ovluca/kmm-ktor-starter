plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.androidApp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidApp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.gms:play-services-auth:20.5.0")
    implementation("com.facebook.android:facebook-login:latest.release")
    implementation("androidx.core:core-ktx:1.10.1")
}
