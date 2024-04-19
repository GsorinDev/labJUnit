pipeline {

  agent any

  tools {
    maven 'maven'
  }

  stages {

    stage('Get from git project') {
      steps {
        git 'https://github.com/GsorinDev/labJUnit.git'
      }
    }
    stage('Create a new .jar') {

      steps {
        sh 'mvn clean install -DskipTests'
      }
    }

    stage('Test') {
          steps {
            sh 'mvn test'
          }
        }
  }
}