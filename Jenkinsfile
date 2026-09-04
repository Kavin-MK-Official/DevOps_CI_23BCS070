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
                bat 'if exist build rmdir /s /q build'
                bat 'mkdir build'
                bat 'javac -d build src\\TemperatureConverter.java tests\\TemperatureConverterTest.java'
            }
        }
        stage('Test') {
            steps {
                bat 'java -cp build TemperatureConverterTest'
            }
        }
        stage('Result') {
            steps {
                bat 'git log -1 --oneline'
                echo 'CI RESULT: SUCCESS'
            }
        }
    }
}
