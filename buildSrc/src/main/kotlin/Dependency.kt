object AndroidX {
    const val CORE_KTX = "androidx.core:core-ktx:1.8.0"
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.5.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"

}

object Android {
    const val MATERIAL = "com.google.android.material:material:1.6.1"
    const val J_UNIT = "androidx.test.ext:junit:1.1.3"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
}

object JetBrains {
    private const val COROUTINE_VERSION = "1.6.1"

    const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$COROUTINE_VERSION"
    const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINE_VERSION"
    const val COROUTINE_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINE_VERSION"

}

object OkHttp {
    private const val RETROFIT_VERSION = "2.9.0"

    const val OKHTTP3 = "com.squareup.okhttp3:okhttp:$RETROFIT_VERSION"
    const val RETROFIT2 = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"
    const val CONVERTER_SCALARS = "com.squareup.retrofit2:converter-scalars:$RETROFIT_VERSION"
    const val ADAPTER_COROUTINE = "tech.thdev:flow-call-adapter-factory:1.0.0"
}

object Compose {
    private const val COMPOSE_VERSION = "1.2.1"

    const val COMPOSE_UI = "androidx.compose.ui:ui:$COMPOSE_VERSION"
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:1.5.1"
    const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
    const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:$COMPOSE_VERSION"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:$COMPOSE_VERSION"
    const val COMPOSE_MATERIAL_ICON_CORE = "androidx.compose.material:material-icons-core:$COMPOSE_VERSION"
    const val COMPOSE_MATERIAL_ICON_EXTENDED = "androidx.compose.material:material-icons-extended:$COMPOSE_VERSION"
    const val COMPOSE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
}

object UnitTest {
    const val J_UNIT = "junit:junit:4.13.2"
}