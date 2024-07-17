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
      git {
        id("${REPO_NAME}")
        remote("https://github.com/CCPL-Solutions/${REPO_NAME}.git")
        credentialsId('local-jenkins-private')
        includes('feat-* dev-* develop')
      }
    }
    configure { project ->
        project / sources / data / 'jenkins.branch.BranchSource' {
            strategy(class: 'jenkins.branch.buildstrategies.basic.SkipInitialBuildOnFirstBranchIndexing') {}
        }
    }
    orphanedItemStrategy {
      discardOldItems {
        numToKeep(5)
      }
    }
  }
}