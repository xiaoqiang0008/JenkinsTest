pipeline {
  agent {
    node {
      label 'master'
    }

  }
  
  tool{
    'maven' 'maven 3.6.3'
  }
  
  stages {
    stage('pull') {
      steps {
        git(url: 'https://github.com/xiaoqiang0008/JenkinsTest.git', branch: 'master', poll: true)
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install'
        
      }
    }

  }
}
