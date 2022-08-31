plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.messageproject"
        minSdk = 23
        targetSdk = 32
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
}

dependencies {
    implementation(AndroidX.CORE_KTX)
    implementation(AndroidX.APPCOMPAT)
    implementation(AndroidX.CONSTRAINT_LAYOUT)

    implementation(Android.J_UNIT)
    implementation(Android.ESPRESSO_CORE)
    implementation(Android.MATERIAL)

    implementation(JetBrains.COROUTINE_CORE)
    implementation(JetBrains.COROUTINE_ANDROID)
    implementation(JetBrains.COROUTINE_TEST)

    implementation(OkHttp.OKHTTP3)
    implementation(OkHttp.RETROFIT2)
    implementation(OkHttp.ADAPTER_COROUTINE)
    implementation(OkHttp.CONVERTER_GSON)
    implementation(OkHttp.CONVERTER_SCALARS)

    implementation(Compose.COMPOSE_ACTIVITY)
    implementation(Compose.COMPOSE_MATERIAL)
    implementation(Compose.COMPOSE_UI)
    implementation(Compose.COMPOSE_FOUNDATION)
    implementation(Compose.COMPOSE_TOOLING)
    implementation(Compose.COMPOSE_VIEWMODEL)
    implementation(Compose.COMPOSE_MATERIAL_ICON_CORE)
    implementation(Compose.COMPOSE_MATERIAL_ICON_EXTENDED)

    implementation(UnitTest.J_UNIT)
}