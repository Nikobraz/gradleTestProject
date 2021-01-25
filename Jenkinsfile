node('master') {
    stage('checkout') {
        cleanWs()
        checkout scm
    }
    stage('test') {
        gradleTool = tool name: 'gradle', type: 'gradle'
        sh "ls -lah ${gradleTool}/bin"
        withEnv(["GRADLE_HOME=${gradleTool}", "PATH=${env.PATH}:${gradleTool}/bin"]) {
            sh "gradle clean test"
        }
        allure includeProperties: false, jdk: 'jdk 8u221', results: [[path: 'allure-results']]
    }
    stage('build') {
        withEnv(["GRADLE_HOME=${gradleTool}", "PATH=${env.PATH}:${gradleTool}/bin"]) {
            sh 'gradle fatJar -x test'
        }
    }
}