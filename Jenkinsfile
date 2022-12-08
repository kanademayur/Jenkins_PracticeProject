pipeline {
     agent any
     stages{
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t mayurkanade/springboot-1 .'
                }
            }
        }
        stage('Push Selenium Docker Image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'user_id', variable: 'userID'), string(credentialsId: 'dockerhub-pwd', variable: 'pwd')]) {
                    sh 'docker login -u ${userID} -p ${pwd}'

                    sh 'docker push ${userID}/springboot-1'
                    }
                }
            }
        }
      }
    }