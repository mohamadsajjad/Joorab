plugins {
    alias(libs.plugins.joorab.android.application)
    alias(libs.plugins.joorab.android.application.compose)
    alias(libs.plugins.joorab.android.application.flavors)
    alias(libs.plugins.joorab.android.application.jacoco)
    alias(libs.plugins.joorab.android.hilt)
    alias(libs.plugins.joorab.android.application.firebase)

    //id("com.google.android.gms.oss-licenses-plugin")
    //alias(libs.plugins.baselineprofile)
    //alias(libs.plugins.roborazzi)

    //alias(libs.plugins.android.application)
    //alias(libs.plugins.ksp)
}

android {
    namespace = "com.joorab"

    defaultConfig {
        applicationId = "com.joorab"
        versionCode = 1
        versionName = "0.1.0"

        testInstrumentationRunner = "com.joorab.core.testing.TestRunner"
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

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    //implementation(projects.feature.interests)
    //implementation(projects.feature.foryou)
    //implementation(projects.feature.bookmarks)
    //implementation(projects.feature.topic)
    //implementation(projects.feature.search)
    //implementation(projects.feature.settings)

    //implementation(projects.core.common)
    //implementation(projects.core.ui)
    //implementation(projects.core.designsystem)
    //implementation(projects.core.data)
    //implementation(projects.core.model)
    //implementation(projects.core.analytics)
    //implementation(projects.sync.work)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3.adaptive)
    implementation(libs.androidx.compose.material3.adaptive.layout)
    implementation(libs.androidx.compose.material3.adaptive.navigation)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.compose.runtime.tracing)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.profileinstaller)
    implementation(libs.androidx.tracing.ktx)
    implementation(libs.androidx.window.core)
    implementation(libs.kotlinx.coroutines.guava)
    implementation(libs.coil.kt)

    ksp(libs.hilt.compiler)

    debugImplementation(libs.androidx.compose.ui.testManifest)
    //debugImplementation(projects.uiTestHiltManifest)

    //kspTest(libs.hilt.compiler)

    //testImplementation(projects.core.dataTest)
    //testImplementation(projects.core.testing)
    //testImplementation(projects.sync.syncTest)
    testImplementation(libs.androidx.compose.ui.test)
    testImplementation(libs.androidx.work.testing)
    testImplementation(libs.hilt.android.testing)

    //testDemoImplementation(libs.robolectric)
    //testDemoImplementation(libs.roborazzi)
    //testDemoImplementation(projects.core.screenshotTesting)

    //androidTestImplementation(projects.core.testing)
    //androidTestImplementation(projects.core.dataTest)
    //androidTestImplementation(projects.core.datastoreTest)
    androidTestImplementation(libs.androidx.test.espresso.core)
    androidTestImplementation(libs.androidx.navigation.testing)
    androidTestImplementation(libs.androidx.compose.ui.test)
    androidTestImplementation(libs.hilt.android.testing)

    //baselineProfile(projects.benchmarks)


}

//baselineProfile {
//    // Don't build on every iteration of a full assemble.
//    // Instead enable generation directly for the release build variant.
//    automaticGenerationDuringBuild = false
//}
//
//dependencyGuard {
//    configuration("prodReleaseRuntimeClasspath")
//}
//