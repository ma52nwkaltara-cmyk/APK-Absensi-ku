plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "id.nwkalutara.absensi"
    compileSdk = 35

    defaultConfig {
        applicationId = "id.nwkalutara.absensi"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    flavorDimensions += "versi"
    productFlavors {
        create("utama") {
            dimension = "versi"
            applicationId = "id.nwkalutara.absensi"
            resValue("string", "app_name", "Absensi RDMKU")
        }
        create("kedua") {
            dimension = "versi"
            applicationId = "id.nwkalutara.absensi.kedua"
            resValue("string", "app_name", "Absensi RDMKU Kedua")
        }
    }

    buildTypes {
        debug {
            // ID debug juga berbeda dari release, agar bisa dipasang terpisah bila diperlukan.
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
        }
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
}
