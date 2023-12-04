object Dependencies {
    val corKtx by lazy {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val livecycleRuntimeKtx by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUi by lazy {"androidx.compose.ui:ui"}
    val composeGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val composeUiToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial3 by lazy {"androidx.compose.material3:material3"}
    val juint by lazy {"junit:junit:${Versions.junit}"}
    val junitExt by lazy {"androidx.test.ext:junit:${Versions.junitExt}"}
    val espresso by lazy {"androidx.test.espresso:espresso-core:${Versions.espresso}"}
    val uiTest by lazy {"androidx.compose.ui:ui-test-junit4"}
    val composeUiTooling by lazy {"androidx.compose.ui:ui-tooling"}
    val uiTestManifest by lazy {"androidx.compose.ui:ui-test-manifest"}

    val hiltAndroid by lazy {"com.google.dagger:hilt-android:${Versions.hilt}"}
    val kapt by lazy {"com.google.dagger:hilt-android-compiler:${Versions.hilt}"}

    val hiltNavigationCompose by lazy {"androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"}
}

object Modules {
    const val utilities = ":utilities"
}
