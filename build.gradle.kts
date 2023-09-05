// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        val hiltVersion = "2.48"
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
    }
}


plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false

    // Hilt
    id("com.google.dagger.hilt.android") version "2.44" apply false


//    //To configure the Hilt Gradle plugin with Gradle's new plugins DSL
//    id("com.google.dagger.hilt.android") version "2.44" apply false
//
//    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
////    id("com.google.dagger.hilt.android") version "2.41" apply false

//    id("com.google.dagger.hilt.android") version ("2.48") apply false

}