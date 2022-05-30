pipeline {
    agent any
    stages {
        stage('Build Clean') {

                       withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                            sh "mvn clean -f pom.xml"
                    }
        }
        stage('Build Compile') {
                       withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                            sh "mvn compile -f pom.xml"

            }
        }
        stage('Build Install') {
                       withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                           sh "mvn install -f pom.xml"
                    }
        }
    }
}