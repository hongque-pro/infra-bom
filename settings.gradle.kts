rootProject.name = "infra-bom"
include("lib")


pluginManagement {
    repositories {
        maven(url = "../local-plugin-repository")
        mavenLocal()
        gradlePluginPortal()
    }
}

