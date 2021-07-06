pipeline {
  agent any
  stages {
    stage('pull') {
      steps {
        git(url: 'https://github.com/xiaoqiang0008/JenkinsTest.git', branch: 'master', poll: true)
      }
    }

    stage('build') {
      steps {
        tool(name: 'maven', type: 'maven 3.6.3')
        sh 'mvn clean install'
      }
    }

  }
}