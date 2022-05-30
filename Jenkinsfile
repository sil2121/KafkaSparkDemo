pipeline {
    agent any
    stages {
        stage('Build Clean') {
                           steps {
                                              sh '/home/silwang/maven/Maven/apache-maven-3.8.5/bin/mvn clean -f pom.xml'
                                                                                  }

        }
        stage('Build Compile') {
                           steps {
                                           sh '/home/silwang/maven/Maven/apache-maven-3.8.5/bin/mvn compile -f pom.xml'
                                       }


        }
        stage('Build Install') {
                          steps {
                                          sh '/home/silwang/maven/Maven/apache-maven-3.8.5/bin/mvn install -f pom.xml'
                                      }

        }
    }
}