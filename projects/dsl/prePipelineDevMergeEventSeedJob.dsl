folder('CCPLSolutions') {
    displayName('CCPLSolutions')
    description('CCPLSolutions')
}

folder("CCPLSolutions/PrePipelines") {
    pipelineJob('CCPLSolutions/PrePipelines/DevMergeEvent') {
        description('')
        parameters {
            stringParam('REPO_NAME', '', 'Repository name')
            stringParam('REPO_BRANCH', '', 'Repository branch')
            stringParam('CATEGORY', 'ms', 'Category')
        }
        keepDependencies(false)
        properties {
            buildDiscarder {
                strategy {
                    logRotator {
                        daysToKeepStr('3')
                        numToKeepStr('5')
                        artifactDaysToKeepStr('-1')
                        artifactNumToKeepStr('-1')
                    }
                }
            }
        }
        triggers {
            genericTrigger {
                genericVariables {
                    genericVariable {
                        key('REPO_NAME')
                        value('$.repository.name')
                        expressionType('JSONPath')
                        regexpFilter("")
                    }
                    genericVariable {
                        key('REPO_BRANCH')
                        value('$.ref')
                        expressionType('JSONPath')
                        regexpFilter("")
                    }
                    genericVariable {
                        key('ref')
                        value('$.ref')
                        expressionType('JSONPath')
                        regexpFilter("")
                    }
                    genericVariable {
                        key('commits')
                        value('$.commits[*]')
                        expressionType('JSONPath')
                        regexpFilter("")
                    }
                }
                token('prePipelineDevMergeEvent')
                regexpFilterText('$ref $commits')
                regexpFilterExpression('^refs\\/heads\\/(develop|dev-).*\\[\\{.*$')
                causeString('Generic Cause')
            }
        }
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url('https://github.com/CCPL-Solutions/ccpl-devops.git')
                            credentials('local-jenkins-private')
                        }
                        branches('*/master')
                        scriptPath('projects/prePipelines/DevMergeEvent/Jenkinsfile')
                        extensions {}
                    }
                }
                lightweight(true)
            }
        }
        disabled(false)
    }
}