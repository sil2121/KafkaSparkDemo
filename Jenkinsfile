pipeline {
    agent any
    stages {
        stage('Build Clean') {
                           steps {
                                            sh 'printenv'
                                        }

        }
        stage('Build Compile') {
                           steps {
                                           sh 'mvn compile -f pom.xml'
                                       }


        }
        stage('Build Install') {
                          steps {
                                          sh 'mvn clean -f pom.xml'
                                      }

        }
    }
}