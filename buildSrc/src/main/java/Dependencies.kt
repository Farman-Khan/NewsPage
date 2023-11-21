import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.support.delegates.DependencyHandlerDelegate

object Dependencies {
    val corKtx by lazy {"androidx.core:core-ktx:1.12.0"}
    val livecycleRuntimeKtx by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:2.6.2"}
    val activityCompose by lazy {"androidx.activity:activity-compose:1.8.1"}
    val composeBom by lazy { "androidx.compose:compose-bom:2023.03.00"}
    val composeUi by lazy {"androidx.compose.ui:ui"}
    val composeGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val composeUiToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial3 by lazy {"androidx.compose.material3:material3"}
    val juint by lazy {"junit:junit:4.13.2"}
    val junitExt by lazy {"androidx.test.ext:junit:1.1.5"}
    val espresso by lazy {"androidx.test.espresso:espresso-core:3.5.1"}
    val uiTest by lazy {"androidx.compose.ui:ui-test-junit4"}
    val composeUiTooling by lazy {"androidx.compose.ui:ui-tooling"}
    val uiTestManifest by lazy {"androidx.compose.ui:ui-test-manifest"}
}
