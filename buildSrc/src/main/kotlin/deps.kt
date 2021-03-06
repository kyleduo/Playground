/**
 * @author zhangduo on 3/24/21
 */

private object Versions {
    const val kotlin = "1.3.47"
    const val androidx = "1.3.2"
    const val appcompat = "1.2.0"
    const val junit = "4.13.2"
    const val junit5 = "5.4.0"
    const val androidxTestExtJunit = "1.1.2"
    const val espresso = "3.3.0"
    const val recyclerview = "1.1.0"
    const val constraintlayout = "2.0.4"
    const val coroutines = "1.4.2"
    const val lifecycleRuntimeKtx = "2.3.0"
    const val okio = "2.10.0"
    const val multitype = "4.2.0"
    const val retrofit = "2.9.0"
    const val mockk = "1.10.6"
}

object Dependencies {
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val junit = "junit:junit:${Versions.junit}"
    const val junit5JupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junit5JupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    const val junit5JupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junit5}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val okio = "com.squareup.okio:okio:${Versions.okio}"
    const val multitype = "com.drakeet.multitype:multitype:${Versions.multitype}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitScalarsConverter = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"


    val androidx = AndroidX()

    class AndroidX {

        val coreKtx = "androidx.core:core-ktx:${Versions.androidx}"
        val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        val testExtJunit = "androidx.test.ext:junit:${Versions.androidxTestExtJunit}"
        val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
        val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
        val lifetimeRuntimeKtx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
    }
}