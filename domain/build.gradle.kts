plugins {
    id(GradlePluginId.KOTLIN_LIBRARY)
    id(GradlePluginId.JAVA_LIBRARY)
    id(GradlePluginId.KTLINT_GRADLE)
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(LibraryDependency.Kotlin.KOTLIN)
    implementation(LibraryDependency.Coroutines.ANDROID)
    implementation(LibraryDependency.JAVAX_INJECT)
    implementation(LibraryDependency.JAVAX_ANNOTATION)


}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
