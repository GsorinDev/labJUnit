pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                git 'https://github.com/GsorinDev/labJUnit.git'
            }
        }
        stage('Build') {
            steps {
                withMaven(maven: 'mvn') {
                    // Build your Maven project
                    sh 'mvn clean package'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven: 'mvn') {
                    // Build your Maven project
                    sh 'mvn test'
                }
            }
            post {
                success {
                    // If tests pass, you can proceed with further actions
                    echo 'Tests passed successfully!'
                }
                failure {
                    // If tests fail, you might want to notify someone or take corrective actions
                    echo 'Tests failed!'
                    // You can add more actions here like sending notifications or triggering other jobs
                }
            }
        }
    }
}