
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.fkhan.newspage"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fkhan.newspage"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.corKtx)
    implementation(Dependencies.livecycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    //implementation(Dependencies.composeBom)
    implementation(platform("androidx.compose:compose-bom:2023.03.00")) //TODO.
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeGraphics)
    implementation(Dependencies.composeUiToolingPreview)
    implementation(Dependencies.composeMaterial3)
    testImplementation(Dependencies.juint)
    androidTestImplementation(Dependencies.junitExt)
    androidTestImplementation(Dependencies.espresso)
    androidTestImplementation(Dependencies.composeBom)
    androidTestImplementation(Dependencies.uiTest)
    debugImplementation(Dependencies.composeUiTooling)
    debugImplementation(Dependencies.uiTestManifest)

    //utilities module
    implementation(project(Modules.utilities))

    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.kapt)

    implementation(Dependencies.hiltNavigationCompose)

}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}