pipeline {
    agent any
    stages {
        stage('Build Clean') {
            env.JAVA_HOME="${tool 'jdk-18.0.1.1'}"
                       withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                            sh "mvn clean -f pom.xml"
                    }
        }
        stage('Build Compile') {
            env.JAVA_HOME="${tool 'jdk-18.0.1.1'}"
                       withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                            sh "mvn compile -f pom.xml"

            }
        }
        stage('Build Install') {
            env.JAVA_HOME="${tool 'jdk-18.0.1.1'}"
                       withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                           sh "mvn install -f pom.xml"
                    }
        }
    }
}