pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Build stage started...'
                bat 'python --version || python3 --version'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'python -m pytest tests/ -v || python3 -m pytest tests/ -v'
            }
        }

        stage('Result') {
            steps {
                echo 'Pipeline completed successfully!'
            }
        }
    }
}
