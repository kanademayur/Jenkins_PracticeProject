pipeline {
     agent any
     tools{
         maven "maven3.6.3"
     }
     stages{
        stage('Build Maven'){
             steps{
                 checkout([$class: 'GitSCM', branches: [[name: '*/selenium']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kanademayur/Jenkins_PracticeProject']]])
                 sh 'mvn clean install'
               }
            }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t mayurkanade/selenium-docker .'
                }
            }
        }
        stage('Push Docker Image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'user_id', variable: 'userName'), string(credentialsId: 'dockerhub-pwd', variable: 'password')]) {
                    sh 'docker login -u ${userName} -p ${password}'
                    }
                    sh 'docker push mayurkanade/selenium-docker'
                }
            }
        }
      }
    }