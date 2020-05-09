plugins {
    id(GradlePluginId.KOTLIN_LIBRARY)
    id(GradlePluginId.JAVA_LIBRARY)
}

dependencies {
    implementation(project(ModuleDependency.DATA))

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(LibraryDependency.Kotlin.KOTLIN)
    implementation(LibraryDependency.Coroutines.ANDROID)
    implementation(LibraryDependency.JAVAX_INJECT)
    implementation(LibraryDependency.JAVAX_ANNOTATION)
    implementation(LibraryDependency.Retrofit.RETROFIT)
    implementation(LibraryDependency.Retrofit.GSON)
    implementation(LibraryDependency.Retrofit.MOCK)


}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
