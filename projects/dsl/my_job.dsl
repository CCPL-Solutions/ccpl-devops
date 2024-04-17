folder('CCPLSolutions') {
  displayName('CCPLSolutions')
  description('Folder for CCPLSolutions')
}

folder("CCPLSolutions/${PROJECT_NAME}") {
  multibranchPipelineJob("CCPLSolutions/${PROJECT_NAME}/${REPO_NAME}") {
    branchSources {
      branchSource {
        source {
          git {
            id('sample-app')
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
    configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
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
  }
}