
plugins {
    id(GradlePluginId.KTLINT_GRADLE)
    id(GradlePluginId.GRADLE_VERSION_PLUGIN)
    id(GradlePluginId.KOTLIN_JVM) apply false
    id(GradlePluginId.KOTLIN_ANDROID) apply false
    id(GradlePluginId.KOTLIN_ANDROID_EXTENSIONS) apply false
    id(GradlePluginId.ANDROID_APPLICATION) apply false
    id(GradlePluginId.ANDROID_DYNAMIC_FEATURE) apply false
    id(GradlePluginId.ANDROID_LIBRARY) apply false
    id(GradlePluginId.SAFE_ARGS) apply false
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }

    // We want to apply ktlint at all project level because it also checks build gradle files
    apply(plugin = GradlePluginId.KTLINT_GRADLE)

    // Ktlint configuration for sub-projects
    ktlint {
        version.set(CoreVersion.KTLINT)
        verbose.set(true)
        android.set(true)

        // Uncomment below line and run .\gradlew ktlintCheck to see check ktlint experimental rules
//         enableExperimentalRules.set(true)

        reporters {
            reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
        }

        filter {
            exclude { element -> element.file.path.contains("generated/") }
        }
    }
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint") // Version should be inherited from parent

    // Optionally configure plugin
    ktlint {
        debug.set(true)
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
