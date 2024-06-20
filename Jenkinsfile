pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Compile the project
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            parallel {
                stage('Test1') {
                    steps {
                        // Run first set of tests
                        bat 'mvn test -DsuiteXmlFile=src/test/resources/testng.xml -Dtest=com.example.testing.ExampleTest1'
                    }
                }
                stage('Test2') {
                    steps {
                        // Run second set of tests
                        bat 'mvn test -DsuiteXmlFile=src/test/resources/testng.xml -Dtest=com.example.testing.ExampleTest2'
                    }
                }
                stage('Test3') {
                    steps {
                        // Run third set of tests
                        bat 'mvn test -DsuiteXmlFile=src/test/resources/testng.xml -Dtest=com.example.testing.ExampleTest3'
                    }
                }
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
