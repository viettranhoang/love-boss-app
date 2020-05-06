@file:Suppress("detekt.StringLiteralDuplication")

private object LibraryVersion {
    const val KODEIN = "6.5.5"
    const val RETROFIT = "2.7.1"
    const val OK_HTTP = "4.3.1"
    const val STETHO = "1.5.0"
    const val TIMBER = "4.7.1"
    const val PLAY_CORE = "1.6.4"
    const val APP_COMPAT = "1.1.0"
    const val RECYCLER_VIEW = "1.1.0"
    const val COORDINATOR_LAYOUT = "1.1.0"

    // 1.1.x version is required in order to support the dark theme functionality in
    // Android Q (adds Theme.MaterialComponents.DayNight)
    const val MATERIAL = "1.1.0-alpha09"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val CORE_KTX = "1.1.0"
    const val FRAGMENT_KTX = "1.1.0"
    const val LIFECYCLE = "1.1.1"
    const val LIFECYCLE_VIEW_MODEL_KTX = "2.1.0"
    const val COIL = "0.9.1"
    const val K_ANDROID = "0.8.8@aar"
    const val LOTTIE = "3.3.1"

    const val COROUTINES = "1.3.3"
    const val JAVAX_INJECT = "1"
    const val JAVAX_ANNOTATION = "1.0"

    const val RX_JAVA2 = "2.2.19"
    const val RX_ANDROID = "2.1.1"
}

object LibraryDependency {

    // Required by Android dynamic feature modules and SafeArgs
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${CoreVersion.KOTLIN}"
    const val KODEIN = "org.kodein.di:kodein-di-generic-jvm:${LibraryVersion.KODEIN}"
    const val KODEIN_ANDROID_X = "org.kodein.di:kodein-di-framework-android-x:${LibraryVersion.KODEIN}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibraryVersion.RETROFIT}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${LibraryVersion.RETROFIT}"

    // Retrofit will use okhttp 4 (it tas binary capability with okhttp 3)
    // See: https://square.github.io/okhttp/upgrading_to_okhttp_4/
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${LibraryVersion.OK_HTTP}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${LibraryVersion.OK_HTTP}"
    const val STETHO = "com.facebook.stetho:stetho:${LibraryVersion.STETHO}"
    const val STETHO_OK_HTTP = "com.facebook.stetho:stetho-okhttp3:${LibraryVersion.STETHO}"
    const val TIMBER = "com.jakewharton.timber:timber:${LibraryVersion.TIMBER}"
    const val PLAY_CORE = "com.google.android.play:core:${LibraryVersion.PLAY_CORE}"
    const val MATERIAL = "com.google.android.material:material:${LibraryVersion.MATERIAL}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${CoreVersion.COROUTINES_ANDROID}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${LibraryVersion.FRAGMENT_KTX}"

    const val NAVIGATION_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${CoreVersion.NAVIGATION}"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${CoreVersion.NAVIGATION}"
    const val COIL = "io.coil-kt:coil:${LibraryVersion.COIL}"
    const val K_ANDROID = "com.pawegio.kandroid:kandroid:${LibraryVersion.K_ANDROID}"
    const val LOTTIE = "com.airbnb.android:lottie:${LibraryVersion.LOTTIE}"

    const val JAVAX_INJECT = "javax.inject:javax.inject:${LibraryVersion.JAVAX_INJECT}"
    const val JAVAX_ANNOTATION = "javax.annotation:jsr250-api:${LibraryVersion.JAVAX_ANNOTATION}"



    object Ui {
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${LibraryVersion.CONSTRAINT_LAYOUT}"
        const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${LibraryVersion.RECYCLER_VIEW}"
        const val COORDINATOR_LAYOUT = "androidx.coordinatorlayout:coordinatorlayout:${LibraryVersion.COORDINATOR_LAYOUT}"

    }

    object Support {

    }

    object Fragment {

    }

    object Glide {

    }

    object Kotlin {
        const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersion.KOTLIN}"

    }

    object Core {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${LibraryVersion.APP_COMPAT}"
        const val CORE_KTX = "androidx.core:core-ktx:${LibraryVersion.CORE_KTX}"

    }

    object Retrofit {

    }

    object Dagger {

    }

    object Rx {
        const val RX_JAVA2 = "io.reactivex.rxjava2:rxjava:${LibraryVersion.RX_JAVA2}"
        const val RX_ANDROID = "io.reactivex.rxjava2:rxandroid:${LibraryVersion.RX_ANDROID}"
    }

    object Lifecycle {
        const val EXTENSIONS = "android.arch.lifecycle:extensions:${LibraryVersion.LIFECYCLE}"
        const val VIEW_MODEL_KTX =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.LIFECYCLE_VIEW_MODEL_KTX}"
    }

    object Coroutines {
        const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryVersion.COROUTINES}"
        const val TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${LibraryVersion.COROUTINES}"
    }


}
