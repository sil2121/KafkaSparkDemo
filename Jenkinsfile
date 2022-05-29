pipeline {
    agent any
    tools {
       maven 'MAVEN_HOME'
       jdk 'JAVA_HOME'
    }
    stages {
        stage('Build Clean') {
            steps {
                sh 'mvn clean -f pom.xml'
            }
        }
        stage('Build Compile') {
            steps {
                sh 'mvn compile -f pom.xml'
            }
        }
        stage('Build Install') {
            steps {
                sh 'mvn install -f pom.xml'
            }
        }
    }
}