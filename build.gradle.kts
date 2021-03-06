plugins {
 id("com.labijie.infra") version Versions.infraPlugin apply false
}

allprojects {
    group = "com.labijie.bom"
    version = "2.6.5"

    infra(isBom = true) {
        useDefault {
            useMavenProxy = false
        }
        useNexusPublish()
    }
}


subprojects {
    infra(isBom = true) {
        if (!project.name.startsWith("dummy")) {
            usePublish {
                description = "maven bom project"
                githubUrl("hongque-pro", "infra-bom")
                artifactId { p-> "${p.name}-dependencies" }
            }

            useGitHubPackages("hongque-pro", "infra-bom")
        }
    }
}