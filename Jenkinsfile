pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                git 'your_repository_url'
            }
        }
        stage('Build') {
            steps {
                // Build your Maven project
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run Maven tests
                sh 'mvn test'
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