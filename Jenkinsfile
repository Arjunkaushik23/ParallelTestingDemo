pipeline {
    agent any
    tools {
        maven 'maven' // Use the name you have configured for Maven
        jdk 'jdk-22' // Use the name you have configured for JDK
    }
    stages {
        stage('Build') {
            steps {
                // Compile the project
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests using testng.xml
                bat 'mvn test -DsuiteXmlFile=src/test/resources/testng.xml'
            }
        }
    }
    post {
        always {
            // Archive test results
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
