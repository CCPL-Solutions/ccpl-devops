folder('CCPLSolutions') {
  displayName('CCPLSolutions')
  description('CCPLSolutions')
}

folder("CCPLSolutions/${PROJECT_NAME}") {
  displayName("${PROJECT_NAME}")
  description("Carpeta base para componentes asociados al proyecto ${PROJECT_NAME}")
}

folder("CCPLSolutions/${PROJECT_NAME}/${CATEGORY}") {
  multibranchPipelineJob("CCPLSolutions/${PROJECT_NAME}/${CATEGORY}/${REPO_NAME}") {
    branchSources {
      branchSource {
        source {
          git {
            id("${REPO_NAME}")
            remote("https://github.com/CCPL-Solutions/${REPO_NAME}.git")
            credentialsId('local-jenkins-private')
          }
        }
        strategy {
          defaultBranchPropertyStrategy {
            props {
              noTriggerBranchProperty()
            }
          }
        }
      }
    }
    factory {
      workflowBranchProjectFactory {
        scriptPath('Jenkinsfile')
      }
    }
    orphanedItemStrategy {
      discardOldItems {
        numToKeep(5)
      }
    }
    configure { node ->
      def traitsNode = node / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traitsNode << 'jenkins.plugins.git.traits.WildcardSCMSourceFilterTrait' {
        includes('develop dev-* feat-*')
        excludes('')
      }
      traitsNode << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
    }
  }
}
