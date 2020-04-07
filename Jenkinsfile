pipeline {
  agent none
  environment {
    DOCKERHUBNAME = "liker163"
  }
  stages {
    stage('maven Build') {
      agent {
        docker {
          image 'maven:3-alpine'
          args '-v /root/.m2:/root/.m2'
        }
      }
      steps {
        sh 'mvn -B -DskipTests clean package'
        // sh 'mvn package -Dmaven.test.skip=true'
        // sh 'mvn clean package'
      }
    }

    stage('docker build & push & run') {
      agent any
      steps {
          sh 'docker container rm -f $(docker container ls -q --filter name=.*seataorder.*)'
          sh 'docker image rm -f $(docker image ls -q *${DOCKERHUBNAME}/torder*)'
          sh 'docker image build -t ${DOCKERHUBNAME}/torder .'
          sh 'docker run -d -p 8180:8180 --name seataorder ${DOCKERHUBNAME}/torder'
      }
    }

    stage('clean workspace') {
      agent any
      steps {
        // clean workspace after job finished
        cleanWs()
      }
    }
  }
}
