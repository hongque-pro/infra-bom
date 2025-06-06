plugins {
 id("com.labijie.infra") version Versions.infraPlugin apply true
}


allprojects {
    group = "com.labijie.bom"
    version = Versions.spring_boot_version

    infra(isBom = true) {
        useDefault {
            useMavenProxy = false
            //addHongQueGitHubPackages()
        }
    }
}


subprojects {
    infra(isBom = true) {
        if (!project.name.startsWith("dummy")) {
            publishing {
                pom {
                    description = "maven bom project"
                    githubUrl("hongque-pro", "infra-bom")
                    artifactId { p-> "${p.name}-dependencies" }
                }

                toGithubPackages("hongque-pro", "infra-bom")
            }
        }
    }
}